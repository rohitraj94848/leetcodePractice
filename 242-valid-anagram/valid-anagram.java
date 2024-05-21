class Solution {

    public HashMap makeHash(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch , hm.get(ch) + 1);
            }
            else{
                hm.put(ch,1);
            }
        }
        return  hm;
    }

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> hashS = makeHash(s);
        HashMap<Character,Integer> hashT = makeHash(t);
        
        return hashS.equals(hashT);
    }
}