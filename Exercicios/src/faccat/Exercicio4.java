package faccat;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número total de eleitores : ");
		int eleitores=sc.nextInt();
				
		System.out.println("Quantos votos foram brancos? : ");
		int votobranco=sc.nextInt();
		
		System.out.println("Quantos votos foram nulos? : ");
		int votonulo=sc.nextInt();
		
		int validos ;
		validos = eleitores - (votobranco + votonulo);
		
		System.out.println("Total de eleitores : "+eleitores);
		
		System.out.println("Total de votos brancos : "+votobranco);
		System.out.println("Total de votos nulos: "+votonulo);
		System.out.println("Total de votos válidos : "+validos);
		
		
		float porcentobranco ;
		porcentobranco = votobranco * 100 / eleitores;
		
		System.out.println("Porcentagem de votos brancos : "+porcentobranco+"%");
		
		
		
		
		float porcentonulo ;
		porcentonulo= votonulo * 100 / eleitores;
		
		System.out.println("Porcentagem de votos nulos : "+porcentonulo+"%");
		
		
		
		
		float porcentovalidos;
		porcentovalidos= validos * 100 / eleitores;
		
	    System.out.println("Porcentagem de votos válidos : "+porcentovalidos+"%");
		
		
	}

}
