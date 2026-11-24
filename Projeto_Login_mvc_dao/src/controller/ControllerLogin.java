package controller;

import model.Usuario;
import model.UsuarioDAO;
import view.TelaCadastro;
import view.TelaLogin;
import view.TelaPrincipal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerLogin {

    private TelaLogin view;
    private UsuarioDAO dao = new UsuarioDAO();

    public ControllerLogin(TelaLogin view) {
        this.view = view;

        this.view.getBtnLogin().addActionListener(e -> login());
        this.view.getLblCreate().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TelaCadastro tela = new TelaCadastro();
                new ControllerCadastro(tela);
                tela.setVisible(true);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                view.getLblCreate().setText("<html><u>Create Account</u></html>");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                view.getLblCreate().setText("Create Account");
            }
        });
    }

    private void login() {
        String usuario = view.getUsuario();
        String senha = view.getSenha();

        Usuario u = dao.autenticar(usuario, senha);

        if (u != null) {
            TelaPrincipal principal = new TelaPrincipal();     // a View não recebe o Usuario
            new ControllerPrincipal(principal, u);             // o Controller faz a ponte
            principal.setVisible(true);
            view.dispose();                                    // fecha a tela de login
        } else {
            view.exibirMensagem("Usuário ou senha incorretos.");
        }
    }
}
