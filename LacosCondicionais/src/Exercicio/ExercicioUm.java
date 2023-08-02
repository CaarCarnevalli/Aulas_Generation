package Exercicio;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int A , B , C;
        int soma;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Entre com o valor de A: ");
        A = (int)  leia.nextFloat();
        System.out.println("Entre com o valor de B: ");
        B = (int)  leia.nextFloat();
        System.out.println("Entre com o valor de C: ");
        C = (int) leia.nextFloat();
        
        soma = A + B;
        if (soma == C) 
        System.out.println("A soma de A + B é igual que C"); 
        else if (soma >C)  
        System.out.println("A soma de A + B é maior que C");
        else
        System.out.println("A soma de A + B é menos que C");
        
        
        leia.close();

        
        
        
        
 
      
        
    
      
        
        
        
        
        
        

				
		
		
		
	
	}

}
