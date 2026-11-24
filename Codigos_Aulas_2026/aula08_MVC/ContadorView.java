package aula08_MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ContadorView extends JFrame {
    private JLabel lbContador;
    private JButton btIncremento;
    private JButton btDecremento;

    public ContadorView() throws HeadlessException {
        lbContador = new JLabel("Contador: 0");
        btIncremento = new JButton("+");
        btDecremento = new JButton("-");

        setLayout(new FlowLayout());
        add(lbContador);
        add(btIncremento);
        add(btDecremento);

        setTitle("Exemplo - MVC");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    public void atualizarContador(int valor){
        lbContador.setText("Contador: "+valor);
    }

    public void addListenerIncremento(ActionListener listener){
        btIncremento.addActionListener(listener);
    }

    public void addListenerDecremento(ActionListener listener){
        btDecremento.addActionListener(listener);
    }

    public JLabel getLbContador() {
        return lbContador;
    }

    public JButton getBtIncremento() {
        return btIncremento;
    }

    public JButton getBtDecremento() {
        return btDecremento;
    }
}
