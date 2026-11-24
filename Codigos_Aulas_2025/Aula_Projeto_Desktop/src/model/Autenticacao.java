package model;

import java.util.ArrayList;

public class Autenticacao {
    private ArrayList<Usuario> usuarios;

    public Autenticacao() {
        this.usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "admin123", "Pedro Mafra"));
    }

    public boolean autenticar(String user, String senha){
        for(Usuario usuario: usuarios ){
            if(usuario.getUser().equals(user) && usuario.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
}
