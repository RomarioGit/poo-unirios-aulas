package view;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    private JButton btnCadProfessor;
    private JButton btnBuscarProfessor;
    private JButton btnListarProfessor;

    private JButton btnCadAluno;
    private JButton btnBuscarAluno;
    private JButton btnListarAluno;

    private JButton btnCadDisciplina;
    private JButton btnBuscarDisciplina;
    private JButton btnListarDisciplina;

    private JButton btnSair;

    public TelaPrincipal() {

        // =========================
        // CONFIGURAÇÕES DA JANELA
        // =========================
        setTitle("Sistema Acadêmico");
        setSize(1200, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        // =========================
        // PAINEL LATERAL
        // =========================
        JPanel painelLateral = new JPanel();
        painelLateral.setLayout(null);
        painelLateral.setBackground(new Color(25, 118, 210));
        painelLateral.setBounds(0, 0, 280, 750);
        add(painelLateral);

        JLabel lblSistema = new JLabel("EDU SYSTEM");
        lblSistema.setForeground(Color.WHITE);
        lblSistema.setFont(new Font("Segoe UI", Font.BOLD, 28));
        lblSistema.setBounds(40, 70, 220, 40);
        painelLateral.add(lblSistema);

        JLabel lblDescricao = new JLabel(
                "<html>Sistema de gerenciamento<br>acadêmico escolar</html>"
        );
        lblDescricao.setForeground(new Color(220, 230, 250));
        lblDescricao.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        lblDescricao.setBounds(40, 130, 220, 60);
        painelLateral.add(lblDescricao);

        JLabel lblRodape = new JLabel("Usuário: Coordenador");
        lblRodape.setForeground(new Color(220, 230, 250));
        lblRodape.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lblRodape.setBounds(40, 670, 180, 20);
        painelLateral.add(lblRodape);

        // =========================
        // PAINEL PRINCIPAL
        // =========================
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBackground(new Color(245, 247, 250));
        painelPrincipal.setBounds(280, 0, 920, 750);
        add(painelPrincipal);

        JLabel lblTitulo = new JLabel("Menu Principal");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 34));
        lblTitulo.setBounds(320, 40, 300, 40);
        painelPrincipal.add(lblTitulo);

        // Cards
        JPanel cardProfessor = criarCard(
                "Professor",
                "Cadastrar, buscar e listar professores",
                80, 130
        );

        JPanel cardAluno = criarCard(
                "Aluno",
                "Cadastrar, buscar e listar alunos",
                500, 130
        );

        JPanel cardDisciplina = criarCard(
                "Disciplina",
                "Cadastrar, buscar e listar disciplinas",
                290, 380
        );

        painelPrincipal.add(cardProfessor);
        painelPrincipal.add(cardAluno);
        painelPrincipal.add(cardDisciplina);

        // =========================
        // BOTÕES PROFESSOR
        // =========================
        btnCadProfessor = criarBotao("Cadastrar");
        btnBuscarProfessor = criarBotao("Buscar");
        btnListarProfessor = criarBotao("Listar");

        posicionarBotoes(cardProfessor,
                btnCadProfessor,
                btnBuscarProfessor,
                btnListarProfessor);

        // =========================
        // BOTÕES ALUNO
        // =========================
        btnCadAluno = criarBotao("Cadastrar");
        btnBuscarAluno = criarBotao("Buscar");
        btnListarAluno = criarBotao("Listar");

        posicionarBotoes(cardAluno,
                btnCadAluno,
                btnBuscarAluno,
                btnListarAluno);

        // =========================
        // BOTÕES DISCIPLINA
        // =========================
        btnCadDisciplina = criarBotao("Cadastrar");
        btnBuscarDisciplina = criarBotao("Buscar");
        btnListarDisciplina = criarBotao("Listar");

        posicionarBotoes(cardDisciplina,
                btnCadDisciplina,
                btnBuscarDisciplina,
                btnListarDisciplina);

        // =========================
        // BOTÃO SAIR
        // =========================
        btnSair = new JButton("SAIR");
        btnSair.setBounds(760, 660, 120, 40);
        btnSair.setBackground(new Color(220, 70, 70));
        btnSair.setForeground(Color.WHITE);
        btnSair.setFocusPainted(false);
        btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
        painelPrincipal.add(btnSair);

        setVisible(true);
    }

    // =========================
    // MÉTODOS AUXILIARES
    // =========================

    private JPanel criarCard(
            String titulo,
            String descricao,
            int x,
            int y
    ) {

        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBackground(Color.WHITE);
        card.setBounds(x, y, 330, 200);
        card.setBorder(
                new LineBorder(
                        new Color(220,220,220),
                        1,
                        true
                )
        );

        JLabel lblTitulo = new JLabel(titulo);
        lblTitulo.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        22
                )
        );

        lblTitulo.setForeground(
                new Color(25,118,210)
        );

        lblTitulo.setBounds(
                20,
                20,
                250,
                30
        );

        card.add(lblTitulo);

        JLabel lblDesc = new JLabel(
                "<html>"+descricao+"</html>"
        );

        lblDesc.setBounds(
                20,
                55,
                260,
                40
        );

        card.add(lblDesc);

        return card;
    }

    private JButton criarBotao(String texto) {

        JButton btn = new JButton(texto);

        btn.setBackground(
                new Color(25,118,210)
        );

        btn.setForeground(Color.WHITE);

        btn.setFocusPainted(false);

        btn.setCursor(
                new Cursor(
                        Cursor.HAND_CURSOR
                )
        );

        return btn;
    }

    private void posicionarBotoes(
            JPanel card,
            JButton b1,
            JButton b2,
            JButton b3
    ) {

        b1.setBounds(20, 130, 90, 35);
        b2.setBounds(120, 130, 90, 35);
        b3.setBounds(220, 130, 90, 35);

        card.add(b1);
        card.add(b2);
        card.add(b3);
    }

    // =========================
    // GETTERS
    // =========================

    public JButton getBtnCadProfessor() {
        return btnCadProfessor;
    }

    public JButton getBtnBuscarProfessor() {
        return btnBuscarProfessor;
    }

    public JButton getBtnListarProfessor() {
        return btnListarProfessor;
    }

    public JButton getBtnCadAluno() {
        return btnCadAluno;
    }

    public JButton getBtnBuscarAluno() {
        return btnBuscarAluno;
    }

    public JButton getBtnListarAluno() {
        return btnListarAluno;
    }

    public JButton getBtnCadDisciplina() {
        return btnCadDisciplina;
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

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}