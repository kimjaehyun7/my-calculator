package calculator.controller;

import calculator.domain.StringCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    public void run() {
        String input = new InputView().readInput();
        int result = new StringCalculator().calculate(input);
        new OutputView().printResult(result);
    }
}
