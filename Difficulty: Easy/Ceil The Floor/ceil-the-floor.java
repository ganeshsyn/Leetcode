//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int s=0,e=arr.length-1;
        int ceil=-1,floor=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==x){
                return new int[]{x,x};
            }
            else if(arr[m]>=x){
                ceil=arr[m];
                e=m-1;
            }
            else{
                floor=arr[m];
                s=m+1;
            }
           
        }
       return new int[]{floor, ceil};

    }
}
