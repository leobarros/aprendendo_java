package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		String faixa = "amarela";

		switch (faixa.toLowerCase()) {
		
		case "preta":
			System.out.println("Sei fazer o 'Bassai-Dai/Jion/Kanku-Dai'");
		case "marron":
			System.out.println("Sei fazer o 'Tekki Shodan'");
		case "roxa":
			System.out.println("Sei fazer o 'Heian Godan'");
		case "verde":
			System.out.println("Sei fazer o 'Heian Yondan'");
		case "laranja":
			System.out.println("Sei fazer o 'Heian Sadan'");
		case "vermelha":
			System.out.println("Sei fazer o 'Heian Nidan'");
		case "amarela":
			System.out.println("Sei fazer o 'Heian Shodan'");
		}

	}

}
