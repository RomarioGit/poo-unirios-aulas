package Aulas2025_1.Aula10;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionarios(Funcionario funcionario){
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void listFuncionarios(){
        System.out.println("---Listando Funcionários do Departamento "+nome+"---");
        for (Funcionario f: funcionarios){
            System.out.println(f.exibirDados());
        }

    }
}
