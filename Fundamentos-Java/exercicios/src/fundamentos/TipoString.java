package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
//		System.out.println("Bom dia pessoal".charAt(2));
		
//		String s = "Boa tarde";
//		System.out.println(s.concat("!!!!"));
//		System.out.println(s.startsWith("Boa"));
//		
//		var nome = "Pedro";
//		var sobrenome = "Santana";
//		var idade = 33;
//		var salario = 120.49;
//		
//		System.out.printf("O senhor %s %s, tem %d anos e ganha o salario de R$ %.2f", nome, sobrenome, idade, salario );
//		
//		String frase = String.format("\nO senhor %s %s, tem %d anos e ganha o salario de R$ %.2f",nome, sobrenome, idade, salario);
//		System.out.println(frase);
//		
//		System.out.println("Frase qualquer".indexOf("qualquer"));
//		System.out.println("Frase qualquer".substring(6));
//		System.out.println("Frase qualquer".substring(6, 8));
//		System.out.println("Frase qualquer".equals("Frase"));
		
		
		//usar equals para comparação entre strings funciona
		System.out.println("2" == "2");
		String s = new String("2");
		System.out.println("2" == s);
		//equals =  ele verá o conteúdo da variavel para comparação 
		System.out.println("2".equals(s));
		
		
		
	}
}
