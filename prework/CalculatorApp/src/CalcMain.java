import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which operation? (a or s, x to exit): ");
        String choice = scanner.next();
        while (!choice.equals("x")) {
            System.out.println("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter second number: ");
            int secondNumber = scanner.nextInt();
            if (choice.equals("a")) {
                System.out.println(calc.add(firstNumber, secondNumber));
            } else if (choice.equals("s")) {
                System.out.println(calc.subtract(firstNumber, secondNumber));
            } else {
                System.out.println("Operation doesn't exist!");
            }
            System.out.println("Which operation? (a or s, x to exit): ");
            choice = scanner.next();
        }
    }
}
