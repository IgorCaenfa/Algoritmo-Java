package orientacaoaobjeto;

public class ExemploString {

	public static void main(String[] args) {
	String nome,sobrenome;
	nome="igor";
	sobrenome="caenfa";
	char sexo ='M';
	
	
	
	System.out.println(nome);
	
	System.out.println(nome.toLowerCase());
	System.out.println(nome.toUpperCase());
	System.out.println(nome.indexOf("n"));
	System.out.println(nome+"\n"+sobrenome);
	
	System.out.println("A variavel nome possui "+nome.length()+" letars");
	System.out.println(nome.concat(" "+sobrenome));
	}

}
