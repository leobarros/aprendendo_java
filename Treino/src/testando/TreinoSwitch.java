package testando;

public class TreinoSwitch {

	public static void main(String[] args) {

		String animal = "";
		int idAnimal = 2;

		switch (idAnimal) {

		case 1:
			animal = "Cachorro";
			break;
		case 2:
			animal = "Gato";
			break;
		case 3:
			animal = "Papagaio";
			break;
		default:
			animal = null;
			break;
		}
		
		if (animal != null) {
			System.out.println("O animal é: " + animal);
		} else {
			System.out.println("Opção inválida");
		}

	}
}
