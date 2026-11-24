package Aulas2025_1.Aula11;

import java.util.ArrayList;

public class Autenticacao {
    private ArrayList<Usuario> usuarios;

    public Autenticacao() {
        this.usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "12345","Adminiistrador"));
    }

    public boolean autenticar(String user, String pass){
        for(Usuario u: usuarios){
            if (u.getUsername().equals(user) && u.getSenha().equals(pass)) {
                return true;
            }
        }return false;
    }
}
