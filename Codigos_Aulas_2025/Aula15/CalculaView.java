package Aulas2025_1.Aula15;

import javax.swing.*;
import java.awt.*;

public class CalculaView extends JFrame {
    private JTextField campoValor1;
    private JTextField campoValor2;
    private JButton botaoPotencia;
    private JButton botaoRaiz;
    private JLabel labelResultado;

    public CalculaView() {
        super("Calculadora Potencia/Raiz");
        setLayout(new GridLayout(4, 2, 10, 10));

        campoValor1 = new JTextField(10);
        campoValor2 = new JTextField(10);
        botaoPotencia = new JButton("Potencia");
        botaoRaiz = new JButton("Raiz Quadrada");
        labelResultado = new JLabel("Resultado: ");

        add(new JLabel("Valor 1:"));
        add(campoValor1);
        add(new JLabel("Valor 2 (expoente):"));
        add(campoValor2);
        add(botaoPotencia);
        add(botaoRaiz);
        add(labelResultado);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public JTextField getCampoValor1() {
        return campoValor1;
    }

    public void setCampoValor1(JTextField campoValor1) {
        this.campoValor1 = campoValor1;
    }

    public JTextField getCampoValor2() {
        return campoValor2;
    }

    public void setCampoValor2(JTextField campoValor2) {
        this.campoValor2 = campoValor2;
    }

    public JButton getBotaoPotencia() {
        return botaoPotencia;
    }

    public void setBotaoPotencia(JButton botaoPotencia) {
        this.botaoPotencia = botaoPotencia;
    }

    public JButton getBotaoRaiz() {
        return botaoRaiz;
    }

    public void setBotaoRaiz(JButton botaoRaiz) {
        this.botaoRaiz = botaoRaiz;
    }

    public JLabel getLabelResultado() {
        return labelResultado;
    }

    public void setLabelResultado(JLabel labelResultado) {
        this.labelResultado = labelResultado;
    }
}
