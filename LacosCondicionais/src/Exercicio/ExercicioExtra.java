package Exercicio;

import java.util.Scanner;

public class ExercicioExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		float Salario , abono;
		
		Scanner leia = new Scanner(System.in);
		
	System.out.println("Digite o salario: ");
	Salario = (float) leia.nextFloat();
	
	System.out.println("Digite o abono: ");
	abono = (float) leia.nextFloat();
	
	float salariototal = (Salario + abono);
	
	System.out.println("Valor total final: "+ salariototal );
	
	
	leia.close();
	
	
	
	
	
	
		
	
	}

}
