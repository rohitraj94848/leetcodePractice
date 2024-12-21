class Solution {
    public int candy(int[] ratings) {
        int []all = new int[ratings.length];
        Arrays.fill(all, 1);
        for(int i = 1 ; i < ratings.length ; i++){
            if(ratings[i] > ratings[i-1]){
                all[i] = all[i-1]+1;
            }
        }
        for(int i = ratings.length - 2 ; i >= 0 ; i--){
            if(ratings[i] > ratings[i+1]){
                all[i] = Math.max(all[i], all[i + 1] + 1);
            }
        }
        int totalCandies  = 0;
        for(int ans : all){
            totalCandies  = totalCandies  + ans;
        }
        return totalCandies ;

    }
}