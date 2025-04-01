public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int key = 30;
        boolean found = false;

        for (int num : numbers) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found in array.");
        else
            System.out.println("Element not found in array.");
    }
}
