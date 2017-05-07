package controle;

public class If {

	public static void main(String[] args) {

		double nota = 9.5;
		boolean bomComportamento = false;

		double teste1 = 7.5, teste2 = 8.5;
		
		if (nota >= 9 && bomComportamento) {
			System.out.println("Quadro de honra");
		}

		if (nota >=9 && !bomComportamento) {
			System.out.println("Conseguiu!");
		}
		
		if (teste1 >=7 && teste2 >= 7) {
			System.out.println("Passou");
			
		}
		
	}

}
