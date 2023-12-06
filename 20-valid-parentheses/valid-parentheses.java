class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0 ; i < n ; i++ )
        {
            char ch = s.charAt(i);
            if(ch =='(' || ch =='{' || ch == '[' )
            {
                st.push(ch);
            }

            else{
                if(st.size() == 0)return false;
                char a = st.pop();

                if (ch == ')' && a != '(' ||
                    ch == '}' && a != '{' ||
                    ch == ']' && a != '[' )
                return false ;
                

            }
        }
        return st.isEmpty();

    }
}