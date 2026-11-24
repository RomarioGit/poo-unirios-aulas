package Aulas2025_1.Aula13;

import javax.swing.*;
import java.awt.*;

public class ComponenteSwing extends JFrame {
    private JTextArea textArea;
    private JComboBox<String> comboCores;
    private JRadioButton radioOp1, radioOp2;
    private JCheckBox check1, check2;

    public ComponenteSwing() {
        setTitle("Exemplo Completo com Swing");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // === ToolBar com botões ===
        JToolBar toolBar = new JToolBar();
        JButton btnLimpar = new JButton("Limpar");
        JButton btnEnviar = new JButton("Enviar");

        toolBar.add(btnLimpar);
        toolBar.add(btnEnviar);
        add(toolBar, BorderLayout.NORTH);

        // === Área de texto com rolagem ===
        textArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // === Painel inferior com demais elementos ===
        JPanel painelInferior = new JPanel();
        painelInferior.setLayout(new GridLayout(3, 2));

        // ComboBox
        comboCores = new JComboBox<>(new String[]{"Vermelho", "Verde", "Azul"});
        painelInferior.add(new JLabel("Escolha uma cor:"));
        painelInferior.add(comboCores);

        // RadioButtons
        radioOp1 = new JRadioButton("Opção A");
        radioOp2 = new JRadioButton("Opção B");
        ButtonGroup grupoRadios = new ButtonGroup();
        grupoRadios.add(radioOp1);
        grupoRadios.add(radioOp2);
        painelInferior.add(radioOp1);
        painelInferior.add(radioOp2);

        // CheckBoxes
        check1 = new JCheckBox("Aceito os termos");
        check2 = new JCheckBox("Desejo receber novidades");
        painelInferior.add(check1);
        painelInferior.add(check2);

        add(painelInferior, BorderLayout.SOUTH);

        // === Ações dos botões ===
        btnLimpar.addActionListener(e -> limparCampos());

        btnEnviar.addActionListener(e -> {
            StringBuilder mensagem = new StringBuilder();
            mensagem.append("Texto: ").append(textArea.getText()).append("\n");
            mensagem.append("Cor selecionada: ").append(comboCores.getSelectedItem()).append("\n");
            mensagem.append("Opção: ");
            if (radioOp1.isSelected()) mensagem.append("A");
            else if (radioOp2.isSelected()) mensagem.append("B");
            else mensagem.append("Nenhuma");
            mensagem.append("\n");
            mensagem.append("Check 1: ").append(check1.isSelected()).append("\n");
            mensagem.append("Check 2: ").append(check2.isSelected()).append("\n");

            JOptionPane.showMessageDialog(this, mensagem.toString(), "Dados Enviados", JOptionPane.INFORMATION_MESSAGE);
        });

        setVisible(true);
    }

    private void limparCampos() {
        textArea.setText("");
        comboCores.setSelectedIndex(0);
        radioOp1.setSelected(false);
        radioOp2.setSelected(false);
        check1.setSelected(false);
        check2.setSelected(false);
    }

    public static void main(String[] args) {
        //SwingUtilities.invokeLater(ComponenteSwing::new);
        new ComponenteSwing();
    }
}
