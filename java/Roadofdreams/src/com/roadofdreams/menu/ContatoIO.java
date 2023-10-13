package com.roadofdreams.menu;

import java.sql.Connection;
import java.util.Scanner;

import com.roadofdreams.dao.ContatoDAO;
import com.roadofdreams.database.DatabaseConnection;
import com.roadofdreams.model.Contato;

public class ContatoIO {

	static Connection connection = DatabaseConnection.createConnection();
	static ContatoDAO contatoDAO = new ContatoDAO(connection);
	
	public static int SubMenuContato(Scanner scanner) {
		int option = Integer.MAX_VALUE;
		
		do {
			System.out.println("--- MENU DE CONTATO ---\n" + "1 - Cadastrar\n" + "2 - Listar\n" + "3 - Atualizar\n" + "4 - Deletar\n" + "5 - Sair\n");
		
			option = scanner.nextInt();
			switch(option){
				
				
			case 1:	
				scanner.nextLine();
				Contato contato = new Contato();
				
				System.out.println("Nome: ");
				contato.setNomeContato(scanner.nextLine());
				
				System.out.println("Email: ");
				contato.setEmailContato(scanner.nextLine().trim());
				
				System.out.println("Assunto: ");
				contato.setAssuntoContato(scanner.nextLine());
				
				System.out.println("Telefone: ");
				contato.setTelefoneContato(scanner.next().trim());
				
				System.out.println("Mensagem: ");
				contato.setMensagemContato(scanner.nextLine());
				
				
				contatoDAO.createContato(contato);
		break;
			
			case 2:
				contatoDAO.readAllClients();
				break;
				
			case 3:
				Contato contatoAtualizado = new Contato();
				
				System.out.println("Digite o ID do contato à ser atualizado: ");
				contatoAtualizado.setIdContato(scanner.nextInt());
				scanner.nextLine();
				
				System.out.println("Nome: ");
				contatoAtualizado.setNomeContato(scanner.nextLine());
				
				System.out.println("Email: ");
				contatoAtualizado.setEmailContato(scanner.nextLine().trim());
				
				System.out.println("Assunto: ");
				contatoAtualizado.setAssuntoContato(scanner.nextLine());
				
				System.out.println("Telefone: ");
				contatoAtualizado.setTelefoneContato(scanner.next().trim());
				
				System.out.println("Mensagem: ");
				contatoAtualizado.setMensagemContato(scanner.nextLine());

				
				
				contatoDAO.updateClient(contatoAtualizado);
				break;
				
			case 4:
				System.out.println("Digite o ID do voo à ser DELETADO");
				int idContato= scanner.nextInt();
				contatoDAO.deleteContato(idContato);
				
				break;
			default:
				System.out.println("Digite uma opção válida");
		
		    }

		}while(option != 0);
		
		return option;
		
	 
			
			
}
}
