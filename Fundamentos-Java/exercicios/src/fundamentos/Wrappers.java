package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor:");
		
		//byte 
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		Integer w = Integer.parseInt(entrada.next());
		
		System.out.println(b.byteValue()); 
		System.out.println(s.toString());
		System.out.println(w);
		System.out.println(l / 3);
		
		
		
		Float f = 123.8f;
		System.out.println(f);
		
		
		Double d = 1234.345;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		entrada.close();
		
		//se ficar com duvida verificar o notion!!!
		
	}

}
