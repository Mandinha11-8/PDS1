package atv3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		
		  Scanner leitura = new Scanner(System.in); 
		    
		     System.out.println("Digite um numero:");
	        Integer numero = Integer.valueOf(leitura.nextLine());
	        if(numero % 2 == 0) {
	        System.out.println("par");
	        
		}
	        else {
	        	  System.out.println("impar");
	        }
	      
	}
	}
