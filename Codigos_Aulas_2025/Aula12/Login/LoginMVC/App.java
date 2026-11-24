package Aulas2025_1.Aula12.Login.LoginMVC;

import Aulas2025_1.Aula12.Login.LoginMVC.controller.LoginController;
import Aulas2025_1.Aula12.Login.LoginMVC.view.TelaLogin;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaLogin loginView = new TelaLogin();
            LoginController loginController = new LoginController(loginView);
            loginView.setVisible(true);
        });
    }
}
