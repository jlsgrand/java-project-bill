package co.simplon;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        // On déclare un scanner pour lire les entrées de la console
        Scanner sc = new Scanner(System.in);

        // On un message pour demander le prénom
        System.out.println("Entrez votre prénom : ");

        // On récupère le prénom de la console
        String prenom = sc.nextLine();

        // On demande l'age
        System.out.println("Entrez votre age : ");
        int age = sc.nextInt();
        sc.nextLine();

        // On vérifie l'age de la personne
        if (age <= 0) {
            System.out.println("Vous n'êtes pas encore né ? Hum, bizarre...");
        } else {
            // On affiche le résultat
            System.out.println("Bonjour " + prenom + ". Vous avez " + age + " ans, c'est bien ça ?");
        }

        // On ferme le scanner
        sc.close();
    }
}
