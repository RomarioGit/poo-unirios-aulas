package controller;

import model.Usuario;
import view.TelaLogin;
import view.TelaPrincipal;

/**
 * CONTROLLER da tela inicial: é o ÚNICO que conhece o Usuario (model) e a
 * TelaPrincipal (view). Converte os dados do Usuario em textos para a View.
 */
public class ControllerPrincipal {

    private TelaPrincipal view;

    public ControllerPrincipal(TelaPrincipal view, Usuario usuario) {
        this.view = view;

        String primeiroNome = (usuario.getNome() == null || usuario.getNome().isEmpty())
                ? usuario.getUsuario() : usuario.getNome().split(" ")[0];

        this.view.exibirDados("Bem-vindo, " + primeiroNome + "!",
                usuario.getNome(), usuario.getUsuario(), usuario.getEmail(),
                usuario.getCpf(), usuario.getTelefone());

        this.view.getBtnSair().addActionListener(e -> sair());
    }

    private void sair() {
        if (view.confirmarSaida()) {
            view.dispose();                       // fecha a tela inicial
            TelaLogin login = new TelaLogin();    // e volta para o login
            new ControllerLogin(login);
            login.setVisible(true);
        }
    }
}
