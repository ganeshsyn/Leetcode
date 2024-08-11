//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        int f=firstoccurence(arr,x);
        int l=lastoccurence(arr,x);
        if(f==-1 || l==-1){
            return 0;
        }
        else{
            return (l-f)+1;
        }
        
    }
     static int firstoccurence(int []arr,int target){
        int first=-1;
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                first=m;
                e=m-1;
            }
            else if(arr[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return first;
    }
    static int lastoccurence(int []arr,int target){
        int last=-1;
        int s=0,e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                last=m;
                s=m+1;
            }
            else if(arr[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return last;
    }
}