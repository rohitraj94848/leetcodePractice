class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedStr = s.trim(); 
         int length = 0;
        for(int i = trimmedStr.length()-1 ; i >= 0 ; i--){
            if(trimmedStr.charAt(i) == ' '){
                break;
            }
            else{
                length++;
            }
        }
        return length;
    }
}