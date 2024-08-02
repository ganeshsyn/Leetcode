//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        StringBuilder  res=new StringBuilder();
        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i)!=S.charAt(i+1)){
                res.append(S.charAt(i));
            }
        }
        res.append(S.charAt(S.length()-1));
        return res.toString();
    }
}