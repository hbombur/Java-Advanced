package calculator;

import calculator.calculator.Calculator;
import calculator.operation_calculator_class.AdditionOperation;
import calculator.operation_calculator_class.DivisionOperation;
import calculator.operation_calculator_class.MultyplyOperation;
import calculator.operation_calculator_class.SubstractionOperation;

import java.util.Scanner;

public class Calculation {
    /**
     * @author Andrey Konovalov
     * В данной версии не реализована обработка исключений, в данный момент ведтуся работы по подготовке к обновлению
     */

    public void calculator(Scanner scanner) {

        System.out.println("Добро пожаловать в приложение корпорации IBS Calculator.Calculator\n" +
                "Текущая версия приложения: 1.0.0\n" +
                "В данный момент поддерживаются следующии операции:\n" +
                "'+', '-', '*', '/'\n" + "Результат вычислений: " +
                "В качесте разделителя для чисел с плавающей точкой используйте символ '.'\n" +
                "Введите запрос в виде 'a + b':\n");

            String calcRequest = scanner.nextLine();
            String[] splittedRequest = calcRequest.split(" ");
            Calculator calculator = new Calculator();
            if (splittedRequest[0].contains(".") || splittedRequest[2].contains(".")) {
                try {
                    calculator.calculation(
                            Double.parseDouble(splittedRequest[0]),
                            Double.parseDouble(splittedRequest[2]),
                            splittedRequest[1]);
                    System.out.println(calculator.getFormatedStringDouble(calculator.getDoubleResult()));
                    calculator.clear();
                } catch (NumberFormatException | ArithmeticException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    calculator.calculation(
                            Integer.parseInt(splittedRequest[0]),
                            Integer.parseInt(splittedRequest[2]),
                            splittedRequest[1]);
                    System.out.println(calculator.getFormatedStringInteger(calculator.getIntegerResult()));
                    calculator.clear();
                } catch (NumberFormatException | ArithmeticException e) {
                    throw new RuntimeException(e);
                }
            }
//        }
    }
}
