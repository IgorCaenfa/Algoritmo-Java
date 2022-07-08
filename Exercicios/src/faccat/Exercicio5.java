package faccat;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sálario fixo do funcionário : ");
		float salario=sc.nextFloat();
		
		System.out.println("Quantos por cento terá de reajuste ? ");
		float reajuste=sc.nextFloat();
		
		float salariofinal;
		salariofinal= (float)salario + (salario* reajuste/100);
		
		System.out.println("O salário final é : "+salariofinal);
	}
}
