package faccat;

import java.util.Scanner;

public class Exercicio4Man {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int autonomia=12;
		
		System.out.println("Informe o tempo gasto da viagem : ");
		float tempo=sc.nextFloat();
		
		System.out.println("Informe a velocidade m�dia :");
		int velocidade=sc.nextInt();
		
		float distancia= tempo*velocidade;
		
		float litrosusados= distancia / autonomia;
		
		
		System.out.println("A velociade media � :"+velocidade+"KM");
		System.out.println("O tempo gasto em horas : " +tempo);
		System.out.println("A distancia percorrida � :"+distancia);
		System.out.println("Os litros usados na viagem equivale a :"+litrosusados);
		
		sc.close();

	}

}


/*Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um
autom�vel que faz 12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto
(TEMPO) e a velocidade m�dia (VELOCIDADE) durante a viagem. Desta forma, ser� poss�vel obter a
dist�ncia percorrida com a f�rmula DISTANCIA  TEMPO * VELOCIDADE. Possuindo o valor da
dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a f�rmula
LITROS_USADOS  DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
m�dia (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
quantidade de litros (LITROS_USADOS) utilizada na viagem.*/