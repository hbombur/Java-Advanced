package calculator.abstract_class;

import calculator.base_calculator.BaseCalculator;

public abstract class AbstractCalculator implements BaseCalculator {
    protected int integerResult;
    protected double doubleResult;

    public String getFormatedStringDouble() {
        String result = "Результат вычислений: %.4f\n";
        return String.format(result, getDoubleResult());
    }

    public String getFormatedStringInteger() {
        String result = "Результат вычислений: %d\n";
        return String.format(result, getIntegerResult());
    }

    public int getIntegerResult() {
        return integerResult;
    }

    public double getDoubleResult(){
        return doubleResult;
    }

    public abstract void calculation(int num1, int num2);

    public void clear() {
        integerResult = 0;
        doubleResult = 0;
    }
    protected void setIntegerResult(int result) {
        this.integerResult = result;
    }

    protected void setDoubleResult(double result) {
        this.doubleResult = result;
    }
}
