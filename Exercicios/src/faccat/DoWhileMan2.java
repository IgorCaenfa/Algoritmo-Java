package faccat;

public class DoWhileMan2 {

	public static void main(String[] args) {
		int contadora = 1;
		int acumuladora=0;
		do {
			
			contadora ++ ;
			if (contadora % 4 ==0) {
				acumuladora = acumuladora + contadora;
				
				System.out.println(contadora);
			}
		} while (contadora<=200);
		System.out.println(acumuladora);
	}

}
