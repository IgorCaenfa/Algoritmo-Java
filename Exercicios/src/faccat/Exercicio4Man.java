package faccat;

import java.util.Scanner;

public class Exercicio4Man {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int autonomia=12;
		
		System.out.println("Informe o tempo gasto da viagem : ");
		float tempo=sc.nextFloat();
		
		System.out.println("Informe a velocidade média :");
		int velocidade=sc.nextInt();
		
		float distancia= tempo*velocidade;
		
		float litrosusados= distancia / autonomia;
		
		
		System.out.println("A velociade media é :"+velocidade+"KM");
		System.out.println("O tempo gasto em horas : " +tempo);
		System.out.println("A distancia percorrida é :"+distancia);
		System.out.println("Os litros usados na viagem equivale a :"+litrosusados);
		
		sc.close();

	}

}


/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um
automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto
(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a
distância percorrida com a fórmula DISTANCIA  TEMPO * VELOCIDADE. Possuindo o valor da
distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula
LITROS_USADOS  DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade
média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a
quantidade de litros (LITROS_USADOS) utilizada na viagem.*/