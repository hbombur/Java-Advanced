package sweet_gift.sweets;

import sweet_gift.base_sweet.BaseSweet;

public class Candy extends BaseSweet {
    private final String type;

    public Candy(String name, int weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
