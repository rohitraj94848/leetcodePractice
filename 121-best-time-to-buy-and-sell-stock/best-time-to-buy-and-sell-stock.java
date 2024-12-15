class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int curr_price = 0;
        int curr = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy_price > prices[i]) {
                buy_price = prices[i];

            } else {
                 curr = prices[i] - buy_price ;

            }
            if (max < curr) {
                max = curr;
            }
        }
        return max;
    }
}