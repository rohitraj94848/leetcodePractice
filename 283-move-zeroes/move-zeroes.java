class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0 ;
        for(int i = 0 ;  i < nums.length ; i++){
            if(nums[i]!=0){
                nums[start] = nums[i];
                start++;
            }
        }
        for(int j = start ; j < nums.length ; j++){
            nums[start] = 0 ;
            start++;
        }        
    }
}