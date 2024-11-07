package sweet_gift.sweets;

import sweet_gift.base_sweet.BaseSweet;

public class Cookies extends BaseSweet {
    private final String classification;

    public Cookies(String name, int weight, double price, String classification) {
        super(name, weight, price);
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }
}
