package faccat;

public class WhileMan7 {

	public static void main(String[] args) {
		int fahrenheit;
		int celsius=0;
		
		while (celsius<100) {
			celsius=celsius+10;
			fahrenheit=(9*celsius+160)/5;
		System.out.println(celsius+"ºC"+"---"+fahrenheit+"F");		
		}

	}

}
