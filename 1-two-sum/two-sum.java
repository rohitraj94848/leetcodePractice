class Solution {
    public int[] twoSum(int[] nums, int target) {

        int []a =new int[2];
        int n = nums.length ;
        for(int i = 0 ; i < n ; i++)
        {
            
            for(int j = i + 1 ; j < n ; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    a[0] = i ;
                    a[1] = j ; 
                    break;
                }
            }
            
        }
        return a ;
    }
}