import java.util.*;


abstract class MuzInstrument{
    public abstract String getType();

    @Override
    public String toString() {
        return "MuzInstrument{"+getType()+"}";
    }
}

class Guitar extends MuzInstrument{

    @Override
    public String getType() {
        return "guitar";
    }
}

class Trumblet extends MuzInstrument{
    @Override
    public String getType(){
        return "trumblet";
    }
}

class Piano extends MuzInstrument{

    @Override
    public String getType() {
        return "piano";
    }
}

class MuzShop {
    List<MuzInstrument> muzInstruments;

    public List<MuzInstrument> getMuzInstruments() {
        return muzInstruments;
    }

    public void setMuzInstruments(List<MuzInstrument> muzInstruments) {
        this.muzInstruments = muzInstruments;
    }

    @Override
    public String toString() {
        return "MuzShop{" +
                "muzInstruments=" + muzInstruments +
                '}';
    }
}

class Main {

    public static void main(String[] args) {
        MuzShop shop = new MuzShop();


        ArrayList<MuzInstrument> muzInstruments = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            muzInstruments.add(new Guitar());
        }
        for (int i = 0; i < 4; i++) {
            muzInstruments.add(new Piano());
        }
        for (int i = 0; i < 7; i++) {
            muzInstruments.add(new Trumblet());
        }
        shop.setMuzInstruments(muzInstruments);


        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 2);
        order.put("piano", 3);
        order.put("trumblet", 4);


        System.out.println(shop);

        try {
            List<MuzInstrument> animalsToBeRemoved = prepareListOfMuzInstrumentsToRemove(shop, order);
            removeAnimalsFromTheShop(shop, order);
            System.out.println("Order: "+animalsToBeRemoved);
        } catch (Exception e) {
            System.out.println("Exception happened: "+e.getMessage());
        }

        System.out.println(shop);

    }

    private static List<MuzInstrument> prepareListOfMuzInstrumentsToRemove(MuzShop petShop, Map<String, Integer> order) {
        List<MuzInstrument> result = new ArrayList<>();

        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String muzInstrumentType = orderEntry.getKey();
            Integer numberOfMuzInstrumentToBeRemoved = orderEntry.getValue();
            int numberOfMuzInstrumentsToBeRemoved = 0;
            for (MuzInstrument muzInstrument : petShop.getMuzInstruments()) {
                if (muzInstrument.getType().equals(muzInstrumentType) && numberOfMuzInstrumentsToBeRemoved<numberOfMuzInstrumentToBeRemoved) {
                    result.add(muzInstrument);
                    numberOfMuzInstrumentsToBeRemoved++;
                }
            }
            if(numberOfMuzInstrumentsToBeRemoved<numberOfMuzInstrumentToBeRemoved)
                throw new IllegalArgumentException("Shop does not have enough " + muzInstrumentType+"s");
        }

        return result;
    }

    private static void removeAnimalsFromTheShop(MuzShop muzShop, Map<String, Integer> order){
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String muzInstrumentType = orderEntry.getKey();
            Integer numberOfMuzInstrumentToBeRemoved = orderEntry.getValue();
            int numberOfMuzInstrumentsRemoved = 0;
            Iterator<MuzInstrument> iterator = muzShop.getMuzInstruments().iterator();
            while (iterator.hasNext()) {
                MuzInstrument muzInstrument = iterator.next();
                if (muzInstrument.getType().equals(muzInstrumentType) && numberOfMuzInstrumentsRemoved<numberOfMuzInstrumentToBeRemoved) {
                    iterator.remove();
                    numberOfMuzInstrumentsRemoved++;
                }
            }
        }
    }

}