package com.roadofdreams;

import java.util.Scanner;

import com.roadofdreams.menu.CompraIO;
import com.roadofdreams.menu.ContatoIO;
import com.roadofdreams.menu.MenuIO;
import com.roadofdreams.menu.UsuarioIO;
import com.roadofdreams.menu.VooIO;


public class Main {

	public static void main(String[] args) {

	
     Scanner scanner = new Scanner (System.in);
     
     
     
     
     int option = 0;
     
     do {
    	 option = MenuIO.menu(scanner);
    	 
    	 switch (option) {
    	 case 1:
    		UsuarioIO.SubMenuUsuario(scanner);
    		break;
    	 case 2:
    		CompraIO.SubMenuCompra(scanner);
    		 break;
    	 case 3:
    	 VooIO.SubMenuVoo(scanner);
    	 break;
    	 case 4:
    		 ContatoIO.SubMenuContato(scanner);
    	 break;
    	 default:
    		 System.out.println("Digite uma opção válida!");
    		 
    	 }
     }while (option != 5);
     scanner.close();
     
     
	}
	
}
    	 
    	 
    	 
    	 
    	