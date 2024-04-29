package helloYou;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String prenom ; // déclaration d'une variable " prenom" de type " chaine de caracteres "
		
		Scanner sc;// Déclaration d'une variable de type Scanner (penser à ajouter la ligne d'import ( cf ligne 3) )
		
		sc = new Scanner ( System.in ); // Initianisation d'un nouveau Scanner
		
		System.out.println ( "Bonjour,veuillez saisir votre prenom "); // Affichage
		
		prenom = sc.nextLine (); // Demande à l'utilisateur une saisie .
		
		// lorsque l'utilisateur validera avec la touche "Entrée " ,la saisie est récupérée dans la variable a gauche du signe "="
		
		System.out.println ;(" Bonjour "+ prénom ");//Affichage 
		
		sc.close ();//fERMETURE DU SCANNER 5obligatoirement )
		
		

	}

}
