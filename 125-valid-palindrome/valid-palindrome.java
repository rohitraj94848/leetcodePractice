class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder ();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }

        String reverseStr = new StringBuilder(str).reverse().toString();
        String finalS = str.toString();

        return reverseStr.equals(finalS);
    }
}