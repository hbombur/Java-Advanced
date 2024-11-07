package sweet_gift.sweets;

import sweet_gift.base_sweet.BaseSweet;

public class Marmalade extends BaseSweet {
    private final String taste;

    public Marmalade(String name, int weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }
}
