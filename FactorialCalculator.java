import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int factorial = calculateFactorial(number); 
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
    public static int calculateFactorial(int number) {
        int factorial = 1; 
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        } 
        return factorial;
    }
}