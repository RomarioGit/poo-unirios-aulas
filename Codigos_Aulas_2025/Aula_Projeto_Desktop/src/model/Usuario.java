package model;

public class Usuario {
    private String user;
    private String senha;
    private String nome;

    public Usuario(String user, String senha, String nome) {
        this.user = user;
        this.senha = senha;
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
