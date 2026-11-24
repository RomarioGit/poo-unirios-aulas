package aula07;

import javax.swing.*;

public class TelaTeste {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Minha Primeira Interface");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        JButton botao = new JButton("Clique aqui");

        botao.addActionListener(e ->
                JOptionPane.showMessageDialog(janela, "Você clicou no botão!"));

        painel.add(botao);
        janela.add(painel);
        janela.setVisible(true);
    }

}
