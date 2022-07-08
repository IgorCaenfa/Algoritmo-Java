package faccat;

public class WhileMan03 {

	public static void main(String[] args) {
		
		int contadora=0;
		int acumuladora=0;
		
		while (contadora<21) {
			
			if (contadora % 2 == 1) {
			
				System.out.println(contadora);
			}
			contadora++;
		}
			
			
			
	}
	
}

/*Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução
se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.*/