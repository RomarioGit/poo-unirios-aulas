package view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipalSimples extends JFrame {

    // =========================
    // BOTÕES ALUNO
    // =========================

    private JButton btnCadastrarAluno;
    private JButton btnBuscarAluno;
    private JButton btnListarAluno;

    // =========================
    // BOTÕES PROFESSOR
    // =========================

    private JButton btnCadastrarProfessor;
    private JButton btnBuscarProfessor;
    private JButton btnListarProfessor;

    // =========================
    // BOTÕES DISCIPLINA
    // =========================

    private JButton btnCadastrarDisciplina;
    private JButton btnBuscarDisciplina;
    private JButton btnListarDisciplina;

    // =========================
    // BOTÃO SAIR
    // =========================

    private JButton btnSair;

    public TelaPrincipalSimples() {

        // =========================
        // CONFIGURAÇÕES DA JANELA
        // =========================

        setTitle("Sistema Acadêmico");
        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setResizable(false);

        setLayout(null);

        getContentPane().setBackground(new Color(240, 240, 240));

        // =========================
        // TÍTULO
        // =========================

        JLabel lblTitulo = new JLabel("MENU PRINCIPAL");

        lblTitulo.setFont(new Font("Arial", Font.BOLD, 26));

        lblTitulo.setBounds(260, 20, 300, 40);

        add(lblTitulo);

        // =====================================================
        // PAINEL ALUNO
        // =====================================================

        JPanel painelAluno = new JPanel();

        painelAluno.setLayout(null);

        painelAluno.setBorder(
                BorderFactory.createTitledBorder("ALUNOS")
        );

        painelAluno.setBounds(40, 90, 220, 180);

        add(painelAluno);

        btnCadastrarAluno = new JButton("Cadastrar");

        btnCadastrarAluno.setBounds(40, 30, 130, 30);

        painelAluno.add(btnCadastrarAluno);

        btnBuscarAluno = new JButton("Buscar");

        btnBuscarAluno.setBounds(40, 75, 130, 30);

        painelAluno.add(btnBuscarAluno);

        btnListarAluno = new JButton("Listar");

        btnListarAluno.setBounds(40, 120, 130, 30);

        painelAluno.add(btnListarAluno);

        // =====================================================
        // PAINEL PROFESSOR
        // =====================================================

        JPanel painelProfessor = new JPanel();

        painelProfessor.setLayout(null);

        painelProfessor.setBorder(
                BorderFactory.createTitledBorder("PROFESSORES")
        );

        painelProfessor.setBounds(290, 90, 220, 180);

        add(painelProfessor);

        btnCadastrarProfessor = new JButton("Cadastrar");

        btnCadastrarProfessor.setBounds(40, 30, 130, 30);

        painelProfessor.add(btnCadastrarProfessor);

        btnBuscarProfessor = new JButton("Buscar");

        btnBuscarProfessor.setBounds(40, 75, 130, 30);

        painelProfessor.add(btnBuscarProfessor);

        btnListarProfessor = new JButton("Listar");

        btnListarProfessor.setBounds(40, 120, 130, 30);

        painelProfessor.add(btnListarProfessor);

        // =====================================================
        // PAINEL DISCIPLINA
        // =====================================================

        JPanel painelDisciplina = new JPanel();

        painelDisciplina.setLayout(null);

        painelDisciplina.setBorder(
                BorderFactory.createTitledBorder("DISCIPLINAS")
        );

        painelDisciplina.setBounds(540, 90, 220, 180);

        add(painelDisciplina);

        btnCadastrarDisciplina = new JButton("Cadastrar");

        btnCadastrarDisciplina.setBounds(40, 30, 130, 30);

        painelDisciplina.add(btnCadastrarDisciplina);

        btnBuscarDisciplina = new JButton("Buscar");

        btnBuscarDisciplina.setBounds(40, 75, 130, 30);

        painelDisciplina.add(btnBuscarDisciplina);

        btnListarDisciplina = new JButton("Listar");

        btnListarDisciplina.setBounds(40, 120, 130, 30);

        painelDisciplina.add(btnListarDisciplina);

        // =====================================================
        // BOTÃO SAIR
        // =====================================================

        btnSair = new JButton("Sair do Sistema");

        btnSair.setBounds(300, 470, 180, 40);

        add(btnSair);

        setVisible(true);
    }

    // =====================================================
    // GETTERS
    // =====================================================

    public JButton getBtnCadastrarAluno() {
        return btnCadastrarAluno;
    }

    public JButton getBtnBuscarAluno() {
        return btnBuscarAluno;
    }

    public JButton getBtnListarAluno() {
        return btnListarAluno;
    }

    public JButton getBtnCadastrarProfessor() {
        return btnCadastrarProfessor;
    }

    public JButton getBtnBuscarProfessor() {
        return btnBuscarProfessor;
    }

    public JButton getBtnListarProfessor() {
        return btnListarProfessor;
    }

    public JButton getBtnCadastrarDisciplina() {
        return btnCadastrarDisciplina;
    }

    public JButton getBtnBuscarDisciplina() {
        return btnBuscarDisciplina;
    }

    public JButton getBtnListarDisciplina() {
        return btnListarDisciplina;
    }

    public JButton getBtnSair() {
        return btnSair;
    }

}