import java.util.*;


abstract class MusicInstrument{
    public abstract String getType();

    @Override
    public String toString() {
        return "MuzInstrument{"+getType()+"}";
    }
}

class Guitar extends MusicInstrument{

    @Override
    public String getType() {
        return "guitar";
    }
}

class Trumblet extends MusicInstrument{
    @Override
    public String getType(){
        return "trumblet";
    }
}

class Piano extends MusicInstrument{

    @Override
    public String getType() {
        return "piano";
    }
}

class MusicShop {
    private List<MusicInstrument> musicInstruments;

    public List<MusicInstrument> getMusicInstruments() {
        return musicInstruments;
    }

    public void setMusicInstruments(List<MusicInstrument> musicInstruments) {
        this.musicInstruments = musicInstruments;
    }

    @Override
    public String toString() {
        return "MusicShop{" +
                "musicInstruments=" + musicInstruments +
                '}';
    }
}

class Main {

    public static void main(String[] args) {
        MusicShop shop = new MusicShop();


        ArrayList<MusicInstrument> musicInstruments = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            musicInstruments.add(new Guitar());
        }
        for (int i = 0; i < 4; i++) {
            musicInstruments.add(new Piano());
        }
        for (int i = 0; i < 7; i++) {
            musicInstruments.add(new Trumblet());
        }
        shop.setMusicInstruments(musicInstruments);


        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 2);
        order.put("piano", 3);
        order.put("trumblet", 4);


        System.out.println(shop);

        try {
            List<MusicInstrument> muzInstrumentsToBeRemoved = prepareListOfMuzInstrumentsToRemove(shop, order);
            removeMuzInstrumentsFromTheShop(shop, order);
            System.out.println("Order: "+muzInstrumentsToBeRemoved);
        } catch (Exception e) {
            System.out.println("Exception happened: "+e.getMessage());
        }

        System.out.println(shop);

    }

    private static List<MusicInstrument> prepareListOfMuzInstrumentsToRemove(MusicShop musicShop, Map<String, Integer> order) {
        List<MusicInstrument> result = new ArrayList<>();

        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String muzInstrumentType = orderEntry.getKey();
            Integer numberOfMuzInstrumentToBeRemoved = orderEntry.getValue();
            int numberOfMuzInstrumentsToBeRemoved = 0;
            for (MusicInstrument muzInstrument : musicShop.getMusicInstruments()) {
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

    private static void removeMuzInstrumentsFromTheShop(MusicShop muzShop, Map<String, Integer> order){
        for (Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            String muzInstrumentType = orderEntry.getKey();
            Integer numberOfMuzInstrumentToBeRemoved = orderEntry.getValue();
            int numberOfMuzInstrumentsRemoved = 0;
            Iterator<MusicInstrument> iterator = muzShop.getMusicInstruments().iterator();
            while (iterator.hasNext()) {
                MusicInstrument muzInstrument = iterator.next();
                if (muzInstrument.getType().equals(muzInstrumentType) && numberOfMuzInstrumentsRemoved<numberOfMuzInstrumentToBeRemoved) {
                    iterator.remove();
                    numberOfMuzInstrumentsRemoved++;
                }
            }
        }
    }

}