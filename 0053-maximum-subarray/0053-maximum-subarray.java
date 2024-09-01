class Solution {
    public int maxSubArray(int[] nums) {
        // optimal son - Kadanes Algorithm
        int max=nums[0],sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }

        // Brute force soln
        // int max=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         max=Math.max(max,sum);
        //     }
        // }
        return max;
    }
}