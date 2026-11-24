package Aulas2025_1.Aula06;

public class Oficina {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 4);
        System.out.println(meuCarro.toString());
        //System.out.println("Carro: " + meuCarro.getMarca() + " " + meuCarro.getModelo() + " " + meuCarro.getAno());
        System.out.println(meuCarro.acelerar());
        System.out.println(meuCarro.abrirPorta());

        // Criando um objeto da classe Moto
        Moto minhaMoto = new Moto("Honda", "CBR 600", 2021, true);
        System.out.println("Moto: " + minhaMoto.getMarca() + " " + minhaMoto.getModelo() + " " + minhaMoto.getAno());
        System.out.println(minhaMoto.frear());
        System.out.println(minhaMoto.empinar());

        //Criando objeto diferente

        Veiculo veiculo = new Carro("Chevrolet", "S10", 2022, 4);
        System.out.println(veiculo);
        //Carro carro = new Veiculo("Chevrolet", "S10", 2022);
    }
}
