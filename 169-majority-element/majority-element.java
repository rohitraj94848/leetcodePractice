class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        for(int n : nums){
            if(count == 0){
                num = n;
            }

            if(num == n){
                count++;
            }
            else{
                count--;
            }
        }
        return num;
    }
}