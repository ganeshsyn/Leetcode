class Solution {
    public boolean search(int[] nums, int target) {
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                return true;
            }
            if(nums[s]==nums[m] && nums[m]==nums[e]){
                s++;
                e--;
            }
            // check if left part is sorted
            else if(nums[s]<=nums[m]){
                // find in sorted array(left part){
                    if(nums[s]<=target && target<=nums[m]){
                        e=m-1;
                    }
                    else{
                        s=m+1;
                    }
                }
                // right part is sorted
                else{
                    // find in sorted array(right part)
                    if(nums[m]<=target && target<=nums[e]){
                        s=m+1;
                    }
                    else{
                        e=m-1;
                    }
                }
            }
             return false;
    }
}