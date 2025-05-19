package calculator.domain;

public class StringCalculator {
    // 계산 로직 구현 예정
    public int calculate(String input) {

        String[] elements = input.split(" ");
        int result = Integer.parseInt(elements[0]); // 첫 번째 숫자를 초기값으로 저장

        for (int i = 1; i < elements.length; i += 2) {
            String operator = elements[i]; // 연산자
            int operand = Integer.parseInt(elements[i + 1]); // 피연산자

            Operator op = Operator.from(operator);
            result = op.apply(result, operand);
        }
        return result;
    }
}
