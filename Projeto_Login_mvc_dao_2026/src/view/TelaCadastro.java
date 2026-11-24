package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TelaCadastro extends JFrame {

    private JTextField txtNome, txtCPF, txtTelefone, txtEmail, txtUsuario;
    private JPasswordField txtSenha, txtConfirmar;
    private JButton btnCriarConta;
    private JLabel lblLogin;

    public TelaCadastro() {

        setTitle("Cadastro de Usuário");
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);   // fecha só esta janela
        getContentPane().setBackground(new Color(240, 245, 250));
        setLayout(null);

        JPanel painel = new JPanel();
        painel.setBackground(Color.WHITE);
        painel.setBounds(250, 30, 500, 600);
        painel.setLayout(null);
        painel.setBorder(new LineBorder(new Color(200, 200, 200), 1, true));
        add(painel);

        JLabel lblTitulo = new JLabel("CRIAR CONTA", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblTitulo.setForeground(new Color(70, 130, 230));
        lblTitulo.setBounds(0, 20, 500, 40);
        painel.add(lblTitulo);

        int campoAltura = 40;
        int larguraCampo = 400;
        int xBase = 50;
        int yBase = 80;
        int espaco = 55;

        txtNome = criarCampo("Nome completo");
        txtNome.setBounds(xBase, yBase, larguraCampo, campoAltura);
        painel.add(txtNome);

        txtCPF = criarCampo("CPF");
        txtCPF.setBounds(xBase, yBase + espaco, larguraCampo, campoAltura);
        painel.add(txtCPF);

        txtTelefone = criarCampo("Telefone");
        txtTelefone.setBounds(xBase, yBase + espaco * 2, larguraCampo, campoAltura);
        painel.add(txtTelefone);

        txtEmail = criarCampo("E-mail");
        txtEmail.setBounds(xBase, yBase + espaco * 3, larguraCampo, campoAltura);
        painel.add(txtEmail);

        txtUsuario = criarCampo("Usuário");
        txtUsuario.setBounds(xBase, yBase + espaco * 4, larguraCampo, campoAltura);
        painel.add(txtUsuario);

        txtSenha = criarCampoSenha("Senha");
        txtSenha.setBounds(xBase, yBase + espaco * 5, larguraCampo, campoAltura);
        painel.add(txtSenha);

        txtConfirmar = criarCampoSenha("Confirmar senha");
        txtConfirmar.setBounds(xBase, yBase + espaco * 6, larguraCampo, campoAltura);
        painel.add(txtConfirmar);

        btnCriarConta = new JButton("CRIAR CONTA");
        btnCriarConta.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btnCriarConta.setForeground(Color.WHITE);
        btnCriarConta.setBackground(new Color(70, 130, 230));
        btnCriarConta.setFocusPainted(false);
        btnCriarConta.setBounds(150, yBase + espaco * 7 + 10, 200, 45);
        btnCriarConta.setBorder(new LineBorder(new Color(50, 100, 210), 1, true));

        painel.add(btnCriarConta);

        lblLogin = new JLabel("<html><a href='#'>Já tem uma conta? Faça login</a></html>", SwingConstants.CENTER);
        lblLogin.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblLogin.setForeground(new Color(70, 130, 230));
        lblLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblLogin.setBounds(0, yBase + espaco * 8 + 20, 500, 30);
        painel.add(lblLogin);

        setVisible(true);
    }

    private JTextField criarCampo(String titulo) {
        JTextField campo = new JTextField();
        campo.setBorder(BorderFactory.createTitledBorder(titulo));
        campo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        return campo;
    }

    private JPasswordField criarCampoSenha(String titulo) {
        JPasswordField campo = new JPasswordField();
        campo.setBorder(BorderFactory.createTitledBorder(titulo));
        campo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        return campo;
    }

    // ---------------- GETTERS PARA O CONTROLLER ----------------

    public String getNome() { return txtNome.getText(); }
    public String getCPF() { return txtCPF.getText(); }
    public String getTelefone() { return txtTelefone.getText(); }
    public String getEmail() { return txtEmail.getText(); }
    public String getUsuario() { return txtUsuario.getText(); }
    public String getSenha() { return new String(txtSenha.getPassword()); }
    public String getConfirmarSenha() { return new String(txtConfirmar.getPassword()); }

    public JButton getBtnCriarConta() { return btnCriarConta; }
    public JLabel getLblLogin() { return lblLogin; }

    public void limparCampos() {
        txtNome.setText("");
        txtCPF.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtUsuario.setText("");
        txtSenha.setText("");
        txtConfirmar.setText("");
    }

    public void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }
}
