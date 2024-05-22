package laSommes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre de départ : ");
        int nombreDepart = scanner.nextInt();
        scanner.close();

        int somme = 0;
        for (int i = 1; i <= nombreDepart; i++) {
            somme += i;
        }

        System.out.println("La somme des nombres jusqu'à " + nombreDepart + " est : " + somme);

	}

}
