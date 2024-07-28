// import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
    //     brute force soln
    //     ArrayList<Integer> l=new ArrayList<>();
    //     for(int i=0;i<nums.length;i++){
    //         l.add(nums[i]); 
    //     }
        
    //     Collections.sort(l);
    //     int i=0;
    //     for(i=0;i<l.size();i++){
    //         if(l.get(i)!=i){
    //             return i;
    //         }
    //     }
    //    return i;
    
    // optimal soln
    int x1=0,x2=0,x=0;
    for(int i=1;i<=nums.length;i++){
        x1=x1^i;
    }
    for(int i=0;i<nums.length;i++){
        x2=x2^nums[i];
    }
    x=x1^x2;
    return x;

    // optimal sol-2
    // int s1=0,s2=0,n=nums.length;
    // s1=(n*(n+1))/2;
    // for(int i=0;i<n;i++){
    //     s2+=nums[i];
    // }
    // int s=s1-s2;
    // return s;
    }
}
