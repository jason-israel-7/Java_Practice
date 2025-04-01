//4. Method with Parameters and With a Return Value

public class type4 {
    // public static int multiply(int a, int b) {
    //     return a * b;
    // }

    // public static void main(String[] args) {
    //     int result = multiply(5, 3);  // Storing return value
    //     System.out.println("Multiplication: " + result);
    // }

    public static double getArea(double radius) {
        return 3.1416 * radius * radius;
    }

    public static void main(String[] args) {
        double area = getArea(7);
        System.out.println("Area of Circle: " + area);
    }
}
