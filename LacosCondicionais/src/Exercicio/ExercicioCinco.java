package Exercicio;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		int item,quantidade,soma;
		String tabela= """
***************************************************************				
	Codigo       Produto               Preço unitario
	1			X-tudao			        R$25.00
	2			X-Salada				R$15.00
	3			Bacon Small  	    	R$20.00
	4			Bauru	     			R$12.00
	5			Guarana       			R$8.00
	6			coca-cola     			R$8.00
****************************************************************	
				""";
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(tabela);
		System.out.println("Escolha o produto desejado: ");
		item = leia.nextInt();
		
		switch(item) {
		case 1:
		System.out.println("Codigo 1 : X-TUDAO ");
		System.out.println("quantidade de lanches?");
		quantidade = leia.nextInt();
		soma = quantidade*25;
		System.out.printf("Valor Total R$" + soma+".00");
		break;
		case 2:
			System.out.println("codigo 2 : X-salada");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*15;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		case 3:
			System.out.println("Codigo 3 : Bacon Small");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*20;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		case 4:
			System.out.println("Codigo 4 : Bauru");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*12;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		case 5:
			System.out.println("Codigo 5 : guarana    ");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*8;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		case 6:
			System.out.println("Codigo 6 : coca-cola  ");
			System.out.println("quantidade de lanches?");
			quantidade = leia.nextInt();
			soma = quantidade*8;
			System.out.printf("Valor Total R$" + soma+".00");
			break;
		default:
			System.out.println("opção invalida");
		}
		
		
		
			
		
		
		
		
		
		

	}

}
