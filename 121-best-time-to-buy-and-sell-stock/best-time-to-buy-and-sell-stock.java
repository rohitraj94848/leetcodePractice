class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int currProfit = 0 ;
        int maxProfit = 0 ;

        for(int i = 1 ; i < prices.length ;  i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i] ;
            }
            else{
                currProfit = prices[i] - buyPrice ;
                maxProfit = Math.max(maxProfit,currProfit);
            }
        }
        return maxProfit;
    }
}