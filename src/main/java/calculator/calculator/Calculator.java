package calculator.calculator;

import calculator.abstract_class.AbstractCalculator;


public class Calculator extends AbstractCalculator {

    public void calculation(int num1, int num2, String operation) {
        switch (operation) {
            case "+":
                setIntegerResult(addition(num1, num2));
                break;
            case "-":
                setIntegerResult(substruction(num1, num2));
                break;
            case "*":
                setIntegerResult(multyply(num1, num2));
                break;
            case "/":
                setDoubleResult(division(num1, num2));

                if (getDoubleResult() % 1 == 0) {
                    conversionToInt();
                }
                break;
        }
    }

    public void calculation(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                addition(num1, num2);
                break;
            case "-":
                substruction(num1, num2);
                break;
            case "*":
                multyply(num1, num2);
                break;
            case "/":
                division(num1, num2);

                if (getDoubleResult() % 1 == 0) {
                    conversionToInt();
                    setIntegerResult((int) getDoubleResult());
                }
                break;
        }
    }
}
