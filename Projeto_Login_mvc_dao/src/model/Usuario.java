package model;

/** MODEL (entidade): os dados de um usuário. Não conhece tela nem banco. */
public class Usuario {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String usuario;
    private String senha;

    public Usuario(String nome, String cpf, String telefone,
                   String email, String usuario, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getUsuario() { return usuario; }
    public String getSenha() { return senha; }
}
