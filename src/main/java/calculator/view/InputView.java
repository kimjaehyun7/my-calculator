package calculator.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in); // 프로그램 종료까지 재사용 가능
    public String inputString() {
        System.out.print("계산식을 입력하세요(예: 2 + 3 * 4): ");
        return scanner.nextLine();
    }
}
