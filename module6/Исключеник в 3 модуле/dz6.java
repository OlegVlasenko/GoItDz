import java.util.*;


abstract class MuzInstrument{
    public abstract String getType();

    @Override
    public String toString() {
        return "Muzinstrument{"+getType()+"}";
    }
}

class Guitar extends MuzInstrument{

    @Override
    public String getType() {
        return "Guitar";
    }
}

class Piano extends MuzInstrument{

    @Override
    public String getType() {
        return "Piano";
    }
}

class Trumblet extends MuzInstrument{

    @Override
    public  String getType() {
        return "Trumblet";
    }
}

class MuzShop {
    int guitars;
    int pianos;
    int trumblets;

    public int getPianos() {
        return pianos;
    }

    public int getTrumblets() {
        return trumblets;
    }

    public void setTrumblets(int trumblets){
        this.trumblets = trumblets;
    }

    public void setPianos(int pianos) {
        this.pianos = pianos;
    }

    public int getGuitars() {
        return guitars;
    }

    public void setGuitars(int guitars) {
        this.guitars = guitars;
    }

    @Override
    public String toString() {
        return "PetShop{" +
                "Guitar=" + guitars +
                ", Piano=" + pianos + ", Trumblet=" + trumblets +
                '}';
    }
}

class Runner {

    public static void main(String[] args) {
        MuzShop shop = new MuzShop();
        shop.setGuitars(50);
        shop.setPianos(30);
        shop.setTrumblets(20);

        System.out.println(shop);

        Map<String, Integer> order = new HashMap<>();
        order.put("dog", 45);
        order.put("cat", 34);
        order.put("trumblet", 10);

        List<MuzInstrument> guitarToRemove = prepareOrder(shop, order);
        System.out.println("removed guitar: " + guitarToRemove.size());

        System.out.println(shop);



    }

    private static List<MuzInstrument> prepareOrder(MuzShop shop, Map<String, Integer> order) {
        int numberOfGuitarsToRemove = order.get("guitar");
        int numberOfPianosToRemove = order.get("piano");
        int numberOfTrumbletsToRemove = order.get("trumblet");

        if (shop.getGuitars() < numberOfGuitarsToRemove) throw new IllegalStateException();
        if (shop.getPianos() < numberOfPianosToRemove) throw new IllegalStateException();
        if (shop.getTrumblets() < numberOfTrumbletsToRemove) throw new IllegalStateException();

        shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
        shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
        shop.setTrumblets(shop.getTrumblets() - numberOfTrumbletsToRemove);

        List<MuzInstrument> result = new ArrayList<>();
        for (int i = 0; i < numberOfGuitarsToRemove; i++) {
            result.add(new Guitar());
        }
        for (int i = 0; i < numberOfPianosToRemove; i++) {
            result.add(new Piano());
        }
        for (int i = 0; i < numberOfTrumbletsToRemove; i++){
            result.add(new Trumblet());
        }
        return result;
    }


}
