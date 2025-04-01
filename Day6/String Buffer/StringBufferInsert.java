public class StringBufferInsert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Java");
        sb.insert(6, "World ");
        System.out.println("After Insert: " + sb);
    }
}
