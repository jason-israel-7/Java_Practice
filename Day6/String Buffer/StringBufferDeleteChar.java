public class StringBufferDeleteChar {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.deleteCharAt(1);
        System.out.println("After DeleteCharAt: " + sb);
    }
}
