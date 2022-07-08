package faccat;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em  Fahrenheit");
		float  fahrenheit=sc.nextFloat();
		
		float celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println("A temperatura convertida para Celsius é :" +celsius);
		
		sc.close();
		
		

	}

}


