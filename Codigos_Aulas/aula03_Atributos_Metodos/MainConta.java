package aula03_Atributos_Metodos;

public class MainConta {
    public static void main(String[] args) {
        System.out.println("--- Criando Conta ---");
        ContaBancaria conta = new ContaBancaria("João Grilo", 100);
        conta.exibirExtrato();

        System.out.println("\n--- Testando Depósitos ---");
        conta.depositar(500);
        conta.depositar(-100);
        conta.exibirExtrato();

        System.out.println("\n--- Testando Saques ---");
        conta.sacar(300);
        conta.sacar(5000);
        conta.sacar(0);
        conta.exibirExtrato();

        System.out.println("\n--- Testando Getters e Setters ---");
        System.out.println("Saldo: R$ "+conta.getSaldo());
        System.out.println("Titular: "+conta.getTitular());
        conta.setTitular("Xicó");
        System.out.println("Titular: "+conta.getTitular());
        conta.setTitular("   ");
        conta.setTitular(null);
        System.out.println("Titular: "+conta.getTitular());

        conta.exibirExtrato();
    }
}
