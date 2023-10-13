package com.roadofdreams.menu;

import java.sql.Connection;
import java.util.Scanner;

import com.roadofdreams.dao.UsuarioDAO;
import com.roadofdreams.database.DatabaseConnection;
import com.roadofdreams.model.Usuario;

public class UsuarioIO {

static Connection connection = DatabaseConnection.createConnection();
static UsuarioDAO usuarioDAO = new UsuarioDAO(connection);


public static int SubMenuUsuario(Scanner scanner) {
	int option = Integer.MAX_VALUE;
	do {
		System.out.println("--- MENU DO USUÁRIO ---\n" + "1 - Cadastrar\n" + "2 - Listar\n" + "3 - Atualizar\n" + "4 - Deletar\n" + "0 - Sair\n");
	
	option = scanner.nextInt();
	switch (option){
		case 1:	
			scanner.nextLine();
			Usuario usuario = new Usuario();
			
			System.out.println("Nome: ");
			usuario.setNomeUsuario(scanner.nextLine());
			
			System.out.println("Sobrenome: ");
			usuario.setSobrenomeUsuario(scanner.nextLine().trim());
			
			System.out.println("Email: ");
			usuario.setEmailUsuario(scanner.nextLine());
			
			System.out.println("celular: ");
			usuario.setCelularUsuario(scanner.next().trim());
			
			System.out.println("Gênero: ");
			usuario.setGeneroUsuario(scanner.nextLine());
			
			System.out.println("Senha: ");
			usuario.setSenhaUsuario(scanner.next().trim());

			usuarioDAO.createUsuario(usuario);
	break;
	
		case 2:
			usuarioDAO.readAllClients();
			break;
			
		case 3:
			Usuario usuarioAtualizado = new Usuario();
			
			System.out.println("Digite o ID do cliente à ser atualizado: ");
			usuarioAtualizado.setIdUsuario(scanner.nextInt());
			scanner.nextLine();
			
			System.out.println("Nome: ");
			usuarioAtualizado.setNomeUsuario(scanner.nextLine());
			
			System.out.println("Sobrenome: ");
			usuarioAtualizado.setSobrenomeUsuario(scanner.nextLine().trim());
			
			System.out.println("Email: ");
			usuarioAtualizado.setEmailUsuario(scanner.nextLine());
			
			System.out.println("Celular: ");
			usuarioAtualizado.setCelularUsuario(scanner.next().trim());
			
			System.out.println("Gênero: ");
			usuarioAtualizado.setGeneroUsuario(scanner.nextLine());
			
			System.out.println("Senha: ");
			usuarioAtualizado.setSenhaUsuario(scanner.next().trim());

			
			
			usuarioDAO.updateClient(usuarioAtualizado);
			break;
	
	
		case 4:
			System.out.println("Digite o ID do Cliente à ser DELETADO");
			int idUsuario = scanner.nextInt();
			usuarioDAO.deleteClient(idUsuario);
			
			break;
		default:
			System.out.println("Digite uma opção válida");
	
	    }

	}while(option != 0);
	
	return option;
	
	
}
}







