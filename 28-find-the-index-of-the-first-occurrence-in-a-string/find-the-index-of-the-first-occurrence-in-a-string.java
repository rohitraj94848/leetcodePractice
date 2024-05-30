class Solution {
    public int strStr(String haystack, String needle) {
         for (int i = 0; i < haystack.length(); i++) {
            for(int j = i+1 ; j <= haystack.length() ; j++ ){
                String str = haystack.substring(i,j);
                if(needle.equals(str)){
                    return i;
                }
            }
        }
        return -1;
    }
}