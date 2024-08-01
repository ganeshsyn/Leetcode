class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                if(ch>=65 && ch<=90 ){
                    ch=(char)(ch+32);
                }
                sb.append(ch);
            }
        }
        int i=0,j=sb.length()-1;
         while(i<j){
            if(sb.charAt(i)==sb.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}