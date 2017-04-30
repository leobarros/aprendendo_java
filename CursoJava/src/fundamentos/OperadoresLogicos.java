package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		boolean comproSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		boolean comproTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete = "  + comproSorvete);
		System.out.println("TV 50 = " + comprouTv50);
		System.out.println("TV 32 = " + comproTv32);
		
		// Operador unário intruso
		System.out.println("Fome = " + !comproSorvete);
		
	}

}
