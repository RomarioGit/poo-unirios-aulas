-- Execute no MySQL (Workbench ou terminal) antes de rodar o programa.
SET NAMES utf8mb4;
CREATE DATABASE IF NOT EXISTS sistema_login;
USE sistema_login;

CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    cpf VARCHAR(14),
    telefone VARCHAR(20),
    email VARCHAR(100) UNIQUE NOT NULL,
    usuario VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);

-- Exemplo de usuário
INSERT INTO usuarios (nome, email, usuario, senha)
VALUES ('romario', 'admin@gmail.com', 'admin', 'admin123');

SELECT * FROM usuarios;
