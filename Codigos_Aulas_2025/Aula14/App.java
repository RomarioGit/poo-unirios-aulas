package Aulas2025_1.Aula14;

public class App {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            CalculadoraModel model = new CalculadoraModel();
            CalculadoraView view = new CalculadoraView();
            new CalculadoraController(model, view);
        });
    }
}
