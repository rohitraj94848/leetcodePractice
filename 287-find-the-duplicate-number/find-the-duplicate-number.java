class Solution {
    public int findDuplicate(int[] nums) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}