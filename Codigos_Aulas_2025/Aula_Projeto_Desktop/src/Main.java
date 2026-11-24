import controller.ControllerLogin;
import model.Autenticacao;
import view.TelaLogin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TelaLogin view = new TelaLogin();
        Autenticacao model = new Autenticacao();

        ControllerLogin login = new ControllerLogin(model, view);
    }
}