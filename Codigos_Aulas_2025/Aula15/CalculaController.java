package Aulas2025_1.Aula15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculaController {
    private Calcula model;
    private CalculaView view;

    public CalculaController(Calcula model, CalculaView view) {
        this.model = model;
        this.view = view;

        view.getBotaoPotencia().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double base = Double.parseDouble(view.getCampoValor1().getText());
                    double expoente = Double.parseDouble(view.getCampoValor2().getText());
                    double resultado = model.potencia(base, expoente);
                    view.getLabelResultado().setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(view, "Valores inválidos.");
                }
            }
        });

        view.getBotaoRaiz().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor = Double.parseDouble(view.getCampoValor1().getText());
                    double resultado = model.raizQuadrada(valor);
                    view.getLabelResultado().setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(view, "Valor inválido.");
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(view, ex.getMessage());
                }
            }
        });
    }
}
