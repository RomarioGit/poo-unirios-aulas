package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/** VIEW da tela de login: só monta a tela; não conhece o DAO nem o banco. */
public class TelaLogin extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnLogin;
    private JLabel lblCreate;

    public TelaLogin() {

        setTitle("Login");
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      // fechar o login encerra o programa
        getContentPane().setBackground(new Color(240, 245, 250));
        setLayout(null);

        JPanel painel = new JPanel();
        painel.setBackground(Color.WHITE);
        painel.setBounds(250, 120, 500, 400);
        painel.setLayout(null);
        painel.setBorder(new LineBorder(new Color(200, 200, 200), 1, true));
        add(painel);

        JLabel lblTitulo = new JLabel("LOGIN", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblTitulo.setForeground(new Color(70, 130, 230));
        lblTitulo.setBounds(0, 30, 500, 40);
        painel.add(lblTitulo);

        txtUsuario = new JTextField();
        txtUsuario.setBorder(BorderFactory.createTitledBorder("Usuário"));
        txtUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtUsuario.setBounds(50, 100, 400, 40);
        painel.add(txtUsuario);

        txtSenha = new JPasswordField();
        txtSenha.setBorder(BorderFactory.createTitledBorder("Senha"));
        txtSenha.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        txtSenha.setBounds(50, 160, 400, 40);
        painel.add(txtSenha);

        btnLogin = new JButton("ENTRAR");
        btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBackground(new Color(70, 130, 230));
        btnLogin.setFocusPainted(false);
        btnLogin.setBounds(150, 240, 200, 45);
        btnLogin.setBorder(new LineBorder(new Color(50, 100, 210), 1, true));
        painel.add(btnLogin);

        lblCreate = new JLabel("Create Account", SwingConstants.CENTER);
        lblCreate.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblCreate.setForeground(new Color(70, 130, 230));
        lblCreate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblCreate.setBounds(0, 310, 500, 30);
        painel.add(lblCreate);
    }

    // ---------------- GETTERS PARA O CONTROLLER ----------------

    public String getUsuario() { return txtUsuario.getText(); }
    public String getSenha() { return new String(txtSenha.getPassword()); }

    public JButton getBtnLogin() { return btnLogin; }
    public JLabel getLblCreate() { return lblCreate; }

    public void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
}
