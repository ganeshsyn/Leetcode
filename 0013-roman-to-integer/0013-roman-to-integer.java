class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='I'){
                if(i+1<s.length() && s.charAt(i+1)=='V'){
                    ans+=4;
                    i++;
                }
                else if(i+1<s.length() && s.charAt(i+1)=='X'){
                    ans+=9;
                    i++;
                }
                else{
                    ans+=1;
                }
            }
            else if(c=='V'){
                ans+=5;
            }
            else if(c=='X'){
                if(i+1<s.length() && s.charAt(i+1)=='L'){
                    ans+=40;
                    i++;
                }
                else if(i+1<s.length() && s.charAt(i+1)=='C'){
                    ans+=90;
                    i++;
                }
                else{
                    ans+=10;
                }
            }
            else if(c=='L'){
                  ans+=50;
            }
            else if(c=='C'){
                if(i+1<s.length() && s.charAt(i+1)=='D'){
                    ans+=400;
                    i++;
                }
                else if(i+1<s.length() && s.charAt(i+1)=='M'){
                    ans+=900;
                    i++;
                }
                else{
                    ans+=100;
                }
            }
            else if(c=='D'){
                ans+=500;
            }
            else{
                ans+=1000;
            }
        }
        return ans;
    }
}