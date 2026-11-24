package view;

import javax.swing.*;
import java.awt.*;

public class TelaLoginSimples extends JFrame {

    private JLabel lbTitulo;
    private JLabel lbUsuario;
    private JLabel lbSenha;
    private JTextField txUsuario;
    private JPasswordField txSenha;
    private JButton btEntrar;
    private JButton btLimpar;

    public TelaLoginSimples() {
        setTitle("Tela de Login");
        setSize(380, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(245, 247, 250));

        lbTitulo = new JLabel("Acesso ao Sistema", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lbTitulo.setBounds(70, 15, 220, 30);
        painel.add(lbTitulo);

        lbUsuario = new JLabel("Usuário:");
        lbUsuario.setBounds(40, 65, 80, 25);
        painel.add(lbUsuario);

        txUsuario = new JTextField();
        txUsuario.setBounds(120, 65, 180, 25);
        painel.add(txUsuario);

        lbSenha = new JLabel("Senha:");
        lbSenha.setBounds(40, 100, 80, 25);
        painel.add(lbSenha);

        txSenha = new JPasswordField();
        txSenha.setBounds(120, 100, 180, 25);
        painel.add(txSenha);

        btEntrar = new JButton("Entrar");
        btEntrar.setBounds(80, 145, 90, 28);
        painel.add(btEntrar);

        btLimpar = new JButton("Limpar");
        btLimpar.setBounds(190, 145, 90, 28);
        painel.add(btLimpar);

        add(painel);

//        // Controller controla os eventos
//        new LoginController(this);

        setVisible(true);
    }


    public void exibirMensagem(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }

    public void limparCampos(){
        txUsuario.setText("");
        txSenha.setText("");
    }

    public JLabel getLbTitulo() {
        return lbTitulo;
    }

    public JLabel getLbUsuario() {
        return lbUsuario;
    }

    public JLabel getLbSenha() {
        return lbSenha;
    }

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

    public void setTxUsuario(JTextField txUsuario) {
        this.txUsuario = txUsuario;
    }

    public void setTxSenha(JPasswordField txSenha) {
        this.txSenha = txSenha;
    }
}