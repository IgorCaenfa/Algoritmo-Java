package faccat;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o s�lario fixo do funcion�rio : ");
		float salario=sc.nextFloat();
		
		System.out.println("Quantos por cento ter� de reajuste ? ");
		float reajuste=sc.nextFloat();
		
		float salariofinal;
		salariofinal= (float)salario + (salario* reajuste/100);
		
		System.out.println("O sal�rio final � : "+salariofinal);
	}
}
