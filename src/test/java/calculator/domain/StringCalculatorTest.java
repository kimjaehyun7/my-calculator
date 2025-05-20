package calculator.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void 덧셈_계산() {
        int result = stringCalculator.calculate("1 + 2");
        assertEquals(3, result);
    }

    @Test
    void 잘못된_연산자_입력_예외() {
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.calculate("1 @ 2"));
    }

    @Test
    void 영으로_나누기_예외() {
        assertThrows(ArithmeticException.class, () -> stringCalculator.calculate("1 / 0"));
    }

    @Test
    void 피연산자가_숫자가아닌_예외() {
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.calculate("a + 1"));
    }

    @Test
    void 연산자와_피연산자_사이에_공백이없는_예외() {
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.calculate("1+2"));
    }

    @Test
    void 널_또는_빈문자열_예외() {
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.calculate(" "));
    }

    @Test
    void 연산자_피연산자_개수_불일치_예외() {
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.calculate("1 +"));
    }

}