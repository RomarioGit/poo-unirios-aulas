package Aulas2025_1.Aula14;

import javax.swing.*;
import java.awt.*;

public class CalculadoraView extends JFrame {
    public JTextField campoNumero1 = new JTextField(10);
    public JTextField campoNumero2 = new JTextField(10);
    public JButton botaoSomar = new JButton("+");
    public JButton botaoSubtrair = new JButton("-");
    public JButton botaoMultiplicar = new JButton("x");
    public JButton botaoDividir = new JButton("/");
    public JLabel labelResultado = new JLabel("Resultado: ");

    public CalculadoraView() {
        super("Calculadora MVC");
        setLayout(new GridLayout(3, 2, 5, 5));

        add(new JLabel("Número 1:"));
        add(campoNumero1);
        add(new JLabel("Número 2:"));
        add(campoNumero2);

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoSomar);
        painelBotoes.add(botaoSubtrair);
        painelBotoes.add(botaoMultiplicar);
        painelBotoes.add(botaoDividir);
        add(painelBotoes);

        add(labelResultado);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}