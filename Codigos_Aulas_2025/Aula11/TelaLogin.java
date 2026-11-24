package Aulas2025_1.Aula11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private Autenticacao autenticacao;
    private JPasswordField txtSenha;
    private JTextField txtUsuario;
    public TelaLogin() {

        this.autenticacao = new Autenticacao();
        // Configuração básica do JFrame
        setTitle("Tela de Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 180);
        setLocationRelativeTo(null);
        setResizable(false);

        // Desativa o gerenciador de layout para posicionamento absoluto
        setLayout(null);

        // Título
        JLabel lblTitulo = new JLabel("Dados do Usuário:");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));
        lblTitulo.setBounds(20, 15, 150, 20);
        add(lblTitulo);

        // Usuário
        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(20, 45, 60, 20);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(85, 45, 180, 20);
        add(txtUsuario);

        // Senha
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(20, 75, 60, 20);
        add(lblSenha);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(85, 75, 180, 20);
        add(txtSenha);

        // Botões
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(85, 110, 85, 25);
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(btnCancelar);

        JButton btnOK = new JButton("OK");
        btnOK.setBounds(180, 110, 85, 25);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = txtUsuario.getText();
                String senha = new String(txtSenha.getPassword());
                if (autenticacao.autenticar(user,senha)){
                    JOptionPane.showMessageDialog(null,"Login efetuado!");
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!",
                            "Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(btnOK);
        getRootPane().setDefaultButton(btnOK);
    }
}
