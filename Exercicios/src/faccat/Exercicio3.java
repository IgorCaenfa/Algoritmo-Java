package faccat;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe sua idade :");
		int idade=sc.nextInt();
				
		System.out.println("Informe quantos meses passou do seu último aniversário :");
		int meses=sc.nextInt();
			
		System.out.println("Quantos dias passou do seu ultimo mêsversário :");
		int dias=sc.nextInt();
		
		int resultado;
	
		resultado= (idade*365)+(meses * 30)+ dias;
		
		System.out.println("Você tem " +resultado + " dias de vida");
	}

}
