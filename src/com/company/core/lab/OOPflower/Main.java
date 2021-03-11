package com.company.core.lab.OOPflower;

import com.company.core.lab.OOPflower.flowers.*;

public class Main {
    public static void main(String[] args) {
        Tulip tulipYellow = new Tulip("yellow", 15);
        Tulip tulipRed = new Tulip("red", 15);

        Orchid orchidPink = new Orchid("pink", 50);
        Lily lilyWhite = new Lily("white", 30);

        Rose roseRed = new Rose("red", 25);
        Rose roseWhite = new Rose("white", 25);

        Flower[] bouquetOfRose = new Flower[101];
        for (int i = 0; i < bouquetOfRose.length; i++) {
            if(i == bouquetOfRose.length - 1) {
                bouquetOfRose[i] = roseWhite;
            } else {
                bouquetOfRose[i] = roseRed;
            }
        }


        Flower[] bouquetOfTulip = new Flower[51];
        for (int i = 0, j = 25; i < 25 || j < 51; i++, j++) {
            bouquetOfTulip[i] = tulipYellow;
            bouquetOfTulip[j] = tulipRed;
        }

        Flower[] bouquetVip = new Flower[25];
        for (int i = 0; i < 5; i++) {
            bouquetVip[i] = orchidPink;
        }
        for (int i = 5; i < 25; i++) {
            bouquetVip[i] = lilyWhite;
        }

        System.out.println("Bouquet of rose: price = " + calculatePriceBouquet(bouquetOfRose));
        System.out.println("Bouquet of tulip: price = " + calculatePriceBouquet(bouquetOfTulip));
        System.out.println("Bouquet VIP: price = " + calculatePriceBouquet(bouquetVip));
    }

    public static double calculatePriceBouquet(Flower[] bouquet) {
        double priceBouquet = 0;
        for (int i = 0; i < bouquet.length; i++) {
            priceBouquet += bouquet[i].getPrice();
        }
        return priceBouquet;
    }
}
