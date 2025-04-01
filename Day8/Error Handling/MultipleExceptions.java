public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[1] = 50 / 0; // Causes both ArrayIndexOutOfBoundsException and ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        } catch (Exception e) {
            System.out.println("General error occurred: " + e);
        }
    }
}
