package co.simplon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WithArrayLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Faire une boucle sur les articles tant que le serveur en rentre
        List<String> articles = new ArrayList<String>();
        List<Integer> quantities = new ArrayList<Integer>();
        List<Double> prices = new ArrayList<Double>();

        String article = "";
        do {
            System.out.print("Plat #" + (articles.size()+1) + " : ");
            article = sc.nextLine();

            if (!article.isEmpty()) {
                articles.add(article);

                System.out.print("Quantité : ");
                quantities.add(sc.nextInt());

                System.out.print("Prix unitaire : ");
                prices.add(sc.nextDouble());

                // On nettoie la ligne
                sc.nextLine();
            }
        }
        while (!article.isEmpty());

        System.out.println();
        System.out.println("------------------- Facture -------------------");
        double totalPrice = 0f;
        for(int i=0; i != articles.size(); ++i){
            double linePrice = quantities.get(i) * prices.get(i);
            System.out.printf("%2sx %-20s (%5.2f€) %12.2f€",
                    quantities.get(i), articles.get(i), prices.get(i), linePrice);
            System.out.println();
            totalPrice += linePrice;
        }
        System.out.println();
        System.out.printf("Prix total : %33.2f€", totalPrice);
        System.out.println();
        System.out.println("----------------- Fin Facture -----------------");
    }

}
