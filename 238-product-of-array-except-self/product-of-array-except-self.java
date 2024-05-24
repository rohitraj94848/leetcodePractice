class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int[] output = new int[n];

        // Initialize the prefix and postfix arrays
        prefix[0] = 1;
        postfix[n - 1] = 1;

        // Compute prefix products
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Compute postfix products
        for (int j = n - 2; j >= 0; j--) {
            postfix[j] = postfix[j + 1] * nums[j + 1];
        }

        // Compute the result using prefix and postfix products
        for (int k = 0; k < n; k++) {
            output[k] = prefix[k] * postfix[k];
        }

        return output;
    }
}
