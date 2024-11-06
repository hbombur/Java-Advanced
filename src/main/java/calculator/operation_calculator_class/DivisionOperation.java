package calculator.operation_calculator_class;

import calculator.abstract_class.AbstractCalculator;

public class DivisionOperation extends AbstractCalculator {

    @Override
    public void calculation(int num1, int num2) {
        try {
            if (num2 != 0) {
                setDoubleResult((double) num1 / num2);
            } else {
                throw new ArithmeticException("Делить на ноль нельзя!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error division: " + e);
        }
    }

    @Override
    public void calculation(double num1, double num2) {
        try {
            if (num2 != 0) {
                setDoubleResult(num1 / num2);
            } else {
                throw new ArithmeticException("Делить на ноль нельзя!");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error division: " + e);
        }
    }

    public void conversionToInt() {
        setIntegerResult(Double.valueOf(getDoubleResult()).intValue());
    }
}
