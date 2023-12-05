class Solution {
    public boolean isPalindrome(int x) {
        int number = x;
        int temp = number ;
        int rev = 0;
        temp = number ;
        while(temp != 0){
            int n =temp % 10;
            rev = (rev * 10) + n ;
            temp = temp / 10 ;
            
        }
        if(number < 0)
        {
            return false ;
        }

        if(number == rev)
        {
            return true;
        }
        
        return false;
    }
}