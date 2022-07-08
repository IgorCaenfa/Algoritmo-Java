package faccat;

import java.util.Scanner;

public class WhileMan10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String desejaContinuar = "Sim";

		while (desejaContinuar == "Sim") {

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
			}

	}

}
