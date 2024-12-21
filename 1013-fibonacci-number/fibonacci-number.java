class Solution {
    public int fib(int n) {
        int []dp = new int[n+1];
        Arrays.fill(dp,0);
        int ans = memo(n,dp);
        return ans;
    }

    public int memo(int n , int []dp){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(dp[n] != 0) return dp[n];

        int fib = memo(n-1,dp);
        int fib2 = memo(n-2,dp);
        dp[n] = memo(n-1,dp) + memo(n-2,dp);
        return fib + fib2;
    }
}