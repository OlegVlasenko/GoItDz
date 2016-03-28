import java.util.ArrayList;

public class PrintCollections {
    public static void printCollections(ArrayList<Flower> flowers){
        System.out.println("Type           Color          Price\n_____________________________________");
        for (Flower flower: flowers
                ) {
            System.out.println(flower.getType() + "          " + flower.getColor() + "            " + flower.getPrice());
        }
    }
}
