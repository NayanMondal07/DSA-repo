public class Expectme {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixLeft = new int[n];
        int[] prefixRight = new int[n];
        int[] result = new int[n];

        
        prefixLeft[0] = 1;
        for (int i = 1; i < n; i++) {
            prefixLeft[i] = prefixLeft[i - 1] * nums[i - 1];
        }

        // Build prefix product from right
        prefixRight[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            prefixRight[i] = prefixRight[i + 1] * nums[i + 1];
        }

    
        for (int i = 0; i < n; i++) {
            result[i] = prefixLeft[i] * prefixRight[i];
        }

        return result;
    }
}

