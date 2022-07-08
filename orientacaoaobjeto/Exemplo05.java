package orientacaoaobjeto;

public class Exemplo05 {

	int numero =75;
	
	public static void main(String[] args) {
		
		Exemplo05 objeto = new Exemplo05();
		
		Exemplo05 objeto2 = new Exemplo05();
		
		objeto2.numero=100;
		
		System.out.println(objeto.numero);
		System.out.println(objeto2.numero);

	}

}
