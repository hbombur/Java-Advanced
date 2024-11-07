import calculator.Calculation;
import funny_swap.FunnySwap;
import max_element.MaxElement;
import statistic_from_file.StatisticFromFile;
import sweet_gift.SweetGift;

import java.io.IOException;
import java.util.Map;
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
                    "|  5 - Слово с повторениями            |\n" +
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
                    Calculation calculation = new Calculation();
                    calculation.calculator(scanIn);
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
                case "5":
                    Map<String, Integer> sortedMap;
                    StatisticFromFile statisticFromFile = new StatisticFromFile();
                    try {
                        sortedMap = statisticFromFile.createSortedMap("statistic_from_file/file.txt");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    Map.Entry<String, Integer> mostCommonWord = statisticFromFile.findMostCommonWord(sortedMap);
                    System.out.printf("Слово с максимальным количеством повторений: '%s' (%d)%n",
                mostCommonWord.getKey(), mostCommonWord.getValue());
                default:
                    System.out.println("Пункт меню указан не корректно\n" +
                            "Или функционал находится в разработке\n\n" +
                            "Выберите приложение из меню отправив его номер в терминал:\n");

            }
        }
    }
}
