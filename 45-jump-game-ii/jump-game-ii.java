class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int finish = 0;
        int coverage = 0;
        int jump = 0;
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (finish == i) {
                finish = coverage;
                jump++;
            }
            if( finish >=  nums.length-1){
                return jump;
            }

        }
        return jump;
    }
}