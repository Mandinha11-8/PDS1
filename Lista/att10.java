package atvividadeDez;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		
        Scanner leitura = new Scanner(System.in);

        Double n1, n2, n3, media = 0.0;

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        // leituras scanf
        System.out.println("Digite nota 1: ");
        String nota1 = leitura.nextLine();
        System.out.println("Digite nota 2: ");
        String nota2 = leitura.nextLine();
        System.out.println("Digite nota 3: ");
        String nota3 = leitura.nextLine();

        // Conversao de tipo (string -> Double)
        n1 = Double.valueOf(nota1);
        n2 = Double.valueOf(nota2);
        n3 = Double.valueOf(nota3);

        media = (n1 + n2 + n3) / 3;

        // printf
        System.out.println(nome + ", a sua media sera = " + media);
    }



	}