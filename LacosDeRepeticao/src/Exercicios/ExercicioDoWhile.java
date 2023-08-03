package Exercicios;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int num1 , num2 = 0;
		
		Scanner leia = new Scanner(System.in);

		do { 
			System.out.println("\n Digite um numero: ");
			
			num1 = leia.nextInt(); 
			
	  if ( num1 > 0) {
		  
		  num2+= num1;
	}
			
	    	  
	    	  
	      } while (num1 >0 || num1<0 );
	        
	
		System.out.println("A soma dos numeros positivo é: " +num2);
		
		
		leia.close();
		
		  
		
	    
	    
	    
		
		
		
		
		
		
	}

}
