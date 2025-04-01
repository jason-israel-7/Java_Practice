//Method without Parameters but With a Return Value

import java.time.Year;

public class type2 {
    // public static String getMessage() {
    //     return "Hello from Java!";
    // }

    // public static void main(String[] args) {
    //     String msg = getMessage();  // Storing return value
    //     System.out.println(msg);
    // }   

     public static int getYear() {
        return Year.now().getValue();
    }

    public static void main(String[] args) {
        int year = getYear();
        System.out.println("Current Year: " + year);
    }
}
