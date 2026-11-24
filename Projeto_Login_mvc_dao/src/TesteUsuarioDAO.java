import model.Usuario;
import model.UsuarioDAO;

/** Testa o DAO sem tela. */
public class TesteUsuarioDAO {

    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        System.out.println("Login admin/admin123: " + (dao.autenticar("admin", "admin123") != null));
        System.out.println("Login admin/errada:   " + (dao.autenticar("admin", "errada") != null));

        Usuario novo = new Usuario("Ana Souza", "123.456.789-00", "(27) 99999-0000",
                "ana@email.com", "ana", "ana123");
        System.out.println("Inserir ana:           " + dao.inserir(novo));
        System.out.println("Inserir ana de novo:   " + dao.inserir(novo));   // UNIQUE: deve falhar
        System.out.println("Login ana/ana123:      " + (dao.autenticar("ana", "ana123") != null));

        // tentativa de SQL Injection: com PreparedStatement NÃO entra
        System.out.println("Injection no usuario:  " + (dao.autenticar("' OR '1'='1", "' OR '1'='1") != null));
    }
}
