//package etleplusgrandest;

import java.util.Scanner;

public class PlusGrandNombre {

    public static void main(String[] args) {
    	
    }
        Scanner sc = new Scanner(System.in);
        
        int nombreSaisi;
        
        int plusGrandNombre = Integer.MIN_VALUE; // Initialisation avec la plus petite valeur possible

        for (int i = 1; i <= 20; i++) {
        	
            System.out.print("Entrez le nombre numéro " + i + " : ");
            
            nombreSaisi = scanner.nextInt();

            if (nombreSaisi > plusGrandNombre) {
            	
                plusGrandNombre = nombreSaisi;
            }
        }

        System.out.println("\nRésultat : ");
        
        System.out.println("Le plus grand des nombres saisis est : " + plusGrandNombre + ".");
        
        
    }