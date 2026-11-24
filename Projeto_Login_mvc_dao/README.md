# Sistema de Login: MVC + DAO + JDBC (MySQL)

## Organização
```
src/
  model/       Usuario.java        (entidade)
               UsuarioDAO.java     (acesso ao banco: inserir, autenticar)
               Conexao.java        (URL, usuário e senha do MySQL)
  view/        TelaLogin.java
               TelaCadastro.java
  controller/  ControllerLogin.java
               ControllerCadastro.java
  Main.java                        (abre a tela de login)
  TesteUsuarioDAO.java             (testa o DAO sem tela)
sql/sistema_login.sql              (cria o banco, a tabela e o usuário admin)
```

## Como executar
1. No MySQL, execute `sql/sistema_login.sql`.
2. Baixe o MySQL Connector/J (mysql-connector-j-8.x.jar) em dev.mysql.com/downloads/connector/j/ e coloque em `lib/`.
3. Em `model/Conexao.java`, ajuste USER e PASSWORD para os do seu MySQL.
4. Compile (na pasta do projeto):
   - Linux/Mac: `javac -d out $(find src -name "*.java")`
   - Windows (PowerShell): `javac -d out (Get-ChildItem src -Recurse -Filter *.java).FullName`
5. Execute (no Windows troque `:` por `;`):
   - Programa: `java -cp out:lib/mysql-connector-j-8.x.jar Main`
   - Teste do DAO: `java -cp out:lib/mysql-connector-j-8.x.jar TesteUsuarioDAO`

Usuário de exemplo: admin / admin123.
Em IDE (Eclipse, NetBeans, IntelliJ): copie as pastas de `src` e adicione o .jar do Connector/J às bibliotecas do projeto.
