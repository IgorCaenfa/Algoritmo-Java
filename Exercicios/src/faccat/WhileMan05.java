package faccat;

import java.lang.Math;

import java.util.Scanner;

public class WhileMan05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a base");
		int base=sc.nextInt();
		
		System.out.println("Infome o expoente");
		int expoente=sc.nextInt();
		
		int contadora=2;
		
		while (contadora<=2) {
			
			int resultado = (int) Math.pow(base,expoente );
			System.out.println(resultado);
			contadora++;
		}
		
		sc.close();	}

}

/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base
qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor
do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
portuguol (^).*/