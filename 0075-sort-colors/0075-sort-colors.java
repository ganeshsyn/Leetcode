class Solution {
    public void sortColors(int[] nums) {
        // optimal soln - (O(N))
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                
                high--;
            }
        }


        // betetr solution (O(2N))
        // int count0=0,count1=0,count2=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count0++;
        //     }
        //     else if(nums[i]==1){
        //         count1++;
        //     }
        //     else{
        //         count2++;
        //     }
        // }
        // for(int i=0;i<count0;i++){
        //     nums[i]=0;
        // }
        // for(int i=0;i<count1;i++){
        //     nums[i+count0]=1;
        // }
        // for(int i=0;i<count2;i++){
        //     nums[i+count0+count1]=2;
        // }
    }
}