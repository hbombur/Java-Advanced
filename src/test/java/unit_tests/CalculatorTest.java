package unit_tests;


import calculator.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    @Test
    public void checkAdditionIntNums() {
        Calculator calculator = new Calculator();
        calculator.addition(2, 3);
        String result = calculator.getFormatedStringInteger(calculator.getIntegerResult());

        assertEquals("5", result, "Сложение не работает");
    }

    @Test
    public void checkSubstractionIntNums() {
        Calculator calculator = new Calculator();
        calculator.substruction(2, 3);
        String result = calculator.getFormatedStringInteger(calculator.getIntegerResult());

        assertEquals("-1", result, "Вычитание не работает");
    }

    @Test
    public void checkMultyplyIntNums() {
        Calculator calculator = new Calculator();
        calculator.multyply(2, 3);
        String result = calculator.getFormatedStringInteger(calculator.getIntegerResult());

        assertEquals("6", result, "Умножение не работает");
    }

    @Test
    public void checkDivisionIntNums() {
        Calculator calculator = new Calculator();
        calculator.division(6, 3);
        String result = calculator.getFormatedStringInteger(calculator.getIntegerResult());
        assertEquals("2", result, "Деление не работает");
    }
}
