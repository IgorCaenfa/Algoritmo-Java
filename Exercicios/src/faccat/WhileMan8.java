package faccat;

import java.util.Scanner;

public class WhileMan8 {
	
public static void main(String[] args) {
		
		int numero=0;
		int acumuladora = 0;
		
		Scanner sc = new Scanner (System.in);
			
		while (numero <10) {
			
			System.out.println("Digite um numero ");
			int numero2=sc.nextInt();
			
			numero++;
			
			 acumuladora = acumuladora+ numero2;
			
			
			
		}
		
		System.out.println("A soma dos dez valores é : "+acumuladora);
		acumuladora= acumuladora/10;
		System.out.println("A media aritmetica é: "+acumuladora);
		sc.close();
	}

}
