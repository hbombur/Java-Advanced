package sweet_gift;

import java.util.ArrayList;
import java.util.List;

public class SweetGift {
    List<Sweet> gift = new ArrayList<>();

    public void createSweetGift() {
        gift.add(addSweetToGift("Candy", 50, 2.5, "Chocolate"));
        gift.add(addSweetToGift("Chocolate Bar", 100, 4.0, "Milk chocolate"));
        gift.add(addSweetToGift("Jellybean", 30, 1.8, "Strawberry flavor"));
    }

    private Sweet addSweetToGift(String name, int weight, double price, String uniqueParameter) {
        return new Sweet(name, weight, price, uniqueParameter);
    }

    private static double calculateTotalWeight(List<Sweet> sweets) {
        return sweets.stream().mapToDouble(Sweet::getWeight).sum();
    }

    private static double calculateTotalPrice(List<Sweet> sweets) {
        return sweets.stream().mapToDouble(Sweet::getPrice).sum();
    }

    public double getTotalWeight() {
        return calculateTotalWeight(gift);
    }

    public double getTotalPrice() {
        return calculateTotalPrice(gift);
    }

    public void getInfoGift() {
        for (Sweet sweet : gift) {
            sweet.getInfoSweet();
        }
    }
}
