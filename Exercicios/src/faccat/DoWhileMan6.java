package faccat;

import java.util.Scanner;

public class DoWhileMan6 {

	public static void main(String[] args) {
		
 Scanner sc = new Scanner (System.in);
 int numero=0;
 
 float acumuladora=0;
 int i=0;
 int media=0;
 do {
	
	 System.out.println("Digite um valor :");
	numero=sc.nextInt();
	
	 acumuladora=acumuladora+numero;
	 
	 media=(int) (acumuladora / i);
	  i++;
	 if (numero<= -1) {
		System.out.println("Parou o sistema , sua média é :"+media);
	}
	 
} while (numero >-1);
 
	}

}
/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o
total do somatório, a média aritmética e o total de valores lidos. O programa deve fazer as leituras
dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve
parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar
como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da
média.*/