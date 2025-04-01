public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(5, 11);
        System.out.println("After Delete: " + sb);
    }
}
