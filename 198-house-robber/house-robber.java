class Solution {
    public int recur(int []arr , int i){
        if( i >= arr.length) return 0;
        int inc = arr[i] + recur(arr , i+2);
        int exc = recur(arr , i+1);

        return Math.max(inc , exc);

    }
    public int memo(int []arr , int i , int []dp){
        if( i >= arr.length) return 0;
        if(dp[i] != -1) return dp[i];

        int inc = arr[i] + memo(arr , i+2 , dp);
        int exc = memo(arr , i+1 , dp);

        return dp[i] =  Math.max(inc , exc);

    }

    public int rob(int[] nums) {
        int []dp = new int[nums.length];
        Arrays.fill(dp , -1);
        return memo(nums , 0 , dp);
    }
}