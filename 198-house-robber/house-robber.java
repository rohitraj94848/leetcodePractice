class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int ans = memo(nums, 0, dp);
        return ans;
    }

    public int memo(int[] arr, int i, int[] dp) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1)
            return dp[i];
        int inc = arr[i] + memo(arr, i + 2, dp);
        int exc = memo(arr, i + 1, dp);

        return dp[i] = Math.max(inc, exc);
    }
}