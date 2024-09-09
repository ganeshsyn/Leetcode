class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int ans=0,j=0,sign=1;
        if(s.charAt(0)=='-'){
            sign=-1;
            j++;
        }
        else if((s.charAt(0)=='+')){
            j++;
        }
        while(j<s.length()){
           char c=s.charAt(j);
           if(!Character.isDigit(c)){
               break;
           }
           int digit=c-'0';
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans=ans*10+digit;
            j++;
        }
        return ans*sign;
    }
    
}