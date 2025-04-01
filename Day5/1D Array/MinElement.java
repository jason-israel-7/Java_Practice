public class MinElement {
    public static void main(String[] args) {
        int[] numbers = {10, 40, 5, 90, 2};
        int min = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum Element: " + min);
    }
}
