package co.simplon;

import java.util.Formatter;
import java.util.Scanner;

public class Simplest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Faire une boucle sur les articles tant que le serveur en rentre
        StringBuilder bill = new StringBuilder("Facture\n");
        float totalPrice = 0.0f;

        String article = "";
        do {
            System.out.print("Quel plat a-t-il été commandé : ");
            article = sc.nextLine();

            if (!article.isEmpty()) {
                System.out.print("En quelle quantité : ");
                int quantity = sc.nextInt();

                System.out.print("A quel prix : ");
                float price = sc.nextFloat();

                // On nettoie la ligne
                sc.nextLine();

                // On calcule le prix de la ligne
                float linePrice = price * quantity;
                totalPrice += linePrice;
                // On prépare la ligne de la facture
                bill.append(quantity).append("x ").append(article).append(" --> ").append(linePrice).append("€");
                bill.append("\n");
            }
        }
        while (!article.isEmpty());

        System.out.println();
        System.out.println(bill);
        System.out.println("Prix total : " + totalPrice + "€");
    }
}
