public class CalculatorModel {
    private int result;

    public void add(int a, int b) {
        result = a + b;
    }

    public void subtract(int a, int b) {
        result = a - b;
    }

    public void multiply(int a, int b) {
        result = a * b;
    }

    public void divide(int a, int b) {
        if (b != 0) {
            result = a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }

    public int getResult() {
        return result;
    }
}
import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    public int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public void displayResult(int result) {
        System.out.println("Result: " + result);
    }
}
public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void add() {
        int a = view.getInput("Enter first number: ");
        int b = view.getInput("Enter second number: ");
        model.add(a, b);
        view.displayResult(model.getResult());
    }

    public void subtract() {
        int a = view.getInput("Enter first number: ");
        int b = view.getInput("Enter second number: ");
        model.subtract(a, b);
        view.displayResult(model.getResult());
    }

    public void multiply() {
        int a = view.getInput("Enter first number: ");
        int b = view.getInput("Enter second number: ");
        model.multiply(a, b);
        view.displayResult(model.getResult());
    }

    public void divide() {
        int a = view.getInput("Enter first number: ");
        int b = view.getInput("Enter second number: ");
        try {
            model.divide(a, b);
            view.displayResult(model.getResult());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        controller.add();
        controller.subtract();
        controller.multiply();
        controller.divide();
    }
}
