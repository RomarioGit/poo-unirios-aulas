package controller;

import view.TelaCadastroProfessor;
import view.TelaPrincipal;
import view.TelaPrincipalSimples;

import javax.swing.*;

public class ControllerPrincipal {

    private TelaPrincipalSimples view;

    public ControllerPrincipal() {

        this.view = new TelaPrincipalSimples();

        // Evento botão cadastro
        this.view.getBtnCadastrarProfessor().addActionListener(e -> abrirCadastrosProf());
        // Evento botão sair
        this.view.getBtnSair().addActionListener(e -> sairSistema());

    }

    // -----------------------------
    // MÉTODO ABRIR CADASTRO
    // -----------------------------

    private void abrirCadastrosProf() {

        JOptionPane.showMessageDialog(
                null,
                "Abrir tela de cadastros"
        );

        new ControllerProfessor();

    }

    // -----------------------------
    // MÉTODO SAIR
    // -----------------------------

    private void sairSistema() {

        int opcao = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (opcao == JOptionPane.YES_OPTION) {

            System.exit(0);

        }

    }

}