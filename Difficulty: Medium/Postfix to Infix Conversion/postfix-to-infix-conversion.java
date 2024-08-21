//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        Stack <String> stack=new Stack<>();
        int i=0;
        while(i<exp.length()){
            String s = Character.toString(exp.charAt(i));
            if (s.length() == 1 && Character.isLetterOrDigit(s.charAt(0))) {
                stack.push(s);
            }
            else{
                String t1=stack.pop();
                String t2=stack.pop();
                String con="("+t2+s.charAt(0)+t1+")";
                stack.push(con);
            }
            i++;
        }
        return stack.peek();
    }
}
