package faccat;



public class WhileMan01 {

	public static void main(String[] args) {
		
		
		int contadora=1;
		int acumuladora=0;
		
		while (contadora < 101) {
			
			acumuladora=acumuladora+contadora;
			System.out.println(acumuladora);
			contadora++;
		}
	}

}
