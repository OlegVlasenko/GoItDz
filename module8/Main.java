import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", "red", 200);
        Flower astra = new Flower("Astra", "white", 150);
        Flower tulip = new Flower("Tulip", "Yellow", 300);
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(rose);
        flowers.add(astra);
        flowers.add(tulip);
        for (Flower flower: flowers
             ) {
            System.out.println("Type: " + flower.type + " Color: " + flower.color + " Price: " + flower.price);
        }
    }
}
