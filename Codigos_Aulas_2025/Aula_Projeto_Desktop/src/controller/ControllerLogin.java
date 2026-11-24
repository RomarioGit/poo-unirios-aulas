package controller;

import model.Autenticacao;
import view.TelaLogin;

public class ControllerLogin {
    private Autenticacao model;
    private TelaLogin view;

    public ControllerLogin(Autenticacao model, TelaLogin view) {
        this.model = model;
        this.view = view;

        configurarEventos();
    }

    private void configurarEventos(){
        //Botão de Login (Entrar)
        view.getBtEntrar().addActionListener(e -> autenticarUsuario());
        view.getBtLimpar().addActionListener(e -> view.limparCampos());

    }

    private void autenticarUsuario(){
        //Verificando a existencia ou não do usuário informado na view na base de dados
        String user = view.getTxUsuario().getText();
        String senha = new String(view.getTxSenha().getPassword());

        if(user.isEmpty() || senha.isEmpty()){
            view.exibirMensagem("Preencha todos os campos!");
            return;
        }

        boolean login = model.autenticar(user, senha);

        if (login){
            view.exibirMensagem("Login Realizado com sucesso!");
            new ControllerPrincipal();
            view.dispose();
        }else{
            view.exibirMensagem("Usuário ou senha inválidos!");
        }
    }
}
