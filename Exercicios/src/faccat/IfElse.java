package faccat;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Celsius : ");
		float celsius=sc.nextFloat();
		
		
		float fahrenheit;
		fahrenheit=(9*celsius + 160)/5;
		
		System.out.println("A temperatura convertida para Fahrenheit � :" +fahrenheit);
		
		sc.close();	
		
	}

}




/*Ler uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit. A f�rmula de
convers�o � F  (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/