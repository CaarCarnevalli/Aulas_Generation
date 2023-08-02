package Exercicio;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cod, quant = 0;
		int total;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o codigo do produto: ");
		cod = (int) leia.nextFloat();

		if (cod > 0 && cod <= 6) {
			System.out.println("Entre com a quantidade: ");
			quant = (int) leia.nextFloat();
		}

		switch (cod) {
		case 1:
			total = 10 * quant;
			System.out.println("Produto: Cachorro quente");
			System.out.println("Quantidade: " + quant);
			System.out.println("Valor Total: " + total);

			break;

		case 2:
			total = 15 * quant;
			System.out.println("Produto: X-salada");
			System.out.println("Quantidade: " + quant);
			System.out.println("Valor Total: " + total);

			break;

		case 3:
			total = 18 * quant;
			System.out.println("Produto: X-Bacon");
			System.out.println("Quantidade: " + quant);
			System.out.println("valor Total: " + total);
			break;

		case 4:
			total = 12 * quant;
			System.out.println("Produto: Bauru");
			System.out.println("Quantidade: " + quant);
			System.out.println("Valor Total: " + total);
			break;

		case 5:
			total = 8 * quant;
			System.out.println("Produto: Refrigerante");
			System.out.println("Quantidade: " + quant);
			System.out.println("Valor Total: " + total);
			break;

		case 6:
			total = 13 * quant;
			System.out.println("Produto: Suco Laranja");
			System.out.println("Quantidade: " + quant);
			System.out.println("Valor Total: " + total);
			break;

		default:
			System.out.println("Produto não encontrado");

		}

		leia.close();
	}
}
