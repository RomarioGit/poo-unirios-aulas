package controller;

import model.Professor;
import model.Sistema;
import view.TelaCadastroProfessor;

import javax.swing.*;

public class ControllerProfessor {

    private TelaCadastroProfessor view;
    private Sistema model;

    public ControllerProfessor() {

        this.view = new TelaCadastroProfessor();
        this.model = new Sistema();
        // =========================================
        // EVENTO BOTÃO CADASTRAR
        // =========================================

        this.view.getBtnCadastrar()
                .addActionListener(e -> cadastrarProfessor());

        // =========================================
        // EVENTO BOTÃO LIMPAR
        // =========================================

        this.view.getBtnLimpar()
                .addActionListener(e -> limparCampos());

        // =========================================
        // EVENTO BOTÃO VOLTAR
        // =========================================

        this.view.getBtnVoltar()
                .addActionListener(e -> voltar());

    }

    // =========================================
    // MÉTODO CADASTRAR
    // =========================================

    private void cadastrarProfessor() {

        String nome =
                view.getTxtNome().getText();

        String cpf =
                view.getTxtCPF().getText();

        String contato =
                view.getTxtContato().getText();

        String formacao =
                view.getTxtFormacao().getText();

        String especializacao =
                view.getTxtEspecializacao().getText();

        // =====================================
        // VALIDAÇÃO
        // =====================================

        if (nome.isEmpty() ||
                cpf.isEmpty() ||
                contato.isEmpty() ||
                formacao.isEmpty() ||
                especializacao.isEmpty()) {

            view.exibirMensagem(
                    "Preencha todos os campos!"
            );

            return;
        }

        // =====================================
        // CADASTRO
        // =====================================

        view.exibirMensagem(
                "Professor cadastrado com sucesso!"
        );

        view.limparCampos();

        // =====================================
        // CRIANDO OBJETO PROFESSOR
        // =====================================

        Professor professor = new Professor(
                nome,
                cpf,
                contato,
                formacao,
                especializacao
        );

        // =====================================
        // INSERINDO NO ARRAYLIST
        // =====================================

        model.cadastrarProfessor(professor);

        // =====================================
        // MENSAGEM
        // =====================================

    }

    // =========================================
    // MÉTODO LIMPAR
    // =========================================

    private void limparCampos() {

        view.limparCampos();

    }

    // =========================================
    // MÉTODO VOLTAR
    // =========================================

    private void voltar() {

        int opcao = JOptionPane.showConfirmDialog(
                null,
                "Deseja voltar?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (opcao == JOptionPane.YES_OPTION) {

            view.dispose();

        }

    }
}