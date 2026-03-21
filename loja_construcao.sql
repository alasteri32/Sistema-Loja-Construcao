CREATE DATABASE loja_construcao;
USE loja_construcao;

CREATE TABLE produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    categoria VARCHAR(50),
    quantidade INT,
    preco DOUBLE
);

CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    cpf VARCHAR(11),
    telefone VARCHAR(15)
);

INSERT INTO produto (nome, categoria, quantidade, preco) VALUES
('Cimento Votoran', 'Básico', 400, 39),
('Areia Fina', 'Material', 200, 20);

ALTER TABLE cliente ADD endereco VARCHAR(150);