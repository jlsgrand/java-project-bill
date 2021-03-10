package co.simplon;

import java.util.Arrays;
import java.util.Scanner;

public class WithArraysLinear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Faire une boucle sur les articles tant que le serveur en rentre
        String[] articles = new String[0];
        int[] quantities = new int[0];
        float[] prices = new float[0];

        String article = "";
        int counter = 0;
        do {
            if (counter == articles.length) {
                articles = Arrays.copyOf(articles, counter*2 + 1);
                quantities = Arrays.copyOf(quantities, counter*2 + 1);
                prices = Arrays.copyOf(prices, counter*2 + 1);
            }
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

        }
        while (!article.isEmpty());

        System.out.println();
        System.out.println("------------------- Facture -------------------");
        counter = 0;
        float totalPrice = 0f;
        while (articles[counter] != null) {
            float linePrice = quantities[counter] * prices[counter];
            System.out.printf("%2sx %-20s (%5.2f€) %12.2f€", quantities[counter], articles[counter], prices[counter], linePrice);
            System.out.println();
            totalPrice += linePrice;
            counter++;
        }
        System.out.println();
        System.out.printf("Prix total : %33.2f€", totalPrice);
        System.out.println();
        System.out.println("----------------- Fin Facture -----------------");
    }
}
