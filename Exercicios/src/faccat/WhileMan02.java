package faccat;



public class WhileMan02 {

	public static void main(String[] args) {
		
		
		
		int contadora=1;
		int acumuladora=0;
		
		while (contadora <501) {
			if (contadora % 2 == 0) {
				acumuladora=acumuladora + contadora;
				
						
			}
			contadora++;
		}
		System.out.println(acumuladora);

	}

}
