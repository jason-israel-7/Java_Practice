import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {50, 10, 40, 20, 30};
        Arrays.sort(numbers);

        System.out.println("Sorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
