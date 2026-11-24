package aula07_JavaSwing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TelaCadastro extends JFrame {

    public TelaCadastro() throws HeadlessException {
        super("Cadastro de Alunos");
        setSize(640, 560);
        setLocationRelativeTo(null);   // centraliza a janela na tela
        setResizable(false);           // tamanho fixo: a quebra de linha depende da largura
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // o "X" encerra a execução

        //Criar o Panel
        JPanel painel = new JPanel();

        Dimension tamRotulo = new Dimension(90, 25); //tamanho dos labels
        Dimension tamCampo = new Dimension(500, 25); //tamanho dos textefield


        //--- NOME e E-MAIL --------
        JLabel lbNome = new JLabel("Nome:");
        lbNome.setPreferredSize(tamRotulo);
        JTextField txNome = new JTextField();
        txNome.setPreferredSize(tamCampo);

        JLabel lbEmail = new JLabel("E-mail:");
        lbEmail.setPreferredSize(tamRotulo);
        JTextField txEmail = new JTextField();
        txEmail.setPreferredSize(tamCampo);

        //Curso------
        JLabel lbCurso = new JLabel("Curso:");
        lbCurso.setPreferredSize(tamRotulo);
        JComboBox<String> comboCurso = new JComboBox<>(new String[]{"Sistemas de Informação",
        "Engenharia de Software", "Gestão de TI", "Análise e Desenvolvimento de Sistemas"});
        comboCurso.setPreferredSize(tamCampo);

        //Turno --------
        JLabel lbTurno = new JLabel("Turno:");
        lbTurno.setPreferredSize(tamRotulo);
        JRadioButton rbManha = new JRadioButton("Manhã", true);
        rbManha.setPreferredSize(new Dimension(80,25));
        JRadioButton rbNoite = new JRadioButton("Noite");
        rbNoite.setPreferredSize(new Dimension(410,25));
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rbManha);
        grupo.add(rbNoite);

        //Opções ------------------
        JLabel lbOp = new JLabel("Opções:");
        lbOp.setPreferredSize(tamRotulo);
        JCheckBox opBolsa = new JCheckBox("Possui Bolsa");
        opBolsa.setPreferredSize(new Dimension(130,25));
        JCheckBox opNovidades = new JCheckBox("Receber novidades por e-mail");
        opNovidades.setPreferredSize(new Dimension(360,25));

        //Observações----------
        JLabel lbObs = new JLabel("Observações:");
        lbObs.setPreferredSize(tamRotulo);
        JTextArea areaObs = new JTextArea();
        areaObs.setLineWrap(true); //quebra de linhas
        areaObs.setWrapStyleWord(true); //quebra de palavras
        JScrollPane rolagem = new JScrollPane(areaObs);
        rolagem.setPreferredSize(new Dimension(500, 70));

        //Botões--------------
        JButton btSalvar = new JButton("Salvar");
        JButton btLimpar = new JButton("Limpar");
        JButton btRemover = new JButton("Remover Selecionado");
        JButton btSair = new JButton("Sair");

        //Tabela-------------
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Nome", "E-mail", "Curso", "Turno",
                "Bolsa", "Observações"},0);//colunas, linhas
        JTable tabela = new JTable(modelo);
        JScrollPane rolagemTab = new JScrollPane(tabela);
        rolagemTab.setPreferredSize(new Dimension(600, 230));

        //Status------------
        JLabel lbStatus = new JLabel("Total de alunos cadastrados:");
        lbStatus.setFont(new Font("Arial", Font.BOLD, 12));

        //Configurar o Panel
        painel.add(lbNome);
        painel.add(txNome);
        painel.add(lbEmail);
        painel.add(txEmail);
        painel.add(lbCurso);
        painel.add(comboCurso);
        painel.add(lbTurno);
        painel.add(rbManha);
        painel.add(rbNoite);
        painel.add(lbOp);
        painel.add(opBolsa);
        painel.add(opNovidades);
        painel.add(lbObs);
        painel.add(rolagem);
        painel.add(btSalvar);
        painel.add(btLimpar);
        painel.add(btRemover);
        painel.add(btSair);
        painel.add(rolagemTab);
        painel.add(lbStatus);

        add(painel);//adicionando o painel no Frame


    }

    public static void main(String[] args) {
        new TelaCadastro().setVisible(true);
    }
}
