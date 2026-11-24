package Aulas2025_1.Aula06;

public class Teste {
    public static void main(String[] args) {
        Veiculo carro = new Carro("honda", "civic", 2020, 4);
        System.out.println(carro.acelerar());
        System.out.println(carro.acelerar());
        System.out.println(carro.acelerar());

        Veiculo moto = new Moto("yamaha", "lander",2019, false);
        System.out.println(moto.acelerar());
        System.out.println(moto.acelerar());
        System.out.println(moto.acelerar());

    }
}
