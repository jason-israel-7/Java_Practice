public class StringBufferReplace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Java");
        sb.replace(6, 10, "Python");
        System.out.println("After Replace: " + sb);
    }
}
