package calculator.operation_calculator_class;

import calculator.abstract_class.AbstractCalculator;

public class SubstractionOperation extends AbstractCalculator {

    @Override
    public void calculation(int num1, int num2) {
        setIntegerResult(num1 - num2);
    }

    @Override
    public void calculation(double num1, double num2) {
        setDoubleResult(num1 - num2);
    }
}
