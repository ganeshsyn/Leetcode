class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int s=1,e=n-2;
        if(n==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }

        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]!=nums[m+1] && nums[m]!=nums[m-1]){
                return nums[m];
            }
            else if((m%2==0 && nums[m]==nums[m+1]) ||( m%2==1 && nums[m]==nums[m-1])){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
}