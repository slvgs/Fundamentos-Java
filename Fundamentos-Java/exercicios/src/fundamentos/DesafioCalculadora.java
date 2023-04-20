package fundamentos;
import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		//+ - * / %
		//fazer a operação 
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digie um número:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o próximo número:");
		int num2 = entrada.nextInt();
		
		System.out.println("Qual operação deseja realizar? ( + - / * %)");
		String op = entrada.next();
		
		int op1 = num1 + num2;
		int op2 = num1 - num2;
		int op3 = num1 / num2;
		int op4 = num1 * num2;
		int op5 = num1 % num2;
		int status = 0;
		
		 int resultado = op.equals("+") ? op1 : op.equals("-") ? op2: op.equals("/") ? op3 : op.equals("*") ?  op4 : op.equals("%") ? op5: status;
		
		 System.out.println(resultado);
		 
		 entrada.close();
		
		
		
			
				
				
	}

}
