package faccat;

import java.util.Scanner;

public class IfElse3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
			
		System.out.println("Informe o raio da lata de �leo :");
		float raio=sc.nextFloat();
		
		System.out.println("Informe o altura da lata de �leo :");
		float altura=sc.nextFloat();
		
		float volume=  (float) (( raio*raio * altura )* 3.1415926) ;
		
		System.out.println("O volume da sua lata de �leo equivale a :" +volume);
		
		sc.close();
	}

}

/*Calcular e apresentar o valor do volume de uma lata de �leo, utilizando a f�rmula:
Volume�p *Raio2 * Altura*/