package Calculator;

import java.util.Scanner;

public class Calculator {
    /**
     * @author Andrey Konovalov
     * @version %I%, %G%
     * В данной версии не реализована обработка исключений, в данный момент ведтуся работы по подготовке к обновлению
     */
    private static String returnFormatedStringDouble(Object a) {
        /**
         * Метод, реализующий округление дробных чисел.
         * Возвращает полученное значение в отформатированном виде.
         * @return String
         */
        String result = "Результат операции: %.4f";
        return String.format(result, a);
    }

    private static String calcPlus(String a, String b) {

        /**
         * Метод возвращает результат операции 'сложение' в виде строки
         * @see returnFormatedStringDouble(Object a)
         */

        if (a.contains(".") || (b.contains("."))) {
            return returnFormatedStringDouble(Double.parseDouble(a) + Double.parseDouble(b));
        }
        else {
            return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        }
    }

    private static String calcMinus(String a, String b) {
        /**
         * Метод возвращает результат операции 'вычитание' в виде строки
         * @see returnFormatedStringDouble(Object a)
         */
        if (a.contains(".") || (b.contains("."))) {
            return returnFormatedStringDouble(Double.parseDouble(a) - Double.parseDouble(b));
        }
        else {
            return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
        }
    }

    private static String calcMultiply(String a, String b) {
        /**
         * Метод возвращает результат операции 'умножение' в виде строки
         * @see returnFormatedStringDouble(Object a)
         */
        if (a.contains(".") || (b.contains("."))) {
            return returnFormatedStringDouble(Double.parseDouble(a) * Double.parseDouble(b));
        }
        else {
            return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
        }
    }

    private static String calcDivision(String a, String b) {
        /**
         * Метод возвращает результат операции 'деление' в виде строки.
         * @see returnFormatedStringDouble(Object a)
         */
        if (a.contains(".") || (b.contains("."))) {
            return returnFormatedStringDouble(Double.parseDouble(a) / Double.parseDouble(b));
        }
        else {
            return String.valueOf(Integer.parseInt(a) / Integer.parseInt(b));
        }
    }

    public void calculator() {
        Scanner scanIn = new Scanner(System.in);

        System.out.println("Добро пожаловать в приложение корпорации IBS Calculator.Calculator\n" +
                "Текущая версия приложения: 1.0.0\n" +
                "В данный момент поддерживаются следующии операции:\n" +
                "'+', '-', '*', '/'\n" +
                "В качесте разделителя для чисел с плавающей точкой используйте символ '.'\n" +
                "Для завершения работы калькулятора введите 'Exit'\n" +
                "Введите запрос в виде 'a + b':\n");
        while (true) {
            String calcRequest = scanIn.nextLine();
            if (calcRequest.equalsIgnoreCase("exit")) {
                break;
            }
            String[] splittedRequest = calcRequest.split(" ");
            switch (splittedRequest[1]) {
                case "+":
                    System.out.println(calcPlus(splittedRequest[0], splittedRequest[2])); break;
                case "-":
                    System.out.println(calcMinus(splittedRequest[0], splittedRequest[2])); break;
                case "*":
                    System.out.println(calcMultiply(splittedRequest[0], splittedRequest[2])); break;
                case "/":
                    System.out.println(calcDivision(splittedRequest[0], splittedRequest[2])); break;
            }
        }
    }
}
