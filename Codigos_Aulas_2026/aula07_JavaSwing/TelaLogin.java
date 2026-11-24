package aula07_JavaSwing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.awt.geom.Ellipse2D;
import java.util.Map;

/**
 * Tela de login para sistema desktop.
 *
 * Melhorias em relação à versão original:
 *  - Layout responsivo com gerenciadores (BorderLayout / GridBagLayout) no lugar de setLayout(null)
 *  - Painel de identidade visual (esquerda) + painel de formulário (direita)
 *  - Paleta de cores consistente (azul / slate)
 *  - Microinterações: hover e clique nos botões, brilho de foco nos campos, placeholder,
 *    mostrar/ocultar senha, aviso de Caps Lock, mensagens com fade, spinner de carregamento,
 *    "tremida" da janela em caso de erro e fundo animado suavemente.
 *
 * Credenciais de demonstração: admin / 1234  (substitua pelo seu acesso a banco/serviço).
 */
public class TelaLogin extends JFrame {

    // ======================= PALETA DE CORES =======================
    static final Color AZUL_ESCURO     = new Color(0x0F172A);
    static final Color AZUL_MEDIO      = new Color(0x1E3A8A);
    static final Color PRIMARIA        = new Color(0x2563EB);
    static final Color PRIMARIA_HOVER  = new Color(0x1D4ED8);
    static final Color PRIMARIA_PRESS  = new Color(0x1E40AF);
    static final Color FUNDO           = new Color(0xF8FAFC);
    static final Color SUPERFICIE      = Color.WHITE;
    static final Color CAMPO_FUNDO     = new Color(0xF1F5F9);
    static final Color TEXTO           = new Color(0x0F172A);
    static final Color TEXTO_SUAVE     = new Color(0x64748B);
    static final Color PLACEHOLDER     = new Color(0x94A3B8);
    static final Color BORDA           = new Color(0xCBD5E1);
    static final Color ERRO            = new Color(0xDC2626);
    static final Color SUCESSO         = new Color(0x16A34A);
    static final Color AVISO           = new Color(0xD97706);

    // ======================= UTILITÁRIOS =======================
    static Font fonte(int estilo, int tamanho) {
        return new Font("Segoe UI", estilo, tamanho);
    }

    static Color mix(Color a, Color b, float t) {
        t = Math.max(0f, Math.min(1f, t));
        return new Color(
                Math.round(a.getRed()   + (b.getRed()   - a.getRed())   * t),
                Math.round(a.getGreen() + (b.getGreen() - a.getGreen()) * t),
                Math.round(a.getBlue()  + (b.getBlue()  - a.getBlue())  * t));
    }

    static Graphics2D suave(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        return g2;
    }

    static JLabel rotulo(String texto, int estilo, int tamanho, Color cor) {
        JLabel l = new JLabel(texto);
        l.setFont(fonte(estilo, tamanho));
        l.setForeground(cor);
        return l;
    }

    /** Valor animado de 0 a 1 que se move suavemente em direção a um alvo. */
    static class Transicao {
        private float valor = 0f, alvo = 0f;
        private final float passo;
        private final Timer timer;

        Transicao(JComponent alvoRepaint, float passo) {
            this.passo = passo;
            timer = new Timer(15, e -> {
                if (Math.abs(alvo - valor) <= this.passo) {
                    valor = alvo;
                    ((Timer) e.getSource()).stop();
                } else {
                    valor += Math.signum(alvo - valor) * this.passo;
                }
                alvoRepaint.repaint();
            });
        }

        void ir(float novoAlvo) {
            alvo = novoAlvo;
            if (!timer.isRunning()) timer.start();
        }

        void definir(float v) { valor = v; alvo = v; }

        /** Valor com suavização (smoothstep). */
        float get() { return valor * valor * (3f - 2f * valor); }
    }

    // ======================= BOTÃO ANIMADO =======================
    static class Botao extends JButton {
        private final boolean primario;
        private final Transicao hover = new Transicao(this, 0.12f);
        private final Transicao clique = new Transicao(this, 0.30f);
        private final Timer giro;
        private float angulo;
        private boolean carregando;

        Botao(String texto, boolean primario) {
            super(texto);
            this.primario = primario;
            setFont(fonte(Font.BOLD, 14));
            setContentAreaFilled(false);
            setBorderPainted(false);
            setFocusPainted(false);
            setOpaque(false);
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            setPreferredSize(new Dimension(150, 50));

            giro = new Timer(20, e -> { angulo = (angulo + 14) % 360; repaint(); });

            addMouseListener(new MouseAdapter() {
                @Override public void mouseEntered(MouseEvent e)  { if (isEnabled()) hover.ir(1); }
                @Override public void mouseExited(MouseEvent e)   { hover.ir(0); }
                @Override public void mousePressed(MouseEvent e)  { if (isEnabled()) clique.ir(1); }
                @Override public void mouseReleased(MouseEvent e) { clique.ir(0); }
            });
            addFocusListener(new FocusAdapter() {
                @Override public void focusGained(FocusEvent e) { repaint(); }
                @Override public void focusLost(FocusEvent e)   { repaint(); }
            });
        }

        void setCarregando(boolean c) {
            carregando = c;
            if (c) giro.start(); else giro.stop();
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = suave(g);
            float h = hover.get(), p = clique.get();
            int w = getWidth(), alturaCorpo = getHeight() - 4;
            int y = Math.round(p * 2);

            Color fundo, texto;
            if (primario) {
                fundo = mix(mix(PRIMARIA, PRIMARIA_HOVER, h), PRIMARIA_PRESS, p);
                texto = Color.WHITE;
                // sombra que "levanta" o botão no hover
                g2.setColor(new Color(37, 99, 235, (int) (70 * h * (1 - p))));
                g2.fillRoundRect(3, 5, w - 6, alturaCorpo, 12, 12);
            } else {
                fundo = mix(mix(SUPERFICIE, new Color(0xEFF6FF), h), new Color(0xDBEAFE), p);
                texto = mix(TEXTO_SUAVE, PRIMARIA, h);
            }

            g2.setColor(fundo);
            g2.fillRoundRect(0, y, w, alturaCorpo, 12, 12);

            if (!primario) {
                g2.setColor(mix(BORDA, PRIMARIA, h));
                g2.setStroke(new BasicStroke(1.5f));
                g2.drawRoundRect(1, y + 1, w - 3, alturaCorpo - 3, 12, 12);
            }

            // anel de foco por teclado
            if (hasFocus() && !carregando) {
                g2.setColor(new Color(37, 99, 235, 120));
                g2.setStroke(new BasicStroke(2f));
                g2.drawRoundRect(-1, y - 1, w + 1, alturaCorpo + 1, 14, 14);
            }

            if (carregando) {
                int d = 20, cx = w / 2 - d / 2, cy = y + alturaCorpo / 2 - d / 2;
                g2.setColor(new Color(255, 255, 255, 70));
                g2.setStroke(new BasicStroke(2.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                g2.drawOval(cx, cy, d, d);
                g2.setColor(Color.WHITE);
                g2.drawArc(cx, cy, d, d, (int) -angulo, 100);
            } else {
                g2.setFont(getFont());
                FontMetrics fm = g2.getFontMetrics();
                int tx = (w - fm.stringWidth(getText())) / 2;
                int ty = y + (alturaCorpo - fm.getHeight()) / 2 + fm.getAscent();
                g2.setColor(texto);
                g2.drawString(getText(), tx, ty);
            }
            g2.dispose();
        }
    }

    // ======================= LINK COM HOVER =======================
    static class Link extends JLabel {
        Link(String texto) {
            super(texto);
            Font normal = fonte(Font.BOLD, 13);
            Font sublinhada = normal.deriveFont(Map.of(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON));
            setFont(normal);
            setForeground(PRIMARIA);
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            addMouseListener(new MouseAdapter() {
                @Override public void mouseEntered(MouseEvent e) { setFont(sublinhada); setForeground(PRIMARIA_HOVER); }
                @Override public void mouseExited(MouseEvent e)  { setFont(normal);     setForeground(PRIMARIA); }
            });
        }
    }

    // ======================= CAMPO DE TEXTO / SENHA =======================
    static class Campo extends JPanel {
        final JTextField entrada;
        private final String placeholder;
        private final Transicao foco = new Transicao(this, 0.14f);
        private final Transicao hover = new Transicao(this, 0.14f);
        private final Transicao erro = new Transicao(this, 0.14f);

        Campo(String placeholder, boolean senha) {
            super(new BorderLayout(10, 0));
            this.placeholder = placeholder;
            setOpaque(false);
            setBorder(new EmptyBorder(0, 16, 0, 16));
            setPreferredSize(new Dimension(380, 48));
            setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

            entrada = senha ? new JPasswordField() : new JTextField();
            entrada.setOpaque(false);
            entrada.setBorder(null);
            entrada.setFont(fonte(Font.PLAIN, 15));
            entrada.setForeground(TEXTO);
            entrada.setCaretColor(PRIMARIA);
            entrada.setSelectionColor(new Color(0xBFDBFE));
            entrada.setSelectedTextColor(TEXTO);
            add(entrada, BorderLayout.CENTER);

            if (senha) {
                JPasswordField pf = (JPasswordField) entrada;
                char eco = pf.getEchoChar();
                Link alternar = new Link("Mostrar");
                alternar.setFont(fonte(Font.BOLD, 12));
                alternar.setForeground(TEXTO_SUAVE);
                alternar.addMouseListener(new MouseAdapter() {
                    @Override public void mouseClicked(MouseEvent e) {
                        boolean visivel = pf.getEchoChar() == 0;
                        pf.setEchoChar(visivel ? eco : (char) 0);
                        alternar.setText(visivel ? "Mostrar" : "Ocultar");
                        pf.requestFocusInWindow();
                    }
                });
                add(alternar, BorderLayout.EAST);
            }

            entrada.addFocusListener(new FocusAdapter() {
                @Override public void focusGained(FocusEvent e) { foco.ir(1); }
                @Override public void focusLost(FocusEvent e)   { foco.ir(0); }
            });

            MouseAdapter mouse = new MouseAdapter() {
                @Override public void mouseEntered(MouseEvent e) { hover.ir(1); }
                @Override public void mouseExited(MouseEvent e) {
                    Point p = SwingUtilities.convertPoint((Component) e.getSource(), e.getPoint(), Campo.this);
                    if (!Campo.this.contains(p)) hover.ir(0);
                }
                @Override public void mousePressed(MouseEvent e) { entrada.requestFocusInWindow(); }
            };
            addMouseListener(mouse);
            entrada.addMouseListener(mouse);
        }

        String texto() {
            return entrada instanceof JPasswordField pf ? new String(pf.getPassword()) : entrada.getText();
        }

        void limpar() { entrada.setText(""); }

        void setErro(boolean e) { erro.ir(e ? 1 : 0); }

        void bloquear(boolean b) {
            entrada.setEditable(!b);
            setCursor(Cursor.getPredefinedCursor(b ? Cursor.DEFAULT_CURSOR : Cursor.TEXT_CURSOR));
        }

        void aoAlterar(Runnable r) {
            entrada.getDocument().addDocumentListener(new DocumentListener() {
                public void insertUpdate(DocumentEvent e)  { r.run(); repaint(); }
                public void removeUpdate(DocumentEvent e)  { r.run(); repaint(); }
                public void changedUpdate(DocumentEvent e) { r.run(); }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = suave(g);
            float f = foco.get(), h = hover.get(), er = erro.get();
            int w = getWidth(), alt = getHeight();

            // brilho (glow) ao redor do campo
            float brilho = Math.max(f, er);
            if (brilho > 0) {
                g2.setColor(new Color(mix(PRIMARIA, ERRO, er).getRGB() & 0xFFFFFF | ((int) (55 * brilho) << 24), true));
                g2.setStroke(new BasicStroke(4f));
                g2.drawRoundRect(2, 2, w - 5, alt - 5, 14, 14);
            }

            g2.setColor(mix(CAMPO_FUNDO, SUPERFICIE, f));
            g2.fillRoundRect(2, 2, w - 4, alt - 4, 12, 12);

            Color borda = mix(BORDA, PLACEHOLDER, h);
            borda = mix(borda, PRIMARIA, f);
            borda = mix(borda, ERRO, er);
            g2.setColor(borda);
            g2.setStroke(new BasicStroke(1.5f));
            g2.drawRoundRect(2, 2, w - 5, alt - 5, 12, 12);
            g2.dispose();
        }

        @Override
        protected void paintChildren(Graphics g) {
            super.paintChildren(g);
            if (entrada.getDocument().getLength() == 0) {
                Graphics2D g2 = suave(g);
                g2.setFont(entrada.getFont());
                g2.setColor(PLACEHOLDER);
                FontMetrics fm = g2.getFontMetrics();
                int y = entrada.getY() + (entrada.getHeight() - fm.getHeight()) / 2 + fm.getAscent();
                g2.drawString(placeholder, entrada.getX(), y);
                g2.dispose();
            }
        }
    }

    // ======================= MENSAGEM COM FADE =======================
    static class Mensagem extends JLabel {
        private final Transicao opacidade = new Transicao(this, 0.10f);
        private boolean erro;

        Mensagem() {
            super(" ");
            setFont(fonte(Font.PLAIN, 13));
            setPreferredSize(new Dimension(380, 22));
        }

        void mostrar(String texto, Color cor, boolean ehErro) {
            setText(texto);
            setForeground(cor);
            erro = ehErro;
            opacidade.definir(0);
            opacidade.ir(1);
        }

        void ocultar() { erro = false; opacidade.ir(0); }

        boolean isErro() { return erro; }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setComposite(AlphaComposite.SrcOver.derive(opacidade.get()));
            super.paintComponent(g2);
            g2.dispose();
        }
    }

    // ======================= PAINEL DA MARCA (ESQUERDA) =======================
    static class PainelMarca extends JPanel {
        private float fase;
        private Timer timer;

        PainelMarca() {
            setPreferredSize(new Dimension(430, 0));
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            setBorder(new EmptyBorder(48, 52, 40, 52));

            add(new Logo());
            add(Box.createVerticalGlue());

            JLabel titulo = rotulo("<html>Bem-vindo<br>de volta</html>", Font.BOLD, 38, Color.WHITE);
            titulo.setAlignmentX(LEFT_ALIGNMENT);
            add(titulo);
            add(Box.createVerticalStrut(16));

            JLabel sub = rotulo("<html><div style='width:290px'>Acesse o sistema para gerenciar suas informações "
                    + "com segurança e praticidade.</div></html>", Font.PLAIN, 15, new Color(0xBFDBFE));
            sub.setAlignmentX(LEFT_ALIGNMENT);
            add(sub);
            add(Box.createVerticalStrut(32));

            for (String item : new String[]{"Acesso seguro e centralizado",
                    "Relatórios em tempo real",
                    "Gestão simples e organizada"}) {
                JLabel l = rotulo("•   " + item, Font.PLAIN, 14, new Color(0xE0F2FE));
                l.setAlignmentX(LEFT_ALIGNMENT);
                l.setBorder(new EmptyBorder(4, 0, 4, 0));
                add(l);
            }

            add(Box.createVerticalGlue());
            JLabel rodape = rotulo("© 2026 Sistema de Gestão", Font.PLAIN, 12, new Color(0x93C5FD));
            rodape.setAlignmentX(LEFT_ALIGNMENT);
            add(rodape);
        }

        @Override public void addNotify() {
            super.addNotify();
            timer = new Timer(33, e -> { fase += 0.02f; repaint(); });
            timer.start();
        }

        @Override public void removeNotify() {
            if (timer != null) timer.stop();
            super.removeNotify();
        }

        private void circulo(Graphics2D g2, double cx, double cy, double r, Color cor) {
            g2.setColor(cor);
            g2.fill(new Ellipse2D.Double(cx - r, cy - r, r * 2, r * 2));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = suave(g);
            int w = getWidth(), h = getHeight();
            g2.setPaint(new GradientPaint(0, 0, AZUL_ESCURO, w, h, AZUL_MEDIO));
            g2.fillRect(0, 0, w, h);

            // círculos decorativos com movimento suave
            circulo(g2, w * 0.92 + Math.sin(fase) * 18,       h * 0.12 + Math.cos(fase * 0.8) * 18, 170, new Color(59, 130, 246, 45));
            circulo(g2, w * 0.08 + Math.cos(fase * 0.7) * 22, h * 0.90 + Math.sin(fase) * 20,       230, new Color(99, 102, 241, 40));
            circulo(g2, w * 0.78 + Math.sin(fase * 1.2) * 14, h * 0.66 + Math.cos(fase) * 14,        80, new Color(255, 255, 255, 18));
            g2.dispose();
        }

        /** Logotipo simples desenhado por código. */
        static class Logo extends JComponent {
            Logo() {
                Dimension d = new Dimension(280, 52);
                setPreferredSize(d);
                setMaximumSize(d);
                setAlignmentX(LEFT_ALIGNMENT);
            }

            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = suave(g);
                g2.setPaint(new GradientPaint(0, 0, new Color(0x3B82F6), 52, 52, new Color(0x6366F1)));
                g2.fillRoundRect(0, 0, 52, 52, 16, 16);
                g2.setColor(Color.WHITE);
                g2.setFont(fonte(Font.BOLD, 28));
                FontMetrics fm = g2.getFontMetrics();
                g2.drawString("S", (52 - fm.stringWidth("S")) / 2, (52 - fm.getHeight()) / 2 + fm.getAscent());
                g2.setFont(fonte(Font.BOLD, 18));
                fm = g2.getFontMetrics();
                g2.drawString("Sistema de Gestão", 66, (52 - fm.getHeight()) / 2 + fm.getAscent());
                g2.dispose();
            }
        }
    }

    // ======================= TELA PRINCIPAL DE LOGIN =======================
    private Campo campoUsuario;
    private Campo campoSenha;
    private Mensagem mensagem;
    private Botao btLogin;
    private Botao btCancelar;
    private JCheckBox ckLembrar;
    private boolean processando = false;

    public TelaLogin() {
        setTitle("Sistema de Gestão - Login");
        setSize(1000, 640);
        setMinimumSize(new Dimension(880, 580));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        add(new PainelMarca(), BorderLayout.WEST);
        add(criarPainelFormulario(), BorderLayout.CENTER);

        getRootPane().setDefaultButton(btLogin); // ENTER aciona o login

        SwingUtilities.invokeLater(() -> campoUsuario.entrada.requestFocusInWindow());
    }

    private JPanel criarPainelFormulario() {
        JLabel titulo = rotulo("Acessar sua conta", Font.BOLD, 30, TEXTO);
        JLabel subtitulo = rotulo("Informe suas credenciais para continuar.", Font.PLAIN, 15, TEXTO_SUAVE);

        JLabel lbUsuario = rotulo("Usuário", Font.BOLD, 13, TEXTO);
        campoUsuario = new Campo("Digite seu usuário", false);

        JLabel lbSenha = rotulo("Senha", Font.BOLD, 13, TEXTO);
        campoSenha = new Campo("Digite sua senha", true);

        mensagem = new Mensagem();

        // ENTER no usuário passa o foco para a senha
        campoUsuario.entrada.addActionListener(e -> campoSenha.entrada.requestFocusInWindow());

        // limpar estado de erro enquanto o usuário digita
        Runnable limparErro = () -> {
            campoUsuario.setErro(false);
            campoSenha.setErro(false);
            if (mensagem.isErro()) mensagem.ocultar();
        };
        campoUsuario.aoAlterar(limparErro);
        campoSenha.aoAlterar(limparErro);

        // aviso de Caps Lock
        campoSenha.entrada.addKeyListener(new KeyAdapter() {
            @Override public void keyPressed(KeyEvent e)  { verificarCapsLock(); }
            @Override public void keyReleased(KeyEvent e) { verificarCapsLock(); }
        });

        // linha: lembrar-me + esqueci a senha
        ckLembrar = new JCheckBox("Lembrar-me");
        ckLembrar.setOpaque(false);
        ckLembrar.setFocusPainted(false);
        ckLembrar.setFont(fonte(Font.PLAIN, 13));
        ckLembrar.setForeground(TEXTO_SUAVE);
        ckLembrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        Link esqueci = new Link("Esqueci a senha");
        esqueci.addMouseListener(new MouseAdapter() {
            @Override public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(TelaLogin.this,
                        "Entre em contato com o administrador do sistema para redefinir sua senha.",
                        "Recuperar senha", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JPanel opcoes = new JPanel(new BorderLayout());
        opcoes.setOpaque(false);
        opcoes.add(ckLembrar, BorderLayout.WEST);
        opcoes.add(esqueci, BorderLayout.EAST);

        // botões
        btCancelar = new Botao("Cancelar", false);
        btLogin = new Botao("Entrar", true);
        btCancelar.addActionListener(e -> System.exit(0));
        btLogin.addActionListener(e -> autenticar());

        JPanel botoes = new JPanel(new GridBagLayout());
        botoes.setOpaque(false);
        GridBagConstraints b = new GridBagConstraints();
        b.fill = GridBagConstraints.HORIZONTAL;
        b.gridy = 0;
        b.gridx = 0; b.weightx = 0.4; b.insets = new Insets(0, 0, 0, 6);
        botoes.add(btCancelar, b);
        b.gridx = 1; b.weightx = 0.6; b.insets = new Insets(0, 6, 0, 0);
        botoes.add(btLogin, b);

        // montagem do formulário
        JPanel form = new JPanel(new GridBagLayout());
        form.setOpaque(false);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.WEST;

        int linha = 0;
        c.gridy = linha++; c.insets = new Insets(0, 0, 6, 0);  form.add(titulo, c);
        c.gridy = linha++; c.insets = new Insets(0, 0, 30, 0); form.add(subtitulo, c);
        c.gridy = linha++; c.insets = new Insets(0, 0, 6, 0);  form.add(lbUsuario, c);
        c.gridy = linha++; c.insets = new Insets(0, 0, 18, 0); form.add(campoUsuario, c);
        c.gridy = linha++; c.insets = new Insets(0, 0, 6, 0);  form.add(lbSenha, c);
        c.gridy = linha++; c.insets = new Insets(0, 0, 8, 0);  form.add(campoSenha, c);
        c.gridy = linha++; c.insets = new Insets(0, 0, 10, 0); form.add(mensagem, c);
        c.gridy = linha++; c.insets = new Insets(0, 0, 26, 0); form.add(opcoes, c);
        c.gridy = linha++; c.insets = new Insets(0, 0, 0, 0);  form.add(botoes, c);

        JPanel centro = new JPanel(new GridBagLayout());
        centro.setOpaque(false);
        centro.add(form);

        JLabel dica = rotulo("Demonstração: usuário admin  •  senha 1234", Font.PLAIN, 12, PLACEHOLDER);
        dica.setHorizontalAlignment(SwingConstants.CENTER);
        dica.setBorder(new EmptyBorder(0, 0, 22, 0));

        JPanel raiz = new JPanel(new BorderLayout());
        raiz.setBackground(FUNDO);
        raiz.add(centro, BorderLayout.CENTER);
        raiz.add(dica, BorderLayout.SOUTH);
        return raiz;
    }

    // ======================= LÓGICA =======================
    private void verificarCapsLock() {
        if (processando) return;
        try {
            boolean ativo = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);
            if (ativo) {
                mensagem.mostrar("Caps Lock está ativado.", AVISO, false);
            } else if (!mensagem.isErro()) {
                mensagem.ocultar();
            }
        } catch (UnsupportedOperationException ignorada) {
            // plataforma não suporta consultar o Caps Lock
        }
    }

    private void autenticar() {
        if (processando) return;

        String usuario = campoUsuario.texto().trim();
        String senha = campoSenha.texto();

        boolean usuarioVazio = usuario.isEmpty();
        boolean senhaVazia = senha.isEmpty();
        campoUsuario.setErro(usuarioVazio);
        campoSenha.setErro(senhaVazia);

        if (usuarioVazio || senhaVazia) {
            mensagem.mostrar("Preencha o usuário e a senha para continuar.", ERRO, true);
            (usuarioVazio ? campoUsuario : campoSenha).entrada.requestFocusInWindow();
            tremer();
            return;
        }

        // estado de carregamento
        processando = true;
        btLogin.setCarregando(true);
        btLogin.setEnabled(false);
        btCancelar.setEnabled(false);
        campoUsuario.bloquear(true);
        campoSenha.bloquear(true);
        mensagem.mostrar("Verificando credenciais...", TEXTO_SUAVE, false);

        // Simula uma consulta (troque por chamada real ao banco/serviço, de preferência em SwingWorker)
        Timer espera = new Timer(1300, e -> finalizarAutenticacao(usuario, senha));
        espera.setRepeats(false);
        espera.start();
    }

    private void finalizarAutenticacao(String usuario, String senha) {
        boolean ok = usuario.equals("admin") && senha.equals("1234");

        processando = false;
        btLogin.setCarregando(false);
        btLogin.setEnabled(true);
        btCancelar.setEnabled(true);
        campoUsuario.bloquear(false);
        campoSenha.bloquear(false);

        if (ok) {
            mensagem.mostrar("Login realizado com sucesso!", SUCESSO, false);
            Timer entrar = new Timer(700, e -> {
                JOptionPane.showMessageDialog(this, "Bem-vindo, " + usuario + "!");
                // TODO: abrir a tela principal do sistema e fechar o login
                // new TelaPrincipal().setVisible(true);
                dispose();
            });
            entrar.setRepeats(false);
            entrar.start();
        } else {
            mensagem.mostrar("Usuário ou senha inválidos.", ERRO, true);
            campoUsuario.setErro(true);
            campoSenha.setErro(true);
            campoSenha.limpar();
            campoSenha.entrada.requestFocusInWindow();
            tremer();
        }
    }

    /** Microinteração de erro: a janela "balança" rapidamente. */
    private void tremer() {
        final Point origem = getLocation();
        final int[] deslocamentos = {-10, 10, -8, 8, -5, 5, -2, 2, 0};
        final int[] i = {0};
        Timer t = new Timer(30, e -> {
            if (i[0] >= deslocamentos.length) {
                ((Timer) e.getSource()).stop();
                setLocation(origem);
                return;
            }
            setLocation(origem.x + deslocamentos[i[0]++], origem.y);
        });
        t.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLogin().setVisible(true));
    }
}