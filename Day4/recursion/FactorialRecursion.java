import java.util.Scanner;

public class FactorialRecursion {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1)  // Base case
            return 1;
        return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);
        sc.close();
    }
}
