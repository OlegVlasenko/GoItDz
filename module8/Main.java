import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(new Rose("red", 200));
        flowers.add(new Aster("white", 150));
        flowers.add(new Tulip("yellow", 300));
        PrintCollections.printCollections(flowers);

        TreeSet<Flower> sortFlowers = new TreeSet<>();
        sortFlowers.add(new Rose("red", 200));
        sortFlowers.add(new Aster("white", 150));
        sortFlowers.add(new Tulip("yellow", 300));
        PrintCollections.printCollections(sortFlowers);
    }
}
