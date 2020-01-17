package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        double maxRating = products.get(0).getRating();

        Random random = new Random();
        int randomPrice = random.nextInt(50) + 50;
        int randomRating = random.nextInt(10);

        Product product10 = new Product("title0",randomPrice, randomRating );
         randomRating = random.nextInt(10);
         randomPrice = random.nextInt(50) + 50;
        Product product0 = new Product("title1", randomPrice, randomRating );
        randomRating = random.nextInt(10);
        randomPrice = random.nextInt(50) + 50;

        Product product1 = new Product("title2", randomPrice, randomRating );
        randomRating = random.nextInt(10);
        randomPrice = random.nextInt(50) + 50;

        Product product2 = new Product("title3", randomPrice, randomRating );
        randomRating = random.nextInt(10);
        randomPrice = random.nextInt(50) + 50;

        Product product3 = new Product("title4", randomPrice, randomRating );
        randomRating = random.nextInt(10);
        randomPrice = random.nextInt(50) + 50;

        Product product4 = new Product("title5", randomPrice, randomRating );
        randomRating = random.nextInt(10);
        randomPrice = random.nextInt(50) + 50;

        Product product5 = new Product("title6", randomPrice, randomRating );
        randomRating = random.nextInt(10);
        randomPrice = random.nextInt(50) + 50;

        Product product6 = new Product("title7", randomPrice, randomRating );
        randomRating = random.nextInt(10);
        randomPrice = random.nextInt(50) + 50;

        Product product7 = new Product("title8", randomPrice, randomRating );
        randomRating = random.nextInt(10);
        randomPrice = random.nextInt(50) + 50;

        Product product8 = new Product("title9", randomPrice, randomRating );
        randomRating = random.nextInt(10);
        randomPrice = random.nextInt(50) + 50;

        Product product9 = new Product("title1", randomPrice, randomRating );


            products.add(product0);
            products.add(product1);
            products.add(product2);
            products.add(product3);
            products.add(product4);
            products.add(product5);
            products.add(product6);
            products.add(product7);
            products.add(product8);
            products.add(product9);
            products.add(product10);


         Product theBestRaitingProduct = products.get(0);


            for ( int i = 1; i < products.size(); i++)
            {
                if(products.get(0).getRating() < products.get(i).getRating())
                {
                    maxRating =  products.get(i).getRating();
                    theBestRaitingProduct = products.get(i);
                }
                else {
                    continue;
                }
            }
            System.out.println(theBestRaitingProduct + " maxRating - " + maxRating);
    }

}
