package Aulas2025_1.Aula13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventosSwing extends JFrame {

    private JTextField campoTexto;
    private JLabel labelStatus;

    public EventosSwing() {
        setTitle("Exemplo de Eventos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // === ActionEvent ===
        JButton botaoClique = new JButton("Clique Aqui (ActionEvent)");
        botaoClique.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelStatus.setText("Botão clicado! (ActionEvent)");
            }
        });

        // === MouseEvent ===
        JLabel labelMouse = new JLabel("Passe o mouse aqui", SwingConstants.CENTER);
        labelMouse.setOpaque(true);
        labelMouse.setBackground(Color.LIGHT_GRAY);
        labelMouse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                labelMouse.setBackground(Color.YELLOW);
                labelStatus.setText("Mouse entrou na área! (MouseEvent)");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                labelMouse.setBackground(Color.LIGHT_GRAY);
                labelStatus.setText("Mouse saiu da área. (MouseEvent)");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                labelStatus.setText("Mouse clicado! (MouseEvent)");
            }
        });

        // === KeyEvent ===
        campoTexto = new JTextField();
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                labelStatus.setText("Tecla digitada: " + e.getKeyChar() + " (KeyEvent)");
            }
        });

        // === Label de status ===
        labelStatus = new JLabel("Aguardando ação...");
        labelStatus.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // === Painel inferior com JTextField + Status ===
        JPanel painelInferior = new JPanel(new BorderLayout());
        painelInferior.add(campoTexto, BorderLayout.NORTH);

        labelStatus = new JLabel("Aguardando ação...");
        labelStatus.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        painelInferior.add(labelStatus, BorderLayout.SOUTH);


        // === Layout final ===
        add(botaoClique, BorderLayout.NORTH);
        add(labelMouse, BorderLayout.CENTER);
        add(painelInferior, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventosSwing();
    }
}
