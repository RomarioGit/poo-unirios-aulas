package controller;

import model.Professor;
import model.Sistema;
import view.TelaListagem;

public class ControllerListagemProfessor {

    private TelaListagem view;
    private Sistema model;

    public ControllerListagemProfessor(Sistema model) {

        this.model = model;

        this.view =
                new TelaListagem(
                        "Listagem de Professores"
                );

        configurarTela();

        atualizarTabela();
    }

    private void configurarTela() {

        // DEFINIR COLUNAS
        view.definirColunas(
                new String[]{
                        "Nome",
                        "CPF",
                        "Contato",
                        "Formação",
                        "Especialização"
                }
        );

        // BOTÃO VOLTAR
        view.getBtnVoltar()
                .addActionListener(
                        e -> view.dispose()
                );

        // BOTÃO ATUALIZAR
        view.getBtnAtualizar()
                .addActionListener(
                        e -> atualizarTabela()
                );
    }

    private void atualizarTabela() {

        // limpar tabela
        view.limparTabela();

        // preencher linhas
        for (Professor p :
                model.listarProfessores()) {

            view.adicionarLinha(
                    new Object[]{
                            p.getNome(),
                            p.getCpf(),
                            p.getEmail(),
                            p.getFormacao(),
                            p.getEspecializacao()
                    }
            );
        }
    }
}