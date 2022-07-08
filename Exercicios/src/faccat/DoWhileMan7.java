package faccat;

public class DoWhileMan7 {

	public static void main(String[] args) {
		int contadora = 1;
		int fatorial = 1;
		do {
			
			if (contadora % 2 == 1) {
				
				
				for (int i = 1; i <= contadora; i++) {
					
					fatorial= fatorial * i ;
					
				}
				System.out.println("O faorial deste numero "+contadora+" é : "+fatorial);
			}
			contadora ++;
		} while (contadora <=10);

		
	}
	
}

