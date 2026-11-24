package aula07_JavaSwing;

import javax.swing.*;
import java.awt.*;

public class TelaLoginBasica extends JFrame {

    public TelaLoginBasica() throws HeadlessException {
        setTitle("Login");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ao fechar a janela, encerra a execução do código
        setLocationRelativeTo(null);
        setResizable(false);//desabilita a maximização da tela, fica com o tamanho original sempre
        setLayout(null); //desabilitar qualquer gerenciador de layout

        //Organizar elementos de tela
        JLabel lbTitulo = new JLabel("Login");
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 14));
        lbTitulo.setBounds(20,15, 150, 20);
        add(lbTitulo);

        //User
        JLabel lbUser = new JLabel("Usuário:");
        lbUser.setBounds(20,45, 60,20);
        add(lbUser);

        JTextField txUser = new JTextField();
        txUser.setBounds(85,45,180, 20 );
        add(txUser);

        //Senha
        JLabel lbSenha = new JLabel("Senha:");
        lbSenha.setBounds(20, 75, 60, 20);
        add(lbSenha);

        JPasswordField txSenha = new JPasswordField();
        txSenha.setBounds(85, 75, 180, 20);
        add(txSenha);

        //Botões
        JButton btCancelar = new JButton("Cancelar");
        btCancelar.setBounds(85,110, 85, 25);
        add(btCancelar);

        JButton btLogin = new JButton("OK");
        btLogin.setBounds(180,110, 85, 25);
        add(btLogin);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaLoginBasica();
    }
}
