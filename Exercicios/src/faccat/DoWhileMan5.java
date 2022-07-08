package faccat;

import java.util.Scanner;

public class DoWhileMan5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe um numero e saberá o fatoria dele e dos próximos 14 numeros seguintes :");
		int numero=sc.nextInt();
		
		int i =1;
		int fat=1;
		do {
			i++;
			fat = fat * i;
			System.out.println(fat);
			
		} while ((i<=15 )& (i<=numero));
		sc.close();
	}		

}
/*Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros e no final apresente o
total do somatório da fatorial de cada valor lido.*/