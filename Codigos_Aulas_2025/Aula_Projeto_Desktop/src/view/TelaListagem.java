package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaListagem extends JFrame {

    // =====================================
    // COMPONENTES
    // =====================================

    private JLabel lblTitulo;

    private JTable tabela;

    private DefaultTableModel modeloTabela;

    private JButton btnAtualizar;

    private JButton btnVoltar;

    public TelaListagem(String titulo) {

        // =====================================
        // CONFIGURAÇÕES DA JANELA
        // =====================================

        setTitle("Listagem");

        setSize(800, 500);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLocationRelativeTo(null);

        setResizable(false);

        setLayout(null);

        // =====================================
        // TÍTULO
        // =====================================

        lblTitulo = new JLabel(
                titulo,
                SwingConstants.CENTER
        );

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        lblTitulo.setBounds(
                0,
                20,
                800,
                30
        );

        add(lblTitulo);

        // =====================================
        // TABELA
        // =====================================

        modeloTabela = new DefaultTableModel();

        tabela = new JTable(modeloTabela);

        JScrollPane scroll = new JScrollPane(tabela);

        scroll.setBounds(
                40,
                70,
                700,
                300
        );

        add(scroll);

        // =====================================
        // BOTÃO ATUALIZAR
        // =====================================

        btnAtualizar = new JButton("Atualizar");

        btnAtualizar.setBounds(
                220,
                400,
                140,
                35
        );

        add(btnAtualizar);

        // =====================================
        // BOTÃO VOLTAR
        // =====================================

        btnVoltar = new JButton("Voltar");

        btnVoltar.setBounds(
                420,
                400,
                140,
                35
        );

        add(btnVoltar);

        setVisible(true);
    }

    // =====================================
    // MÉTODOS PARA CONTROLAR A TABELA
    // =====================================

    public void definirColunas(String[] colunas) {

        modeloTabela.setColumnIdentifiers(
                colunas
        );

    }

    public void limparTabela() {

        modeloTabela.setRowCount(0);

    }

    public void adicionarLinha(Object[] linha) {

        modeloTabela.addRow(linha);

    }

    // =====================================
    // GETTERS
    // =====================================

    public JButton getBtnAtualizar() {
        return btnAtualizar;
    }

    public JButton getBtnVoltar() {
        return btnVoltar;
    }

    public JTable getTabela() {
        return tabela;
    }

}