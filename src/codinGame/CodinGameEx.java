package codinGame;

import java.util.Scanner;

public class CodinGameEx {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("But du jeu : (Notice)");
		System.out.println("Saisissez un mot, puis une contrainte. Votre mot sera affich� autant de fois que la taille de votre mot.");
		System.out.println("Particularit� : Votre mot sera �crit une premi�re fois � l'endroit, puis � l'envers, ...  ");
		System.out.println("Si la contrainte = 'S', votre mot sera affich� avec un espace entre chaque mot");
		System.out.println("Si la contrainte = 'D', votre mot sera affich� avec un retour chariot");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Saisissez votre mot : ");
		String mot = scanner.nextLine(); 
		System.out.println("Quel est votre contrainte ? (S/D)");
		String contrainte = scanner.nextLine().toUpperCase();
		String resultat = ""; 
		String motALEnver = "";  
		
		if(contrainte.equals("S") || contrainte.equals("D")) {
			//Creer le mot � l'envers 
			for (int j = mot.length()-1; j >= 0; j--) {
				motALEnver += mot.charAt(j);
			}
			if(contrainte.equals("S")) {
				//Contrainte 'S'
				for (int i = 0; i < mot.length(); i++) {
					if(i%2 == 0) {
						//Ecrit le mot � l'endroit 
						resultat += mot + " "; 
					}else {
						//Ecrit le mot � l'envers
						resultat += motALEnver + " "; 
					}
				}
				System.out.println(resultat);
			}else {
				// Contrainte 'D'
				for (int i = 0; i < mot.length(); i++) {
					if(i%2 == 0) {
						//Ecrit le mot � l'endroit 
						resultat += mot + "\n"; 
					}else {
						//Ecrit le mot � l'envers
						resultat += motALEnver + "\n"; 
					}
				}
				System.out.println(resultat);
				}
		}else {
			System.out.println("Mauvaise contrainte, au revoir!");
		}

	}

}
