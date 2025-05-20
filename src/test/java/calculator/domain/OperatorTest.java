package calculator.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    void 사칙연산_정상동작() {
        assertEquals(3, Operator.ADD.apply(1, 2)); // 덧셈
        assertEquals(1, Operator.SUBTRACT.apply(3, 2)); // 뺄셈
        assertEquals(15, Operator.MULTIPLY.apply(3, 5)); // 곱셈
        assertEquals(4, Operator.DIVIDE.apply(20, 5)); // 나눗셈
    }

    @Test
    void from_정상동작() {
        assertEquals(Operator.ADD, Operator.from("+"));
        assertEquals(Operator.SUBTRACT, Operator.from("-"));
        assertEquals(Operator.MULTIPLY, Operator.from("*"));
        assertEquals(Operator.DIVIDE, Operator.from("/"));
    }

    @Test
    void from_예외처리() {
        assertThrows(IllegalArgumentException.class, () -> Operator.from("@"));
    }
}