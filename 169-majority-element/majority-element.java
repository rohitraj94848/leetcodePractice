class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        int majorityElement = nums[0];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount ){
                maxCount = entry.getValue();
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;
    }
}