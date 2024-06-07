class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }
            else{
                list.add(nums[i]);
            }
        }
        return list;
    }
}