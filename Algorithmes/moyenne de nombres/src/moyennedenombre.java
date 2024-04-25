

package  moyenne2nombres;

 import java.util.Scanner;

  Import java.util.Scanner;// import du composant scanner
  
   public class App ()

	public static void main(String[] args) {
	
		
		int nombre1;
	
		int nombre2;
		
		float moyenne;
		
		Scanner sc;
		
		sc =new Scanner(System.in);
		
		System.out.prinln("veuillez saisir un premier nombre");
		
		nombre1 = sc.nextlnt();
		
		System.out.print("veuillez saisir un second nombre :")
		 /
		nombre2 =sc.nextlnt();
		
		moyenne = (nombre1 +nombre2)/2
				
		System.out.println(" la moyenne de "+ nombre1+" et"+ nombre2 +" est :"+moyenne);
		
		sc.close();

	}

 
