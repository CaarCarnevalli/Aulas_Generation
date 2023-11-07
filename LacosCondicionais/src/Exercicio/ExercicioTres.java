package Exercicio;

import java.util.Scanner;
import java.util.StringJoiner;

public class ExercicioTres {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String pal1,pal2,pal3;

	        Scanner ler = new Scanner(System.in);

	        System.out.println("\nEntre com a primeira palavra: ");
	        pal1 = ler.nextLine();
	        System.out.println("\nEntre com a segunda palavra: ");
	        pal2 = ler.nextLine();
	        System.out.println("\nEntre com a terceira palavra: ");
	        pal3 = ler.nextLine();

	        if(pal1.equalsIgnoreCase("vertebrado")) {//VerTeBrado
	            if(pal2.equalsIgnoreCase("ave")) {
	                if(pal3.equalsIgnoreCase("carnivoro")) {
	                    System.out.println("\nÉ uma águia");
	                } else {
	                    System.out.println("\nÉ uma pomba");
	                }
	            } else {
	                if(pal3.equalsIgnoreCase("onivoro")) {
	                    System.out.println("\nÉ um ser humano");
	                } else {
	                    System.out.println("\nÉ uma vaca");
	                }
	            }
	        } else {
	            if(pal2.equalsIgnoreCase("inseto")) {
	                if(pal3.equalsIgnoreCase("hematófago")) {
	                    System.out.println("\nÉ uma pulga");
	                } else {
	                    System.out.println("\nÉ uma lagarta");
	                }
	            }else {
	                if(pal3.equalsIgnoreCase("hematófago")) {
	                    System.out.println("\nÉ uma sanguessuga");
	                }else {
	                    System.out.println("\nÉ uma minhoca");    }
	                ler.close();
	            }
	            
	        }
	        
	}
}

		
	


