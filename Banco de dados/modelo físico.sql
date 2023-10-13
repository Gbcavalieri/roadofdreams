CREATE DATABASE agencia;
use agencia;

CREATE TABLE compra 
( 
 id_compra INT auto_increment PRIMARY KEY,  
 forma_pagamento VARCHAR(30),  
 data_compra DATE,  
 quantidade_compra INT,  
 valortotal_compra FLOAT,  
 agencia_area VARCHAR(30),  
 passagem_compra INT,  
 id_usuario INT,  
 id_voo INT  
); 

CREATE TABLE usuario 
( 
 id_usuario  INT auto_increment PRIMARY KEY,  
 nome_usuario VARCHAR(20),  
 sobrenome_usuario VARCHAR(20),  
 email_usuario VARCHAR(45),  
 celular_usuario VARCHAR(20),  
 genero_usuario VARCHAR(20),  
 senha_usuario VARCHAR(100),  
 idcompra INT  
); 

CREATE TABLE voo 
( 
 id_voo INT auto_increment PRIMARY KEY,  
 nome_agencia VARCHAR(20),  
 destino_agencia VARCHAR(20),  
 origem_agencia VARCHAR(20),  
 codigo_voo VARCHAR(30),  
 quantidade_lugares INT,  
 preco_voo FLOAT,  
 dataida_voo DATE,  
 datavolta_voo DATE
); 

CREATE TABLE contato 
( 
 id_contato INT  auto_increment PRIMARY KEY,  
 nome_contato VARCHAR(30),  
 email_contato VARCHAR(45),  
 assunto_contato VARCHAR(50),  
 telefone_contato VARCHAR(20),  
 mensagem_cotato VARCHAR( 300)
); 
