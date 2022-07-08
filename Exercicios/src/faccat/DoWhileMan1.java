package faccat;

public class DoWhileMan1 {

	public static void main(String[] args) {
	 
	        int i = 0;
	        int acumuladora = 0;
	        do{
	        	 
	            
	            i++; 
	            if (i % 2 ==0) {
					acumuladora = acumuladora + i;
				}
	            
	        }while (i<=500);
	  System.out.println(acumuladora);
	}
 
}
