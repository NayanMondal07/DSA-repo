public class MaximumMinimum {
    public static void findMaximumMinimum(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static void main(String[] args) {
        int[] numbers = {23, 1, 45, 78, 9, 12, 99, 5};
        findMaximumMinimum(numbers); 
    }
}
