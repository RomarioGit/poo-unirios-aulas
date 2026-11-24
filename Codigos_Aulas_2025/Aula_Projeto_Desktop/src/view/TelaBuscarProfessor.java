package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaBuscarProfessor extends JFrame {

    private JTextField txBusca;
    private JButton btBuscar;
    private JButton btLimpar;
    private JButton btVoltar;

    private JRadioButton rbNome;
    private JRadioButton rbCpf;
    private JRadioButton rbFormacao;
    private ButtonGroup grupoBusca;

    private JTable tabela;
    private DefaultTableModel modeloTabela;

    public TelaBuscarProfessor() {

        setTitle("Buscar Professor");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBackground(new Color(245, 247, 250));

        //---------------- TÍTULO ----------------
        JLabel lbTitulo = new JLabel(
                "BUSCAR PROFESSOR",
                SwingConstants.CENTER
        );

        lbTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22
                )
        );

        lbTitulo.setBounds(
                200,
                20,
                350,
                30
        );

        painel.add(lbTitulo);

        //---------------- CAMPO BUSCA ----------------
        JLabel lbBuscar = new JLabel(
                "Buscar:"
        );

        lbBuscar.setBounds(
                50,
                80,
                60,
                25
        );

        painel.add(lbBuscar);

        txBusca = new JTextField();

        txBusca.setBounds(
                110,
                80,
                300,
                28
        );

        painel.add(txBusca);

        //---------------- RADIO BUTTONS ----------------
        rbNome = new JRadioButton("Nome");
        rbCpf = new JRadioButton("CPF");
        rbFormacao = new JRadioButton("Formação");

        rbNome.setBackground(
                new Color(245, 247, 250)
        );

        rbCpf.setBackground(
                new Color(245, 247, 250)
        );

        rbFormacao.setBackground(
                new Color(245, 247, 250)
        );

        rbNome.setBounds(430, 80, 70, 25);
        rbCpf.setBounds(500, 80, 60, 25);
        rbFormacao.setBounds(560, 80, 100, 25);

        grupoBusca = new ButtonGroup();

        grupoBusca.add(rbNome);
        grupoBusca.add(rbCpf);
        grupoBusca.add(rbFormacao);

        rbNome.setSelected(true);

        painel.add(rbNome);
        painel.add(rbCpf);
        painel.add(rbFormacao);

        //---------------- BOTÃO BUSCAR ----------------
        btBuscar = new JButton("Buscar");

        btBuscar.setBounds(
                300,
                120,
                120,
                30
        );

        painel.add(btBuscar);

        //---------------- TABELA ----------------
        modeloTabela = new DefaultTableModel();

        modeloTabela.setColumnIdentifiers(
                new String[]{
                        "Nome",
                        "CPF",
                        "Contato",
                        "Formação",
                        "Especialização"
                }
        );

        tabela = new JTable(modeloTabela);

        JScrollPane scroll =
                new JScrollPane(tabela);

        scroll.setBounds(
                50,
                170,
                650,
                220
        );

        painel.add(scroll);

        //---------------- BOTÕES INFERIORES ----------------
        btLimpar = new JButton("Limpar");

        btLimpar.setBounds(
                220,
                410,
                120,
                30
        );

        painel.add(btLimpar);

        btVoltar = new JButton("Voltar");

        btVoltar.setBounds(
                390,
                410,
                120,
                30
        );

        painel.add(btVoltar);

        add(painel);

        setVisible(true);
    }

    //================ MÉTODOS AUXILIARES ================

    public void limparTabela() {
        modeloTabela.setRowCount(0);
    }

    public void adicionarLinha(Object[] dados) {
        modeloTabela.addRow(dados);
    }

    public void limparBusca() {
        txBusca.setText("");
        limparTabela();
    }

    public void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    //================ GETTERS ================

    public JTextField getTxBusca() {
        return txBusca;
    }

    public JButton getBtBuscar() {
        return btBuscar;
    }

    public JButton getBtLimpar() {
        return btLimpar;
    }

    public JButton getBtVoltar() {
        return btVoltar;
    }

    public JRadioButton getRbNome() {
        return rbNome;
    }

    public JRadioButton getRbCpf() {
        return rbCpf;
    }

    public JRadioButton getRbFormacao() {
        return rbFormacao;
    }

}