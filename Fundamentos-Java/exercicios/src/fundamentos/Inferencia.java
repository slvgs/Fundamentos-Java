package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; // se colocar 4.5 em um var, logo automaticamente ele ira traduzir que este valor numérico é um double ou qualquer tipo, como int.  
		System.out.println(b);
		
		
		var c = "Texto";// não consigo fazer o que fiz na variavel d com a var c, pois quando declarada com var, já deve ser inicializada, ou seja: = atribuir um valor 
		System.out.println(c);
		
		double d; // variavel foi declarada
		d = 123.3;// variavel foi inicializada
		System.out.println(d);// usada!
		
	}
}
