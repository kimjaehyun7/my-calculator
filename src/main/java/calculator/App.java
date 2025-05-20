package calculator;

import calculator.controller.CalculatorController;

public class App {
    public static void main(String[] args) {
        try {
            new CalculatorController().run();
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("[예외 발생] -> " + e.getMessage());
        }
    }
}