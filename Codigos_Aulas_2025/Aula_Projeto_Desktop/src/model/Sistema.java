package model;

import java.util.ArrayList;

public class Sistema {

    // =========================================
    // ARRAYLIST DE PROFESSORES
    // =========================================

    private ArrayList<Professor> listaProfessores;

    // =========================================
    // CONSTRUTOR
    // =========================================

    public Sistema() {

        listaProfessores = new ArrayList<>();

    }

    // =========================================
    // CADASTRAR PROFESSOR
    // =========================================

    public void cadastrarProfessor(Professor professor) {

        listaProfessores.add(professor);

    }

    // =========================================
    // LISTAR PROFESSORES
    // =========================================

    public ArrayList<Professor> listarProfessores() {

        return listaProfessores;

    }

    // =========================================
    // BUSCAR PROFESSOR POR CPF
    // =========================================

    public Professor buscarProfessor(String cpf) {

        for (Professor professor : listaProfessores) {

            if (professor.getCpf().equals(cpf)) {

                return professor;

            }

        }

        return null;

    }

    // =========================================
    // REMOVER PROFESSOR
    // =========================================

    public boolean removerProfessor(String cpf) {

        Professor professor = buscarProfessor(cpf);

        if (professor != null) {

            listaProfessores.remove(professor);

            return true;

        }

        return false;

    }

}