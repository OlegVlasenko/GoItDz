package com.goit.moodule03.diagram3;


import com.goit.moodule03.diagram1.File;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Piano fortopiano1 = new Piano();
        Guitar guitar1 = new Guitar();
        Trumpet truba1 = new Trumpet();

        ArrayList<MuzInstrument> muzInstruments = new ArrayList<>();

        muzInstruments.add(fortopiano1);
        muzInstruments.add(guitar1);
        muzInstruments.add(truba1);

        MuzShop muzShop = new MuzShop();
        muzShop.setMuzInstruments(muzInstruments);

        for (MuzInstrument muzInstrument: muzInstruments
                ) {
            System.out.println(muzInstruments);
        }
    }
}
