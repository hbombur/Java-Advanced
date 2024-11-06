import calculator.Calculator;
import funny_swap.FunnySwap;
import max_element.MaxElement;
import sweet_gift.SweetGift;

import java.util.Scanner;

public class BestProgramIBS {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        String choiceMenu;

        while (true) {
            System.out.println("|======================================|\n" +
                    "|  Добро пожаловать в приложение IBS.  |\n" +
                    "|                                      |\n" +
                    "|  Выберите необходимый пункт меню:    |\n" +
                    "|  1 - Калькулятор                     |\n" +
                    "|  2 - Поиск наибольшего слова         |\n" +
                    "|  3 - Поменять числа местами          |\n" +
                    "|  4 - Собрать сладкий подарок         |\n" +
                    "|                                      |\n" +
                    "|  Для завершения введите Exit         |\n" +
                    "|======================================|\n");
            choiceMenu = scanIn.nextLine();
            if (choiceMenu.equalsIgnoreCase("exit")) {
                scanIn.close();
                System.exit(0);
            }
            switch (choiceMenu) {
                case "1":
                    Calculator calculator = new Calculator();
                    calculator.calculator();
                    break;
                case "2":
                    MaxElement maxElement = new MaxElement(scanIn);
                    maxElement.maxElement();
                    break;    // Создаем список сладостей для подарка
                case "3":
                    FunnySwap funnySwap = new FunnySwap();
                    funnySwap.createArray();
                    System.out.println("Сгенерированный массив элементов int: " + funnySwap.getArray() + "\n");
                    System.out.println("Индекс максимального отрицательного числа: " + funnySwap.getIndexOfMax() + "\n");
                    System.out.println("Индекс минимального положительного числа: " + funnySwap.getIndexOfMin() + "\n");
                    funnySwap.funnySwap();
                    System.out.println("Измененный массив элементов int: " + funnySwap.getArray() + "\n");
                    System.out.println("Измененный индекс максимального отрицательного числа: " + funnySwap.getIndexOfMax() + "\n");
                    System.out.println("Измененный индекс минимального положительного числа: " + funnySwap.getIndexOfMin() + "\n");
                    break;
                case "4":
                    SweetGift sweetGift = new SweetGift();
                    sweetGift.createSweetGift();
                    System.out.println("Общий вес подарка: " + sweetGift.getTotalWeight());
                    System.out.println("Общая цена подарка: " + sweetGift.getTotalPrice());
                    sweetGift.getInfoGift();
                    break;
                default:
                    System.out.println("Пункт меню указан не корректно\n" +
                            "Или функционал находится в разработке\n\n" +
                            "Выберите приложение из меню отправив его номер в терминал:\n");

            }
        }
    }
}
