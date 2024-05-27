class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();

        for(int num:nums){
            map.add(num);
        }
        
        int l = 0 ;
        
        for(int num : nums){
            if(!map.contains(num - 1)){
                int curr = num;
                int currStreak = 1;

                while(map.contains(curr+1)){
                    curr++;
                    currStreak++;
                }
                l = Math.max(l, currStreak);
            }

        }
        return l;
    }
}