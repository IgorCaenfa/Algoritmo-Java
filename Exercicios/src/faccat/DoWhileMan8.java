package faccat;

import java.util.Scanner;

public class DoWhileMan8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String desejaContinuar = "Sim";
		
		do {
			
			System.out.println("Informe o nome do comodo da casa : ");
			String comodo = sc.next();

			System.out.println("Informe a largura da sala");
			float largura = sc.nextFloat();

			System.out.println("Informe o comprimento da sala");
			float comprimento = sc.nextFloat();

			float area = comprimento * largura;

			System.out.println("Comodo "+comodo+ " possui uma area de :"+area);
			
			System.out.println("Deseja calcular outro comodo :");
			desejaContinuar=sc.next();
			
		} while (desejaContinuar == "Sim");

	}

}

/*Elaborar um programa que possibilite calcular a �rea total de uma resid�ncia (sala, cozinha,
		banheiro, quartos, �rea de servi�o, quintal, garagem, etc.). O programa deve solicitar a entrada do
			nome, a largura e o comprimento de um determinado c�modo. Em seguida, deve apresentar a �rea
			do c�modo lido e tamb�m uma mensagem solicitando do usu�rio a confirma��o de continuar
			calculando novos c�modos. Caso o usu�rio responda �NAO�, o programa deve apresentar o valor
			total acumulado da �rea residencial.*/