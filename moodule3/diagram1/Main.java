package com.goit.moodule03.diagram1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        AudioFile audioFile1 = new AudioFile();
        ImageFile imageFile1 = new ImageFile();
        TextFile textFile1 = new TextFile();

        ArrayList<File> files = new ArrayList<>();

        files.add(audioFile1);
        files.add(imageFile1);
        files.add(textFile1);

        Directory directory1 = new Directory();

        directory1.setFiles(files);

        System.out.println(audioFile1);
        System.out.println(imageFile1);
        System.out.println(textFile1);
    }
}
