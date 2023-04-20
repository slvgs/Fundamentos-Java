package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X".toUpperCase();
		String d = "Bom dia Y";
		d = d.toUpperCase();
		s = s.replace("X", "SENHORA"); // substitui 
		d = d.concat("!!!!!"); // acrescenta 

		String replacePraMudar = "Bom dia Z".replace("Z", "Gabriella").toUpperCase();
		
		System.out.println(replacePraMudar);
		System.out.println(s);
		System.out.println(d);
		
		
	}
}
