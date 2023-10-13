package com.roadofdreams.menu;

import java.sql.Connection;
import java.util.Scanner;

import com.roadofdreams.dao.CompraDAO;
import com.roadofdreams.database.DatabaseConnection;
import com.roadofdreams.model.Compra;

public class CompraIO {

	static Connection connection = DatabaseConnection.createConnection();
	static CompraDAO compraDAO = new CompraDAO(connection);
	
	public static int SubMenuCompra(Scanner scanner) {
		int option = Integer.MAX_VALUE;
		
		do {
			System.out.println("--- MENU DE COMPRA ---\n" + "1 - Cadastrar\n" + "2 - Listar\n" + "3 - Atualizar\n" + "4 - Deletar\n" + "0 - Sair\n");
		

			option = scanner.nextInt();
			switch(option){
				case 1:	
					scanner.nextLine();
					Compra compra = new Compra();
					
					System.out.println("Agência aérea: ");
					compra.setAgenciaArea(scanner.nextLine());
					
					System.out.println("Passagem: ");
					compra.setPassagemCompra(scanner.nextLine().trim());
					
					System.out.println("Quantidade: ");
					compra.setQuantidadeCompra(scanner.nextLine());
					
					System.out.println("Data da compra: ");
					compra.setDataCompra(scanner.next().trim());
					
					System.out.println("Valor total: ");
					compra.setValortotalCompra(scanner.nextFloat());
					
					System.out.println("Forma de pagamento: ");
					compra.setFormaPagamento(scanner.next().trim());

					compraDAO.createCompra(compra);
			break;
			
				case 2:
					compraDAO.readAllClients();
					break;
					
				case 3:
					Compra compraAtualizado = new Compra();
					
					System.out.println("Digite o ID da compra à ser atualizada: ");
					compraAtualizado.setIdCompra(scanner.nextInt());
					scanner.nextLine();
					
					System.out.println("Agência: ");
					compraAtualizado.setAgenciaArea(scanner.nextLine());
					
					System.out.println("Passagem: ");
					compraAtualizado.setPassagemCompra(scanner.nextLine().trim());
					
					System.out.println("Quantidade: ");
					compraAtualizado.setQuantidadeCompra(scanner.nextLine());
					
					System.out.println("Data: ");
					compraAtualizado.setDataCompra(scanner.next().trim());
					
					System.out.println("Valor total: ");
					compraAtualizado.setValortotalCompra(scanner.nextFloat());
					
					System.out.println("Forma de pagamento: ");
					compraAtualizado.setFormaPagamento(scanner.next().trim());

					
					
					compraDAO.updateClient(compraAtualizado);
					break;
					
				case 4:
					System.out.println("Digite o ID da compra à ser DELETADA");
					int idCompra= scanner.nextInt();
					compraDAO.deleteCompra(idCompra);
					
					break;
				default:
					System.out.println("Digite uma opção válida");
					
			}
			
			}while(option != 0);
			

			 return option;
			
		

}
}
