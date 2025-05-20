package calculator.domain;

public class StringCalculator {
    // 계산 로직 구현 예정
    public int calculate(String input) {

        if (input.trim().isEmpty() || input == null) {
            throw new IllegalArgumentException("입력이 비어 있습니다.");
        }

        if (!input.matches("^(\\S+\\s\\S+)(\\s\\S+)*$")) {
            throw new IllegalArgumentException("입력 형식이 잘못되었습니다. 연산자와 피연산자 사이에 공백이 필요합니다.");
        }

        String[] elements = input.split(" ");
        if (elements.length % 2 == 0) {
            throw new IllegalArgumentException("수식의 형식이 잘못되었습니다.(연산자/피연산자 개수 확인 필요)");
        }
        int result = parseIntWithCheck(elements[0]); // 첫 번째 숫자를 초기값으로 저장

        for (int i = 1; i < elements.length; i += 2) {
            String operator = elements[i]; // 연산자
            int operand = parseIntWithCheck(elements[i + 1]); // 피연산자

            Operator op = Operator.from(operator);
            result = op.apply(result, operand);
        }
        return result;
    }

    private static int parseIntWithCheck(String element) {
        try {
            return Integer.parseInt(element);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다. -> " + element);
        }
    }
}
