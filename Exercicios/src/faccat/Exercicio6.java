package faccat;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de fábrica do carro ? ");
		float valorcarro=sc.nextFloat();
		
		float custofinal;
		custofinal= valorcarro +(valorcarro*28/100) + (valorcarro *45/100);
		
		System.out.println("Valor final do carro é : R$"+custofinal);

	}

}
