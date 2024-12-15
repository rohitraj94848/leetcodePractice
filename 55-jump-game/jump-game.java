class Solution {
    public boolean canJump(int[] nums) {
        int fin_pos = nums.length - 1;

        for(int index = nums.length - 2 ; index >= 0 ; index--){
            if(index + nums[index] >= fin_pos){
                fin_pos = index;
            }
        }
        return fin_pos == 0;
    }
}