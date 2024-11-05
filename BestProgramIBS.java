import Calculator.Calculator;
import MaxElement.MaxElement;

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
                    MaxElement maxElement = new MaxElement();
                    maxElement.maxElement();
                    break;
                default:
                    System.out.println("Пункт меню указан не корректно\n" +
                            "Или функционал находится в разработке\n\n" +
                            "Выберите приложение из меню отправив его номер в терминал:\n");

            }
        }
    }
}
