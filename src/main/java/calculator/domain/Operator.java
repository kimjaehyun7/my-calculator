package calculator.domain;

import java.util.Arrays;

public enum Operator {

    ADD("+") {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT("-") {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public int apply(int a, int b) {
            return a / b;
        }
    };

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public abstract int apply(int a, int b);

    public static Operator from(String symbol) {
        return Arrays.stream(values())
                .filter(op -> op.symbol.equals(symbol))
                .findAny().get(); // 예외처리 때 수정 예정
    }
}
