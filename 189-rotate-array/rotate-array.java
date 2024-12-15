class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] nums, int f, int l) {
        while (f<l) {
            int temp = nums[l];
            nums[l] = nums[f];
            nums[f] = temp;
            f++;
            l--;
        }
    }
}