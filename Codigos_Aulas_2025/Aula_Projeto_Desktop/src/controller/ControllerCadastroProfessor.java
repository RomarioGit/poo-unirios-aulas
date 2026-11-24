package controller;

import model.Professor;
import model.Sistema;
import view.TelaCadastroProfessor;

import javax.swing.*;

public class ControllerCadastroProfessor {

    private TelaCadastroProfessor view;
    private Sistema model;

    public ControllerCadastroProfessor(Sistema model) {

        this.model = model;

        this.view = new TelaCadastroProfessor();

        configurarEventos();
    }

    private void configurarEventos() {

        // BOTÃO LIMPAR
        view.getBtLimparCampos()
                .addActionListener(
                        e -> view.limparCampos()
                );

        // BOTÃO VOLTAR
        view.getBtVoltar()
                .addActionListener(
                        e -> voltar()
                );

        // BOTÃO CADASTRAR
        view.getBtCadastar()
                .addActionListener(
                        e -> cadastrarProfessor()
                );
    }

    private void cadastrarProfessor() {

        String nome =
                view.getTxNome().getText();

        String cpf =
                view.getTxCpf().getText();

        String contato =
                view.getTxEmail().getText();

        String formacao =
                view.getTxFormacao().getText();

        String especializacao =
                view.getTxEspecializao().getText();

        // VALIDAÇÃO
        if (nome.isEmpty()
                || cpf.isEmpty()
                || contato.isEmpty()
                || formacao.isEmpty()
                || especializacao.isEmpty()) {

            view.exibirMensagem(
                    "Preencha todos os campos!"
            );

            return;
        }

        // CRIAR OBJETO
        Professor professor =
                new Professor(
                        nome,
                        cpf,
                        contato,
                        formacao,
                        especializacao
                );

        // INSERIR NO ARRAYLIST
        model.addProfessor(
                professor
        );

        view.exibirMensagem(
                "Professor cadastrado com sucesso!"
        );

        view.limparCampos();
    }

    private void voltar() {

        int opcao =
                JOptionPane.showConfirmDialog(
                        null,
                        "Deseja voltar?",
                        "Confirmação",
                        JOptionPane.YES_NO_OPTION
                );

        if (opcao ==
                JOptionPane.YES_OPTION) {

            view.dispose();
        }
    }
}