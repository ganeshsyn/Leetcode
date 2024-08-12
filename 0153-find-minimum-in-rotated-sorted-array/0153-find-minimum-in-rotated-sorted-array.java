// identify the sorted half
// pickup min in tha half and eliminate it
// compare with ans and updates the ans whichever is minm
class Solution {
    public int findMin(int[] nums) {
        int s=0,e=nums.length-1,n=nums.length;
        int ans = Integer.MAX_VALUE;

        while(s<=e){
            int m=s+(e-s)/2;
            // check if left half is sorted 
            if(nums[s]<=nums[m]){
                // pick the minimum and eliminate it
                ans=Math.min(ans,nums[s]);
                s=m+1;
            }else{
               // right part is sorted
               // pick the minimum and eliminate it
               ans=Math.min(ans,nums[m]);
               e=m-1;
            }
         }
         return ans;
    }
}