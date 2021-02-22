package co.simplon;

import java.util.Arrays;
import java.util.Scanner;

public class WithArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Faire une boucle sur les articles tant que le serveur en rentre
        String[] articles = new String[10];
        int[] quantities = new int[10];
        float[] prices = new float[10];

        String article = "";
        int counter = 0;
        do {
            System.out.print("Plat #" + (counter+1) + " : ");
            article = sc.nextLine();

            if (!article.isEmpty()) {
                articles[counter] = article;

                System.out.print("Quantité : ");
                quantities[counter] = sc.nextInt();

                System.out.print("Prix unitaire : ");
                prices[counter] = sc.nextFloat();

                // On nettoie la ligne
                sc.nextLine();
                counter++;
            }

            // Si on arrive au bout des tableaux, on rajoute
            if (counter == articles.length - 1) {
                articles = Arrays.copyOf(articles, counter + 10);
                quantities = Arrays.copyOf(quantities, counter + 10);
                prices = Arrays.copyOf(prices, counter + 10);
            }
        }
        while (!article.isEmpty());

        System.out.println();
        System.out.println("------------------- Facture -------------------");
        counter = 0;
        float totalPrice = 0f;
        while (articles[counter] != null) {
            float linePrice = quantities[counter] * prices[counter];
            System.out.printf("%2sx %-20s (%5.1f€) %12.1f€", quantities[counter], articles[counter], prices[counter], linePrice);
            System.out.println();
            totalPrice += linePrice;
            counter++;
        }
        System.out.println();
        System.out.printf("Prix total : %33.1f€", totalPrice);
        System.out.println();
        System.out.println("----------------- Fin Facture -----------------");
    }
}
