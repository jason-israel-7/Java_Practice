public class OTPGenerator {
    public static void main(String[] args) {
        int otp4 = (int)(Math.random() * 9000) + 1000;
        int otp6 = (int)(Math.random() * 900000) + 100000;

        System.out.println("4-digit OTP: " + otp4);
        System.out.println("6-digit OTP: " + otp6);
    }
}
