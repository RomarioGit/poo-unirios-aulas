package Aulas2025_1.Aula15;

public class App {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Calcula model = new Calcula();
            CalculaView view = new CalculaView();
            new CalculaController(model, view);
        });
    }
}
