import java.util.Stack;
class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> st=new Stack<>();

        // inserting into stack
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && (st.peek()-'0')>(num.charAt(i)-'0')){
            st.pop();
            k--;
            }
           st.push(num.charAt(i));
        }

        // edge case - 3 if there are still digits to remove 
        while(k>0){
            st.pop();
            k--;
        }

        // to store ans
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        // Reverse the result as the digits are in reverse order
       res.reverse();

        // edge case - 1 Remove leading zeros 
        while (res.length() > 1 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        // edge case - 2 Remove leading zeros
        return res.length()==0 ? "0" : res.toString();
       
    }
}