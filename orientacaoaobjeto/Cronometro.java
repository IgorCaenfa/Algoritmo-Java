package orientacaoaobjeto;

import java.util.Scanner;

public class Cronometro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		

		System.out.println("Digite a hora que deseja colocar para dispertar:");
		int hora = sc.nextInt();

		System.out.println("Digite os minutos que deseja colocar para dispertar:");
		int minuto = sc.nextInt();
		// 00:00:20

		int horas, minutos, segundos;
		for (horas = 0; horas < 24; horas++) {
			for (minutos = 0; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas + " : " + minutos + " : " + segundos);
					if ((hora == horas) && (minuto == minutos)) {
						break;
					}
				}
				if ((hora == horas) && (minuto == minutos)) {
					System.out.println("Acorda braço curto");
					break;
				}
			}
			if ((hora == horas) && (minuto == minutos)) {
				break;
			}
		}
	}
}
