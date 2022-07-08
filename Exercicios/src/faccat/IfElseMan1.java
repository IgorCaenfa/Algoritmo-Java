package faccat;

import java.util.Scanner;

public class IfElseMan1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um valor : ");
		int numero1=sc.nextInt();
		
		System.out.println("Informe um valor : ");
		int numero2=sc.nextInt();
		
		
		
		if (numero1>numero2) {
			System.out.println("A diferença do maior para o menor é :" +(numero1-numero2));
		} else {
			System.out.println("A diferença do maior para o menor é :" +(numero2-numero1));
		}
		sc.close();
	}

}

//Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.