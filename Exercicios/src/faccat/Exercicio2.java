package faccat;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Informe o valor da altura :  ");
		float altura=sc.nextFloat();
		
		System.out.println("Informe o valor da base :");
		float base=sc.nextFloat();
		
		float area;
		area= altura*base;
		
		System.out.println("O valor da aréa equivale a : "+area);
	}
}
