package sweet_gift;

import sweet_gift.base_sweet.BaseSweet;
import sweet_gift.sweets.Candy;
import sweet_gift.sweets.Chocolate;
import sweet_gift.sweets.Cookies;
import sweet_gift.sweets.Marmalade;

import java.util.ArrayList;
import java.util.List;

public class SweetGift {
    List<BaseSweet> gift = new ArrayList<>();

    public void createSweetGift() {
        gift.add(new Candy("Крокант", 60, 37.99, "Грильяж"));
        gift.add(new Candy("Красный Октябрь", 60, 37.99, "Трюфель"));
        gift.add(new Chocolate("Alpen Gold", 40, 44.50, "Молочный"));
        gift.add(new Marmalade("Haribo", 30, 15.99, "Клубничный"));
        gift.add(new Marmalade("Haribo", 30, 16.99, "Лесные ягоды"));
        gift.add(new Cookies("Овсяное печенье \"Шарлиз\"", 30, 32.99, "Сдобное") );
        gift.add(new Cookies("Печенье слоеное \"Ушки\"", 45, 28.50, "Сахарное") );
        gift.add(new Cookies("Печенье \"Мария\"", 20, 17.99, "Затяжное") );
    }

    private static double calculateTotalWeight(List<BaseSweet> baseSweets) {
        return baseSweets.stream().mapToDouble(BaseSweet::getWeight).sum();
    }

    private static double calculateTotalPrice(List<BaseSweet> baseSweets) {
        return baseSweets.stream().mapToDouble(BaseSweet::getPrice).sum();
    }

    public double getTotalWeight() {
        return calculateTotalWeight(gift);
    }

    public double getTotalPrice() {
        return calculateTotalPrice(gift);
    }

    public void getInfoGift() {
        for (BaseSweet baseSweet : gift) {
            baseSweet.getInfoSweet();
        }
    }
}
