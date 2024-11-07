package calculator.abstract_class;

import calculator.base_calculator.BaseCalculator;
import calculator.operation_calculator_class.AdditionOperation;
import calculator.operation_calculator_class.DivisionOperation;
import calculator.operation_calculator_class.MultyplyOperation;
import calculator.operation_calculator_class.SubstractionOperation;

public abstract class AbstractCalculator implements BaseCalculator {
    protected int integerResult;
    protected double doubleResult;

    public int addition(int num1, int num2) {
        AdditionOperation additionOperation = new AdditionOperation();
        return additionOperation.calculation(num1, num2);
    }

    public double addition(double num1, double num2) {
        AdditionOperation additionOperation = new AdditionOperation();
        return additionOperation.calculation(num1, num2);
    }

    public int substruction(int num1, int num2) {
        SubstractionOperation substractionOperation = new SubstractionOperation();
        return substractionOperation.calculation(num1, num2);
    }

    public double substruction(double num1, double num2) {
        SubstractionOperation substractionOperation = new SubstractionOperation();
        return substractionOperation.calculation(num1, num2);
    }

    public int multyply(int num1, int num2) {
        MultyplyOperation multyplyOperation = new MultyplyOperation();
        return multyplyOperation.calculation(num1, num2);
    }

    public double multyply(double num1, double num2) {
        MultyplyOperation multyplyOperation = new MultyplyOperation();
        return multyplyOperation.calculation(num1, num2);
    }

    public double division(int num1, int num2) {
        DivisionOperation divisionOperation = new DivisionOperation();
        return divisionOperation.calculation((double)num1, (double)num2);
    }

    public double division(double num1, double num2) {
        DivisionOperation divisionOperation = new DivisionOperation();
        return divisionOperation.calculation(num1, num2);
    }

    public void conversionToInt() {
        setIntegerResult(Double.valueOf(getDoubleResult()).intValue());
    }

    public String getFormatedStringDouble(double doubleResult) {
        String result = "Результат вычислений: %.4f\n";
        return String.format(result, doubleResult);
    }

    public String getFormatedStringInteger(int integerResult) {
        String result = "Результат вычислений: %d\n";
        return String.format(result, integerResult);
    }

    public void setIntegerResult(int result) {
        integerResult = result;
    }

    public void setDoubleResult(double result) {
        doubleResult = result;
    }

    public int getIntegerResult() {
        return integerResult;
    }

    public double getDoubleResult(){
        return doubleResult;
    }

    public void clear() {
        integerResult = 0;
        doubleResult = 0;
    }
}
