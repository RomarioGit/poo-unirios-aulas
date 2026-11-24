package controller;

import model.Professor;
import model.Sistema;
import view.TelaBuscarProfessor;

import java.util.ArrayList;

public class ControllerBuscarProfessor {

    private TelaBuscarProfessor view;
    private Sistema model;

    public ControllerBuscarProfessor(Sistema model) {

        this.model = model;
        this.view = new TelaBuscarProfessor();

        configurarEventos();
    }

    private void configurarEventos() {

        // BOTÃO BUSCAR
        view.getBtBuscar()
                .addActionListener(
                        e -> buscarProfessor()
                );

        // BOTÃO LIMPAR
        view.getBtLimpar()
                .addActionListener(
                        e -> view.limparBusca()
                );

        // BOTÃO VOLTAR
        view.getBtVoltar()
                .addActionListener(
                        e -> view.dispose()
                );
    }

    private void buscarProfessor() {

        String textoBusca =
                view.getTxBusca()
                        .getText()
                        .trim();

        if (textoBusca.isEmpty()) {
            view.exibirMensagem(
                    "Digite algo para buscar."
            );
            return;
        }

        ArrayList<Professor> resultados = null;

        // limpar tabela antes de mostrar nova busca
        view.limparTabela();

        //---------------------------------
        // BUSCA POR NOME
        //---------------------------------
        if (view.getRbNome().isSelected()) {

            resultados =
                    model.buscarProfessorPorNome(
                            textoBusca
                    );
        }

        //---------------------------------
        // BUSCA POR CPF
        //---------------------------------
        else if (view.getRbCpf().isSelected()) {

            resultados =
                    model.buscarProfessorPorCpf(
                            textoBusca
                    );
        }

        //---------------------------------
        // BUSCA POR FORMAÇÃO
        //---------------------------------
        else {

            resultados =
                    model.buscarProfessorPorFormacao(
                            textoBusca
                    );
        }

        //---------------------------------
        // VERIFICAR RESULTADOS
        //---------------------------------
        if (resultados.isEmpty()) {

            view.exibirMensagem(
                    "Nenhum professor encontrado."
            );

            return;
        }

        //---------------------------------
        // PREENCHER TABELA
        //---------------------------------
        for (Professor p : resultados) {

            view.adicionarLinha(
                    new Object[]{
                            p.getNome(),
                            p.getCpf(),
                            p.getCpf(),
                            p.getFormacao(),
                            p.getEspecializacao()
                    }
            );
        }
    }
}