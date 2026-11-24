package Aulas2025_1.Aula06;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private int aceleracao = 80;

    private int velocidadeAtual;
    final int VELOCIDADE_MAXIMA;


    public Veiculo(String marca, String modelo, int ano, int vMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        VELOCIDADE_MAXIMA = vMaxima;
    }

    public Veiculo(String marca, String modelo, int ano, int aceleracao, int vMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.aceleracao = aceleracao;
        VELOCIDADE_MAXIMA = vMaxima;
    }

    // Método comum a todos os veículos
    public String acelerar() {
        if (velocidadeAtual + aceleracao > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
            return "Velocidade Máxima atingida!!!";
        }else {
            velocidadeAtual += aceleracao;
            return "O veículo está acelerando... " + velocidadeAtual + "km/h";
        }
    }

    // Método comum a todos os veículos
    public String frear() {
        if (velocidadeAtual >= aceleracao){
            velocidadeAtual -= aceleracao;
            return "O veículo está freando...";
        }else {
            velocidadeAtual = 0;
            return "Veículo parado...";
        }
    }


    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
}
