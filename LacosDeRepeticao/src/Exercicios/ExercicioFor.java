package Exercicios;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = (int) leia.nextInt();

		System.out.println("Digite o último número do intervalo: ");
		n2 = (int) leia.nextInt();
		

		if (n1 < n2) 
		{
			System.out.println("No Intervalo entre " + n1 + " e " + n2);
			
			for (int contador = n1; contador <= n2; contador++) 
			{
		
				if (contador % 3 == 0 && contador % 5 == 0) 
				{
					System.out.println(contador + " é múltiplo de 3 e 5");
				}
			}

		} 
		else 
		{
			System.out.println("Intervalo é inválido!");
		}
		
		leia.close();
	
	}

} 

