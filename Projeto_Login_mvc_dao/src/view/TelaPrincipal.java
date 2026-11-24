package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * VIEW da tela inicial: exibida depois do login com sucesso.
 * Não conhece o Model: recebe apenas textos (String) enviados pelo Controller.
 */
public class TelaPrincipal extends JFrame {

    private JButton btnSair;
    private JLabel lblBemVindo, lblNome, lblUsuario, lblEmail, lblCpf, lblTelefone;

    public TelaPrincipal() {

        setTitle("Tela Inicial");
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(240, 245, 250));
        setLayout(null);

        // ---------- barra superior ----------
        JPanel barra = new JPanel();
        barra.setBackground(new Color(70, 130, 230));
        barra.setBounds(0, 0, 1000, 70);
        barra.setLayout(null);
        add(barra);

        JLabel lblSistema = new JLabel("SISTEMA DE LOGIN");
        lblSistema.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblSistema.setForeground(Color.WHITE);
        lblSistema.setBounds(30, 15, 400, 40);
        barra.add(lblSistema);

        btnSair = new JButton("SAIR");
        btnSair.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnSair.setForeground(new Color(70, 130, 230));
        btnSair.setBackground(Color.WHITE);
        btnSair.setFocusPainted(false);
        btnSair.setBounds(860, 15, 100, 40);
        btnSair.setBorder(new LineBorder(Color.WHITE, 1, true));
        barra.add(btnSair);

        // ---------- boas-vindas ----------
        lblBemVindo = new JLabel("Bem-vindo!");
        lblBemVindo.setFont(new Font("Segoe UI", Font.BOLD, 30));
        lblBemVindo.setForeground(new Color(40, 60, 100));
        lblBemVindo.setBounds(60, 110, 800, 50);
        add(lblBemVindo);

        JLabel lblSub = new JLabel("Login realizado com sucesso. Estes são os dados da sua conta:");
        lblSub.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblSub.setForeground(new Color(110, 120, 140));
        lblSub.setBounds(60, 160, 800, 30);
        add(lblSub);

        // ---------- cartão com os dados do usuário ----------
        JPanel cartao = new JPanel();
        cartao.setBackground(Color.WHITE);
        cartao.setBounds(60, 215, 500, 330);
        cartao.setLayout(null);
        cartao.setBorder(new LineBorder(new Color(200, 200, 200), 1, true));
        add(cartao);

        JLabel lblTituloCartao = new JLabel("MEUS DADOS");
        lblTituloCartao.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTituloCartao.setForeground(new Color(70, 130, 230));
        lblTituloCartao.setBounds(30, 20, 300, 30);
        cartao.add(lblTituloCartao);

        String[] rotulos = {"Nome", "Usuário", "E-mail", "CPF", "Telefone"};
        JLabel[] valores = new JLabel[rotulos.length];
        int y = 65;
        for (int i = 0; i < rotulos.length; i++) {
            JLabel rotulo = new JLabel(rotulos[i]);
            rotulo.setFont(new Font("Segoe UI", Font.BOLD, 13));
            rotulo.setForeground(new Color(110, 120, 140));
            rotulo.setBounds(30, y, 120, 30);
            cartao.add(rotulo);

            valores[i] = new JLabel("-");
            valores[i].setFont(new Font("Segoe UI", Font.PLAIN, 15));
            valores[i].setForeground(new Color(40, 60, 100));
            valores[i].setBounds(150, y, 320, 30);
            cartao.add(valores[i]);
            y += 48;
        }
        lblNome = valores[0];
        lblUsuario = valores[1];
        lblEmail = valores[2];
        lblCpf = valores[3];
        lblTelefone = valores[4];

        // ---------- cartão lateral ----------
        JPanel aviso = new JPanel();
        aviso.setBackground(new Color(70, 130, 230));
        aviso.setBounds(600, 215, 340, 330);
        aviso.setLayout(null);
        add(aviso);

        JLabel lblA1 = new JLabel("<html><b>Você está dentro!</b></html>");
        lblA1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        lblA1.setForeground(Color.WHITE);
        lblA1.setBounds(30, 30, 280, 40);
        aviso.add(lblA1);

        JLabel lblA2 = new JLabel("<html>Esta tela só aparece depois que o DAO confirma o usuário e a senha no MySQL.<br><br>"
                + "Use o botão SAIR para voltar ao login.</html>");
        lblA2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        lblA2.setForeground(Color.WHITE);
        lblA2.setBounds(30, 85, 280, 200);
        lblA2.setVerticalAlignment(SwingConstants.TOP);
        aviso.add(lblA2);
    }

    // ---------------- GETTER PARA O CONTROLLER ----------------

    public JButton getBtnSair() { return btnSair; }

    // ---------------- O QUE O CONTROLLER MANDA A TELA EXIBIR ----------------

    public void exibirDados(String saudacao, String nome, String usuario,
                            String email, String cpf, String telefone) {
        lblBemVindo.setText(saudacao);
        lblNome.setText(vazioVira(nome));
        lblUsuario.setText(vazioVira(usuario));
        lblEmail.setText(vazioVira(email));
        lblCpf.setText(vazioVira(cpf));
        lblTelefone.setText(vazioVira(telefone));
    }

    private String vazioVira(String texto) {
        return (texto == null || texto.isEmpty()) ? "-" : texto;
    }

    /** Pergunta se o usuário quer mesmo sair. */
    public boolean confirmarSaida() {
        int r = JOptionPane.showConfirmDialog(this, "Deseja sair do sistema?",
                "Sair", JOptionPane.YES_NO_OPTION);
        return r == JOptionPane.YES_OPTION;
    }
}
