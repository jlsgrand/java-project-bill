package co.simplon;

import java.util.Arrays;
import java.util.Scanner;

public class WithArraysQuadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Faire une boucle sur les articles tant que le serveur en rentre
        String[] articles = new String[0];
        int[] quantities = new int[0];
        double[] prices = new double[0];

        String article = "";
        do {
            System.out.print("Plat #" + (articles.length+1) + " : ");
            article = sc.nextLine();

            if (!article.isEmpty()) {
                /* Ce que les Arrays.copyOf font :
                String[] newArticles=new String[articles.length+1];
                int[] newQuantities= new int[quantities.length+1];
                double[] newPrices= new double[prices.length+1];
                for(int i=0; i!= articles.length; ++i){
                    newArticles[i]= articles[i];
                    newQuantities[i]= quantities[i];
                    newPrices[i]= prices[i];
                }
                articles= newArticles;
                quantities= newQuantities;
                prices= newPrices;
                 */
                articles= Arrays.copyOf(articles, articles.length+1);
                articles[articles.length-1] = article;

                System.out.print("Quantité : ");
                quantities= Arrays.copyOf(quantities, quantities.length+1);
                quantities[quantities.length-1] = sc.nextInt();

                System.out.print("Prix unitaire : ");
                prices= Arrays.copyOf(prices, prices.length+1);
                prices[prices.length-1] = sc.nextDouble();

                // On nettoie la ligne
                sc.nextLine();
            }
        }
        while (!article.isEmpty());

        System.out.println();
        System.out.println("------------------- Facture -------------------");
        double totalPrice = 0f;
        for(int i=0; i != articles.length; ++i){
            double linePrice = quantities[i] * prices[i];
            System.out.printf("%2sx %-20s (%5.2f€) %12.2f€",
                    quantities[i], articles[i], prices[i], linePrice);
            System.out.println();
            totalPrice += linePrice;
        }
        System.out.println();
        System.out.printf("Prix total : %33.2f€", totalPrice);
        System.out.println();
        System.out.println("----------------- Fin Facture -----------------");
    }
}
