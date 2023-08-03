package Exercicios;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int idade , men21 = 0 , mai50 = 0 ;
	    
	    Scanner leia = new Scanner(System.in);
	   
	    System.out.println("Digite sua idade: ");
	    idade = (int) leia.nextInt();
	    
	   while (idade >= 0 ) {
		   System.out.println("Insira sua idade: ");
	
		   idade = leia.nextInt();
	if (idade < 21 && idade >= 0) {
		men21 ++;
		
	} else if (idade > 50) {
		mai50 ++;
		System.out.println("Numero negativo digitado: ");
	}

	  }
		   
	   System.out.println("O total de menores de 21 anos é: "+men21);
	   System.out.println("O total de maiores de 50 anos é: "+mai50);
	   
	    
	    
	    leia.close();
	    
	    
	   
	}

}
