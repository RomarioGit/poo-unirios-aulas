package Aulas2025_1.Aula07.Interface;

public class Main {
    public static void main(String[] args) {
        Dispositivo televisao = new Televisao();
        Dispositivo celular = new Celular();

        // Testando a televisão
        System.out.println("--- Televisão ---");
        System.out.println(televisao.ligado());
        System.out.println(televisao.status());
        System.out.println(televisao.desligado());
        System.out.println(televisao.status());

        // Testando o smartphone
        System.out.println("\n--- Smartphone ---");
        System.out.println(celular.ligado());
        System.out.println(celular.status());
        System.out.println(celular.desligado());
        System.out.println(celular.status());
    }
}
