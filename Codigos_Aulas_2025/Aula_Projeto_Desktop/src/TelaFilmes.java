
import javax.swing.*;
import java.awt.*;

public class TelaFilmes extends JFrame {

    private JTextField txtTitulo;
    private JComboBox<String> cbGenero;
    private JTextField txtAno;

    private JTextField txtBuscar;

    private JButton btnCadastrar;
    private JButton btnLimpar;
    private JButton btnBuscar;

    private JTextArea txtResultado;

    public TelaFilmes() {

        setTitle("Catálogo de Filmes");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        //---------------------------
        // TÍTULO
        //---------------------------

        JLabel lblTitulo = new JLabel("CATÁLOGO DE FILMES");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 28));
        lblTitulo.setBounds(280, 20, 400, 40);

        add(lblTitulo);

        //---------------------------
        // PAINEL CADASTRO
        //---------------------------

        JPanel painelCadastro = new JPanel();
        painelCadastro.setBorder(
                BorderFactory.createTitledBorder("Cadastrar Filme"));
        painelCadastro.setBounds(20, 80, 400, 250);
        painelCadastro.setLayout(null);

        add(painelCadastro);

        JLabel lblFilme = new JLabel("Título:");
        lblFilme.setBounds(20, 40, 100, 25);
        painelCadastro.add(lblFilme);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(120, 40, 220, 25);
        painelCadastro.add(txtTitulo);

        JLabel lblGenero = new JLabel("Gênero:");
        lblGenero.setBounds(20, 80, 100, 25);
        painelCadastro.add(lblGenero);

        cbGenero = new JComboBox<>();

        cbGenero.addItem("Ação");
        cbGenero.addItem("Comédia");
        cbGenero.addItem("Drama");
        cbGenero.addItem("Terror");
        cbGenero.addItem("Ficção");

        cbGenero.setBounds(120, 80, 220, 25);

        painelCadastro.add(cbGenero);

        JLabel lblAno = new JLabel("Ano:");
        lblAno.setBounds(20, 120, 100, 25);
        painelCadastro.add(lblAno);

        txtAno = new JTextField();
        txtAno.setBounds(120, 120, 220, 25);
        painelCadastro.add(txtAno);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(50, 180, 130, 30);
        painelCadastro.add(btnCadastrar);

        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(210, 180, 130, 30);
        painelCadastro.add(btnLimpar);

        //---------------------------
        // PAINEL BUSCA
        //---------------------------

        JPanel painelBusca = new JPanel();
        painelBusca.setBorder(
                BorderFactory.createTitledBorder("Buscar Filme"));
        painelBusca.setBounds(450, 80, 400, 250);
        painelBusca.setLayout(null);

        add(painelBusca);

        JLabel lblBuscar = new JLabel("Título:");
        lblBuscar.setBounds(20, 40, 100, 25);

        painelBusca.add(lblBuscar);

        txtBuscar = new JTextField();
        txtBuscar.setBounds(100, 40, 250, 25);

        painelBusca.add(txtBuscar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(120, 100, 150, 35);

        painelBusca.add(btnBuscar);

        //---------------------------
        // RESULTADO
        //---------------------------

        JPanel painelResultado = new JPanel();
        painelResultado.setBorder(
                BorderFactory.createTitledBorder("Resultado"));
        painelResultado.setBounds(20, 350, 830, 180);
        painelResultado.setLayout(new BorderLayout());

        add(painelResultado);

        txtResultado = new JTextArea();

        txtResultado.setEditable(false);

        painelResultado.add(
                new JScrollPane(txtResultado),
                BorderLayout.CENTER);

        setVisible(true);
    }

    // Getters

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public JComboBox<String> getCbGenero() {
        return cbGenero;
    }

    public JTextField getTxtAno() {
        return txtAno;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JTextArea getTxtResultado() {
        return txtResultado;
    }

    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }

    public static void main(String[] args) {
        new TelaFilmes();
    }
}