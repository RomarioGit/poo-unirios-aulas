package aula04;

public class Vendas {
    public static void main(String[] args) {
        System.out.println("=== Funcionário Genérico ===");
        Funcionario funcionario1 = new Funcionario("Genésio", 1600);
        funcionario1.exibirDados();

        System.out.println("\n=== Gerente ===");
        Gerente gerente = new Gerente("Daniel", 4000, 500);
        gerente.exibirDados();

        System.out.println("\n=== Vendedor ===");
        Vendedor vendedor = new Vendedor("Pierre", 2000, 1000, 0.1);
        vendedor.exibirDados();
    }
}
