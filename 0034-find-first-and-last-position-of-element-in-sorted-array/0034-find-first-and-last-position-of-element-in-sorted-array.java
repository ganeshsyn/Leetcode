class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=firstoccurence(nums,target);
        int l=lastoccurence(nums,target);
        return new int[]{f,l};
    }
    static int firstoccurence(int []nums,int target){
        int first=-1;
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                first=m;
                e=m-1;
            }
            else if(nums[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return first;
    }
    static int lastoccurence(int []nums,int target){
        int last=-1;
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target){
                last=m;
                s=m+1;
            }
            else if(nums[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return last;
    }
}