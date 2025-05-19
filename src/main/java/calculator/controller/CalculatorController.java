package calculator.controller;

import calculator.domain.StringCalculator;
import calculator.view.InputView;

public class CalculatorController {

    public void run() {
        String input = new InputView().inputString();
        int result = new StringCalculator().calculate(input);
    }
}
