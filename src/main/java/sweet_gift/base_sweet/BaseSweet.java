package sweet_gift.base_sweet;

public class BaseSweet {

    private final String name;
    private final int weight;
    private final double price;

    public BaseSweet(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void getInfoSweet(){}
}
