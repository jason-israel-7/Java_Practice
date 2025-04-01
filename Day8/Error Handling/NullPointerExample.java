public class NullPointerExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Null value encountered!");
        }
    }
}
