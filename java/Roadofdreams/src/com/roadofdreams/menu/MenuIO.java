package com.roadofdreams.menu;

import java.util.Scanner;

public class MenuIO {

public static int menu(Scanner scanner) {
	
		System.out.println( "Escolha uma das  opções de 1 - 5\n" 
			+ "1 - Usuário\n" + "2 - Compra\n" + "3 - Voo\n" + "4 - Contato\n" + "0 - Sair");
			
			
			return scanner.nextInt();
			
		}
		
		
	}




