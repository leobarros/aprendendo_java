package testando;

import javax.swing.JOptionPane;

public class EstruturaDeControles {
	public static void main(String[] args) {

		String valor_total = JOptionPane.showInputDialog("Valor em Conta: ");
		String valor_do_debito = JOptionPane.showInputDialog("Débito em conta: ");

		double valor = Double.parseDouble(valor_total);
		double debito = Double.parseDouble(valor_do_debito);

		double conta = (valor - debito);

		System.out.println(conta);

		if (conta >= 1200) {
			System.out.println("Situação Financeira Boa");
		} else if (conta >= 900) {
			System.out.println("Situação Financeira Mediana");
		} else if (conta >= 500) {
			System.out.println("Situação Financeira Regular");
		} else {
			System.out.println("Situação Financeira Perigosa");
		}

	}
}
