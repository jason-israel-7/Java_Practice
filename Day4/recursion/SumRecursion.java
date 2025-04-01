import java.util.Scanner;

public class SumRecursion {
    // Recursive method to calculate sum of first N natural numbers
    public static int sum(int n) {
        if (n == 0)  // Base case
            return 0;
        return n + sum(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sum(num);
        System.out.println("Sum of first " + num + " natural numbers is: " + result);
        sc.close();
    }
}
