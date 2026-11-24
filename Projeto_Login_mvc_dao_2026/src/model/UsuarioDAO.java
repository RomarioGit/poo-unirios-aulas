package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public boolean inserir(Usuario u) {
        String sql = "INSERT INTO usuarios (nome, cpf, telefone, email, usuario, senha) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getCpf());
            stmt.setString(3, u.getTelefone());
            stmt.setString(4, u.getEmail());
            stmt.setString(5, u.getUsuario());
            stmt.setString(6, u.getSenha());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();  // mostra erro REAL
            return false;
        }
    }

    public Usuario autenticar(String usuario, String senha) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                            rs.getString("nome"),
                            rs.getString("cpf"),
                            rs.getString("telefone"),
                            rs.getString("email"),
                            rs.getString("usuario"),
                            rs.getString("senha")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao autenticar: " + e.getMessage());
        }

        return null;
    }
}
