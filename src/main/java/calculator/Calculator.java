package calculator;

import calculator.operation_calculator_class.AdditionOperation;
import calculator.operation_calculator_class.DivisionOperation;
import calculator.operation_calculator_class.MultyplyOperation;
import calculator.operation_calculator_class.SubstractionOperation;

import java.util.Scanner;

public class Calculator {
    /**
     * @author Andrey Konovalov
     * В данной версии не реализована обработка исключений, в данный момент ведтуся работы по подготовке к обновлению
     */

    public void calculator() {
        Scanner scanIn = new Scanner(System.in);

        System.out.println("Добро пожаловать в приложение корпорации IBS Calculator.Calculator\n" +
                "Текущая версия приложения: 1.0.0\n" +
                "В данный момент поддерживаются следующии операции:\n" +
                "'+', '-', '*', '/'\n" +"Результат вычислений: " +
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
                    AdditionOperation additionOperation = new AdditionOperation();
                    if (splittedRequest[0].contains(".") || splittedRequest[2].contains(".")) {
                        additionOperation.calculation(
                                Double.parseDouble(splittedRequest[0]),
                                Double.parseDouble(splittedRequest[2]));
                        System.out.println(additionOperation.getFormatedStringDouble());
                        additionOperation.clear();
                    } else {
                        additionOperation.calculation(
                                Integer.parseInt(splittedRequest[0]),
                                Integer.parseInt(splittedRequest[2]));
                        System.out.println(additionOperation.getFormatedStringInteger());
                        additionOperation.clear();
                    }

                    break;
                case "-":
                    SubstractionOperation substractionOperation = new SubstractionOperation();
                    if (splittedRequest[0].contains(".") || splittedRequest[2].contains(".")) {
                        substractionOperation.calculation(
                                Double.parseDouble(splittedRequest[0]),
                                Double.parseDouble(splittedRequest[2]));
                        System.out.println(substractionOperation.getFormatedStringDouble());
                        substractionOperation.clear();
                    } else {
                        substractionOperation.calculation(
                                Integer.parseInt(splittedRequest[0]),
                                Integer.parseInt(splittedRequest[2]));
                        System.out.println(substractionOperation.getFormatedStringInteger());
                        substractionOperation.clear();
                    }
                    break;
                case "*":
                    MultyplyOperation multyplyOperation = new MultyplyOperation();
                    if (splittedRequest[0].contains(".") || splittedRequest[2].contains(".")) {
                        multyplyOperation.calculation(
                                Double.parseDouble(splittedRequest[0]),
                                Double.parseDouble(splittedRequest[2]));
                        System.out.println(multyplyOperation.getFormatedStringDouble());
                        multyplyOperation.clear();
                    } else {
                        multyplyOperation.calculation(
                                Integer.parseInt(splittedRequest[0]),
                                Integer.parseInt(splittedRequest[2]));
                        System.out.println(multyplyOperation.getFormatedStringInteger());
                        multyplyOperation.clear();
                    }
                    break;
                case "/":
                    DivisionOperation divisionOperation = new DivisionOperation();
                    if (splittedRequest[0].contains(".") || splittedRequest[2].contains(".")) {
                        divisionOperation.calculation(
                                Double.parseDouble(splittedRequest[0]),
                                Double.parseDouble(splittedRequest[2]));
                        System.out.println(divisionOperation.getFormatedStringDouble());
                    } else {
                        divisionOperation.calculation(
                                Integer.parseInt(splittedRequest[0]),
                                Integer.parseInt(splittedRequest[2]));
                        if (divisionOperation.getDoubleResult() % 1 == 0) {
                            divisionOperation.conversionToInt();
                            System.out.println(divisionOperation.getFormatedStringInteger());
                        } else {
                            System.out.println(divisionOperation.getFormatedStringDouble());
                        }
                    }
                    break;
            }
        }
    }
}
