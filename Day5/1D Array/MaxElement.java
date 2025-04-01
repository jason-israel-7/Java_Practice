public class MaxElement {
    public static void main(String[] args) {
        int[] numbers = {10, 40, 5, 90, 2};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum Element: " + max);
    }
}
