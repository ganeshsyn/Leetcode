class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        // Arrays.sort(nums);
        // find maximum element
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1,high=max,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=(int)Math.ceil((double)nums[i]/mid);
            }
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return  ans;
    }
}