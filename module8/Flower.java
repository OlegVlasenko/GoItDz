public class Flower implements Comparable<Flower>{
    String type;
    String color;
    Integer price;

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public int compareTo(Flower o) {
        int compareQuality = ((Flower) o).getPrice();
        return this.getPrice() - compareQuality;
    }
}
