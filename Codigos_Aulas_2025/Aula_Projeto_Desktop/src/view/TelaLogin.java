package view;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame {

    private JLabel lbTitulo;
    private JLabel lbSubtitulo;
    private JLabel lbUsuario;
    private JLabel lbSenha;

    private JTextField txUsuario;
    private JPasswordField txSenha;

    private JButton btEntrar;
    private JButton btLimpar;

    private JLabel lbEsqueceuSenha;

    public TelaLogin() {

        // ---------------- JANELA ----------------

        setTitle("Login do Sistema");
        setSize(900, 580);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        // ---------------- PAINEL ESQUERDO ----------------

        JPanel painelEsquerdo = new JPanel();
        painelEsquerdo.setBounds(0, 0, 420, 550);
        painelEsquerdo.setBackground(new Color(33, 150, 243));
        painelEsquerdo.setLayout(null);
        add(painelEsquerdo);

        JLabel lbLogo = new JLabel("EDU SYSTEM");
        lbLogo.setForeground(Color.WHITE);
        lbLogo.setFont(new Font("Segoe UI", Font.BOLD, 36));
        lbLogo.setBounds(110, 170, 250, 50);
        painelEsquerdo.add(lbLogo);

        JLabel lbDescricao = new JLabel(
                "<html>Sistema de gerenciamento<br>acadêmico escolar</html>",
                SwingConstants.CENTER
        );

        lbDescricao.setForeground(new Color(230, 240, 255));
        lbDescricao.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lbDescricao.setBounds(60, 240, 300, 80);
        painelEsquerdo.add(lbDescricao);

        // ---------------- PAINEL DIREITO ----------------

        JPanel painelDireito = new JPanel();
        painelDireito.setBounds(420, 0, 480, 550);
        painelDireito.setBackground(Color.WHITE);
        painelDireito.setLayout(null);
        add(painelDireito);

        // ---------------- TÍTULO ----------------

        lbTitulo = new JLabel("Bem-vindo");
        lbTitulo.setFont(new Font("Segoe UI", Font.BOLD, 32));
        lbTitulo.setForeground(new Color(33, 150, 243));
        lbTitulo.setBounds(130, 70, 250, 40);
        painelDireito.add(lbTitulo);

        lbSubtitulo = new JLabel("Faça login para continuar");
        lbSubtitulo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lbSubtitulo.setForeground(new Color(120, 120, 120));
        lbSubtitulo.setBounds(130, 110, 250, 30);
        painelDireito.add(lbSubtitulo);

        // ---------------- LABEL USUÁRIO ----------------

        lbUsuario = new JLabel("Usuário");
        lbUsuario.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lbUsuario.setForeground(new Color(70, 70, 70));
        lbUsuario.setBounds(70, 180, 100, 20);
        painelDireito.add(lbUsuario);

        // ---------------- CAMPO USUÁRIO ----------------

        txUsuario = new JTextField();
        txUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        txUsuario.setBounds(70, 205, 330, 45);

        txUsuario.setBorder(new CompoundBorder(
                new LineBorder(new Color(210, 220, 230), 2, true),
                new EmptyBorder(0, 12, 0, 12)
        ));

        painelDireito.add(txUsuario);

        // ---------------- LABEL SENHA ----------------

        lbSenha = new JLabel("Senha");
        lbSenha.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lbSenha.setForeground(new Color(70, 70, 70));
        lbSenha.setBounds(70, 270, 100, 20);
        painelDireito.add(lbSenha);

        // ---------------- CAMPO SENHA ----------------

        txSenha = new JPasswordField();
        txSenha.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        txSenha.setBounds(70, 295, 330, 45);

        txSenha.setBorder(new CompoundBorder(
                new LineBorder(new Color(210, 220, 230), 2, true),
                new EmptyBorder(0, 12, 0, 12)
        ));

        painelDireito.add(txSenha);

        // ---------------- BOTÃO ENTRAR ----------------

        btEntrar = new JButton("ENTRAR");

        btEntrar.setBounds(70, 380, 330, 48);
        btEntrar.setFont(new Font("Segoe UI", Font.BOLD, 16));

        btEntrar.setBackground(new Color(33, 150, 243));
        btEntrar.setForeground(Color.WHITE);

        btEntrar.setFocusPainted(false);
        btEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btEntrar.setBorder(new LineBorder(new Color(25, 118, 210), 1, true));

        // MICROINTERAÇÃO HOVER

        btEntrar.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                btEntrar.setBackground(new Color(25, 118, 210));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btEntrar.setBackground(new Color(33, 150, 243));
            }
        });

        painelDireito.add(btEntrar);

        // ---------------- BOTÃO LIMPAR ----------------

        btLimpar = new JButton("LIMPAR");

        btLimpar.setBounds(70, 440, 330, 45);

        btLimpar.setFont(new Font("Segoe UI", Font.BOLD, 15));

        btLimpar.setBackground(Color.WHITE);
        btLimpar.setForeground(new Color(33, 150, 243));

        btLimpar.setFocusPainted(false);

        btLimpar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btLimpar.setBorder(new LineBorder(new Color(33, 150, 243), 2, true));

        // MICROINTERAÇÃO HOVER

        btLimpar.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                btLimpar.setBackground(new Color(240, 247, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btLimpar.setBackground(Color.WHITE);
            }
        });

        painelDireito.add(btLimpar);

        // ---------------- LINK ----------------

        lbEsqueceuSenha = new JLabel("Esqueceu sua senha?");
        lbEsqueceuSenha.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lbEsqueceuSenha.setForeground(new Color(33, 150, 243));

        lbEsqueceuSenha.setBounds(165, 500, 160, 20);

        lbEsqueceuSenha.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // MICROINTERAÇÃO LINK

        lbEsqueceuSenha.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                lbEsqueceuSenha.setText("<html><u>Esqueceu sua senha?</u></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lbEsqueceuSenha.setText("Esqueceu sua senha?");
            }
        });

        painelDireito.add(lbEsqueceuSenha);

        // ---------------- AÇÕES ----------------

        btLimpar.addActionListener(e -> limparCampos());

        setVisible(true);
    }

    // ---------------- MÉTODOS ----------------

    public void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void limparCampos() {
        txUsuario.setText("");
        txSenha.setText("");
    }

    // ---------------- GETTERS ----------------

    public JTextField getTxUsuario() {
        return txUsuario;
    }

    public JPasswordField getTxSenha() {
        return txSenha;
    }

    public JButton getBtEntrar() {
        return btEntrar;
    }

    public JButton getBtLimpar() {
        return btLimpar;
    }
}