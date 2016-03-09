package com.goit.moodule03.diagram2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Chamomile romashka1 = new Chamomile();
        Rose roza1 = new Rose();
        Rosebush rozoviyKust1 = new Rosebush();
        Tulip tyulpan1 = new Tulip();
        Aster astra1 = new Aster();

        ArrayList<Flower> flowers = new ArrayList<>();

        flowers.add(romashka1);
        flowers.add(roza1);
        flowers.add(rozoviyKust1);
        flowers.add(tyulpan1);
        flowers.add(astra1);

        Bouquet flowerBouquet = new Bouquet();



    }
}
