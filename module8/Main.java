import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(new Rose("red", 200));
        flowers.add(new Aster("white", 150));
        flowers.add(new Tulip("yellow", 300));
        flowers.sort(Comparator.comparing(Flower::getPrice));
        PrintCollections.printCollections(flowers);
    }
}
