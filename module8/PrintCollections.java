import java.util.Collection;

public class PrintCollections {
    public static void printCollections(Collection<Flower> flowers){
        System.out.println("Type           Color          Price\n_____________________________________");
        for (Flower flower: flowers
                ) {
            System.out.println(flower.getType() + "          " + flower.getColor() + "            " + flower.getPrice());
        }
    }
}
