//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    long floorSqrt(long n) {
        // Your code here
        // Binary search approach - logn
        long low=1,high=n,ans=1;
        while(low<=high){
            long mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
        
        // Linear search approach - n
        // for(int i=1;i<=n;i++){
        //     if(i*i<=n && (i+1)*(i+1)>n ){
        //         return i;
        //     }
        // }
        // return -1;
        
        // Math.sqrt()
        // long ans=(long)Math.sqrt(n);
        // return ans;
        
    }
}
