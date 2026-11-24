package Aulas2025_1.Aula12.Login.LoginMVC.controller;

import Aulas2025_1.Aula12.Login.LoginMVC.model.Usuario;
import Aulas2025_1.Aula12.Login.LoginMVC.model.UsuarioDAO;

public class AutenticacaoController {
    private UsuarioDAO usuarioDAO;

    public AutenticacaoController() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public boolean autenticar(String username, String senha) {
        return usuarioDAO.autenticar(username, senha);
    }

    public boolean cadastrarUsuario(String username, String senha, String nome) {
        if (usuarioDAO.usuarioExiste(username)) {
            return false;
        }

        Usuario novoUsuario = new Usuario(username, senha, nome);
        return usuarioDAO.cadastrarUsuario(novoUsuario);
    }
}
