package controller;

import model.Usuario;
import model.UsuarioDAO;
import view.TelaCadastro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerCadastro {

    private TelaCadastro view;
    private UsuarioDAO dao = new UsuarioDAO();

    public ControllerCadastro(TelaCadastro view) {
        this.view = view;

        this.view.getBtnCriarConta().addActionListener(e -> cadastrar());
        this.view.getLblLogin().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                view.dispose();                 // volta para a tela de login, que continua aberta
            }
        });
    }

    private void cadastrar() {
        String nome = view.getNome();
        String cpf = view.getCPF();
        String telefone = view.getTelefone();
        String email = view.getEmail();
        String usuario = view.getUsuario();
        String senha = view.getSenha();
        String confirmar = view.getConfirmarSenha();

        if (email.isEmpty() || usuario.isEmpty() || senha.isEmpty()) {
            view.exibirMensagem("Preencha e-mail, usuário e senha.");
            return;
        }

        if (!senha.equals(confirmar)) {
            view.exibirMensagem("As senhas não conferem!");
            return;
        }

        Usuario u = new Usuario(nome, cpf, telefone, email, usuario, senha);

        boolean sucesso = dao.inserir(u);

        if (sucesso) {
            view.exibirMensagem("Usuário cadastrado com sucesso!");
            view.limparCampos();
        } else {
            view.exibirMensagem("Erro ao cadastrar. Usuário ou e-mail já existe.");
        }
    }
}
