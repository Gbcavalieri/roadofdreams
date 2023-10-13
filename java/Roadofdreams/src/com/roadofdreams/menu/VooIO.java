package com.roadofdreams.menu;

import java.sql.Connection;
import java.util.Scanner;

import com.roadofdreams.dao.VooDAO;
import com.roadofdreams.database.DatabaseConnection;
import com.roadofdreams.model.Voo;

public class VooIO {

	static Connection connection = DatabaseConnection.createConnection();
	static VooDAO compraDAO = new VooDAO(connection);
	
	public static int SubMenuVoo(Scanner scanner) {
		int option = Integer.MAX_VALUE;
		
		
		do {
			System.out.println("--- MENU DE VOO ---\n" + "1 - Cadastrar\n" + "2 - Listar\n" + "3 - Atualizar\n" + "4 - Deletar\n" + "0 - Sair\n");
		

			option = scanner.nextInt();
			switch(option){
				
				
			case 1:	
				scanner.nextLine();
				Voo voo = new Voo();
				
				System.out.println("Agência aérea: ");
				voo.setNomeAgencia(scanner.nextLine());
				
				System.out.println("Origem: ");
				voo.setOrigemAgencia(scanner.nextLine().trim());
				
				System.out.println("Destino: ");
				voo.setDestinoAgencia(scanner.nextLine());
				
				System.out.println("Data da ida: ");
				voo.setDataidaVoo(scanner.next().trim());
				
				System.out.println("Data da volta: ");
				voo.setDatavoltaVoo(scanner.nextLine());
				
				System.out.println("Quantidade de lugares disponíveis: ");
				voo.setQuantidadeLugares(scanner.nextInt ());
				
				System.out.println("Preço do voo: ");
				voo.setPrecoVoo(scanner.nextDouble());
				
				System.out.println("Código do voo: ");
				voo.setCodigoVoo(scanner.nextInt());
				
				

				vooDAO.createVoo(voo);
		break;
			
			case 2:
				vooDAO.readAllClients();
				break;
				
			case 3:
				Voo vooAtualizado = new Voo();
				
				System.out.println("Digite o ID do voo à ser atualizado: ");
				vooAtualizado.setIdVoo(scanner.nextInt());
				scanner.nextLine();
				
				System.out.println("Agência: ");
				voo.setNomeAgencia(scanner.nextLine());
				
				System.out.println("Origem: ");
				voo.setOrigemAgencia(scanner.nextLine().trim());
				
				System.out.println("Destino: ");
				voo.setDestinoAgencia(scanner.nextLine());
				
				System.out.println("Data da ida: ");
				voo.setDataidaVoo(scanner.next().trim());
				
				System.out.println("Data da volta: ");
				voo.setDatavoltaVoo(scanner.nextLine());
				
				System.out.println("Quantidade de lugares disponíveis: ");
				voo.setQuantidadeLugares(scanner.nextInt());
				
				System.out.println("Preço do voo: ");
				voo.setPrecoVoo(scanner.nextLine());
				
				System.out.println("Código do voo: ");
				voo.setCodigoVoo(scanner.next().trim());

				
				
				vooDAO.updateVoo(vooAtualizado);
				break;
				
			case 4:
				System.out.println("Digite o ID do voo à ser DELETADO");
				int idVoo= scanner.nextInt();
				vooDAO.deleteVoo(idVoo);
				
				break;
			default:
				System.out.println("Digite uma opção válida");
		
		    }

		}while(option != 0);
		
		return option;
		
	 
			
			
			
}


}
