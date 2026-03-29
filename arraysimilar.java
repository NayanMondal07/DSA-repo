public class arraysimilar {
    public static void main(String[] args) {
        int arr1[] = {1, 9, 5, 8};
        int arr2[] = {4, 8, 9, 6};
        int count = 0;

        // find common elements
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common element: " + arr1[i]);
                    count++;
                }
            }
        }

        // check if no common element
        if (count == 0) {
            System.out.println("They are not similar");
        } else {
            System.out.println("Arrays are similar (at least one match found)");
        }
    }
}

    

