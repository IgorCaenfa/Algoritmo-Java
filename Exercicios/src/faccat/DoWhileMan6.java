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
		System.out.println("Parou o sistema , sua m�dia � :"+media);
	}
	 
} while (numero >-1);
 
	}

}
/*Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no final o
total do somat�rio, a m�dia aritm�tica e o total de valores lidos. O programa deve fazer as leituras
dos valores enquanto o usu�rio estiver fornecendo valores positivos. Ou seja, o programa deve
parar quando o usu�rio fornecer um valor negativo. N�o se esque�a que o usu�rio pode entrar
como primeiro n�mero um n�mero negativo, portanto, cuidado com a divis�o por zero no c�lculo da
m�dia.*/