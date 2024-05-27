class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int num:nums){
            map.put(num,true);
        }
        
        int l = 0 ;
        
        for(int num : nums){
            if(!map.containsKey(num - 1)){
                int curr = num;
                int currStreak = 1;

                while(map.containsKey(curr+1)){
                    curr++;
                    currStreak++;
                }
                l = Math.max(l, currStreak);
            }

        }
        return l;
    }
}