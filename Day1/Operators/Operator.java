public class Operator {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operators
        int num = 10;
        num += 5; // same as num = num + 5;
        System.out.println("After += : " + num);
        num *= 2; // same as num = num * 2;
        System.out.println("After *= : " + num);

        // Unary Operators
        int c = 5;
        System.out.println("c++: " + (c++)); // post-increment
        System.out.println("Now c: " + c);
        System.out.println("++c: " + (++c)); // pre-increment
    }
}
