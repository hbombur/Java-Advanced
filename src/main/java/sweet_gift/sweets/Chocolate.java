package sweet_gift.sweets;

import sweet_gift.base_sweet.BaseSweet;

public class Chocolate extends BaseSweet {
    private final String structure;
    public Chocolate(String name, int weight, double price, String structure) {
        super(name, weight, price);
        this.structure = structure;
    }

    public String getUniqueParameter() {
        return structure;
    }
}
