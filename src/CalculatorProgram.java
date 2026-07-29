import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();

        double result=0;
        boolean validOperation=true;

        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
            }
            default -> {
                System.out.println("Error: Invalid operator.");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}