class Solution {
    public void sortColors(int[] nums) {
        // betetr solution
        int count0=0,count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        for(int i=0;i<count0;i++){
            nums[i]=0;
        }
        for(int i=0;i<count1;i++){
            nums[i+count0]=1;
        }
        for(int i=0;i<count2;i++){
            nums[i+count0+count1]=2;
        }
    }
}