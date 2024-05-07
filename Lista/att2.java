package atv2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
			    Scanner leitura = new Scanner(System.in); 
			    
			    System.out.println("Didite seu nome:" );
		        String nome = leitura.nextLine();
		        System.out.println("Digite a sua idade:");
		        Integer idade = Integer.valueOf(leitura.nextLine());

		        System.out.println(nome);
		        System.out.println(idade);

			}

		}