public class StringBufferDelete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.delete(5, 11);
        System.out.println("After Delete: " + sb);
    }
}
