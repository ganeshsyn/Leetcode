class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] count = new int[26];
        for(char x:s.toCharArray()){
            count[x-97]++;
        }
        for(char x:t.toCharArray()){
            count[x-97]--;
        }
        for(int val:count){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}