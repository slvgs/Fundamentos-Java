package fundamentos;

public class AreaCircuferencia {
	
	//ctrl + espaço para entrar no main 
	public static void main(String[] args) {
		double raio = 3.4; 
		final double PI = 3.14159; // trasformei a variavel pi em constante, com o "final"
		double area = PI + raio * raio;
		
		System.out.println(area );
		
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area);
	}
	
}
