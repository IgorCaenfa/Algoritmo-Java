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

/*Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
		banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do
			nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área
			do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar
			calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor
			total acumulado da área residencial.*/