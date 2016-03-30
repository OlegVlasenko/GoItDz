import java.util.ArrayList;
import java.util.TreeSet;

public class PrintCollections {
    public static void printCollections(ArrayList<Flower> flowers){
        System.out.println("Type           Color          Price\n_____________________________________");
        for (Flower flower: flowers
                ) {
            System.out.println(flower.getType() + "          " + flower.getColor() + "            " + flower.getPrice());
        }
    }
    public static void printCollections(TreeSet<Flower> flowers){
        System.out.println("Type           Color          Price\n_____________________________________");
        for (Flower flower: flowers
                ) {
            System.out.println(flower.getType() + "          " + flower.getColor() + "            " + flower.getPrice());
        }
    }
}
