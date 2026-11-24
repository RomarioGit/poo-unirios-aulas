package view;

import javax.swing.*;
import java.awt.*;

public class TelaCadastroProfessor extends JFrame {

    // CAMPOS
    private JTextField txtNome;
    private JTextField txtCPF;
    private JTextField txtContato;
    private JTextField txtFormacao;
    private JTextField txtEspecializacao;

    // BOTÕES
    private JButton btnCadastrar;
    private JButton btnLimpar;
    private JButton btnVoltar;

    public TelaCadastroProfessor() {

        // CONFIGURAÇÕES DA JANELA
        setTitle("Cadastro de Professor");

        setSize(500, 500);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLocationRelativeTo(null);

        setResizable(false);

        setLayout(null);

        // TÍTULO
        JLabel lblTitulo = new JLabel("CADASTRO DE PROFESSOR");

        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));

        lblTitulo.setBounds(110, 20, 300, 30);

        add(lblTitulo);

        // =====================================
        // NOME
        // =====================================

        JLabel lblNome = new JLabel("Nome:");

        lblNome.setBounds(50, 80, 100, 25);

        add(lblNome);

        txtNome = new JTextField();

        txtNome.setBounds(150, 80, 250, 30);

        add(txtNome);

        // =====================================
        // CPF
        // =====================================

        JLabel lblCPF = new JLabel("CPF:");

        lblCPF.setBounds(50, 130, 100, 25);

        add(lblCPF);

        txtCPF = new JTextField();

        txtCPF.setBounds(150, 130, 250, 30);

        add(txtCPF);

        // =====================================
        // CONTATO
        // =====================================

        JLabel lblContato = new JLabel("Contato:");

        lblContato.setBounds(50, 180, 100, 25);

        add(lblContato);

        txtContato = new JTextField();

        txtContato.setBounds(150, 180, 250, 30);

        add(txtContato);

        // =====================================
        // FORMAÇÃO
        // =====================================

        JLabel lblFormacao = new JLabel("Formação:");

        lblFormacao.setBounds(50, 230, 100, 25);

        add(lblFormacao);

        txtFormacao = new JTextField();

        txtFormacao.setBounds(150, 230, 250, 30);

        add(txtFormacao);

        // =====================================
        // ESPECIALIZAÇÃO
        // =====================================

        JLabel lblEspecializacao = new JLabel("Especialização:");

        lblEspecializacao.setBounds(50, 280, 100, 25);

        add(lblEspecializacao);

        txtEspecializacao = new JTextField();

        txtEspecializacao.setBounds(150, 280, 250, 30);

        add(txtEspecializacao);

        // =====================================
        // BOTÃO CADASTRAR
        // =====================================

        btnCadastrar = new JButton("Cadastrar");

        btnCadastrar.setBounds(50, 370, 120, 35);

        add(btnCadastrar);

        // =====================================
        // BOTÃO LIMPAR
        // =====================================

        btnLimpar = new JButton("Limpar");

        btnLimpar.setBounds(190, 370, 120, 35);

        add(btnLimpar);

        // =====================================
        // BOTÃO VOLTAR
        // =====================================

        btnVoltar = new JButton("Voltar");

        btnVoltar.setBounds(330, 370, 120, 35);

        add(btnVoltar);

        setVisible(true);
    }

    // =====================================
    // MÉTODOS AUXILIARES
    // =====================================

    public void limparCampos() {

        txtNome.setText("");

        txtCPF.setText("");

        txtContato.setText("");

        txtFormacao.setText("");

        txtEspecializacao.setText("");

    }

    public void exibirMensagem(String mensagem) {

        JOptionPane.showMessageDialog(this, mensagem);

    }

    // =====================================
    // GETTERS
    // =====================================

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtCPF() {
        return txtCPF;
    }

    public JTextField getTxtContato() {
        return txtContato;
    }

    public JTextField getTxtFormacao() {
        return txtFormacao;
    }

    public JTextField getTxtEspecializacao() {
        return txtEspecializacao;
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public JButton getBtnVoltar() {
        return btnVoltar;
    }

    // =====================================
    // MAIN
    // =====================================


}