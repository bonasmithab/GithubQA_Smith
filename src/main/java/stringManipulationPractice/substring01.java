package stringManipulationPractice;

import java.util.Scanner;

public class substring01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression (e.g., 5 + 3):");
        String expression = scanner.nextLine();

        int spaceIndex = expression.indexOf(' ');
        if (spaceIndex == -1) {
            System.out.println("Invalid expression format!");
            return;
        }

        String num1Str = expression.substring(0, spaceIndex);
        char operator = expression.charAt(spaceIndex + 1);
        String num2Str = expression.substring(spaceIndex + 3); // Skip operator and space

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
