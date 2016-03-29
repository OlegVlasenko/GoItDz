import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(new Rose("red", 200));
        flowers.add(new Aster("white", 150));
        flowers.add(new Tulip("yellow", 300));
        PrintCollections.printCollections(flowers);

        TreeSet<String> sortFlowers = new TreeSet<>();
        sortFlowers.add("Rose");
        sortFlowers.add("Tulip");
        sortFlowers.add("Aster");
        System.out.println(sortFlowers);
    }
}
