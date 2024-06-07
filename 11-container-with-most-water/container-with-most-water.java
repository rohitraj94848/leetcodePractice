class Solution {
    public int maxArea(int[] height) {
        int result = 0 ;
        int left = 0;
        int right = height.length - 1;

        while(right > left){
        int ans =Math.min(height[left],height[right]) * (right - left);
        result = Math.max(result,ans);

        if(height[left] >= height[right]){
            right--;
        }
        else{
            left++;
        }
        }
        return result;
    }
}