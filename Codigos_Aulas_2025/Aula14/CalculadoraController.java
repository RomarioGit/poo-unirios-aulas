package Aulas2025_1.Aula14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {
    private CalculadoraModel model;
    private CalculadoraView view;

    public CalculadoraController(CalculadoraModel model, CalculadoraView view) {
        this.model = model;
        this.view = view;

        view.botaoSomar.addActionListener(new OperacaoListener('+'));
        view.botaoSubtrair.addActionListener(new OperacaoListener('-'));
        view.botaoMultiplicar.addActionListener(new OperacaoListener('*'));
        view.botaoDividir.addActionListener(new OperacaoListener('/'));
    }

    class OperacaoListener implements ActionListener {
        private char operador;

        public OperacaoListener(char operador) {
            this.operador = operador;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = Double.parseDouble(view.campoNumero1.getText());
                double num2 = Double.parseDouble(view.campoNumero2.getText());
                double resultado = 0;

                switch (operador) {
                    case '+': resultado = model.somar(num1, num2); break;
                    case '-': resultado = model.subtrair(num1, num2); break;
                    case '*': resultado = model.multiplicar(num1, num2); break;
                    case '/': resultado = model.dividir(num1, num2); break;
                }

                view.labelResultado.setText("Resultado: " + resultado);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view, "Por favor, insira números válidos.");
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(view, ex.getMessage());
            }
        }
    }
}
