import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
           swap(nums,0,n-1);
        }
        else{
            for(int i=n-1;i>=index;i--){
                if(nums[i]>nums[index]){
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            swap(nums,index+1,n-1);
            
        }
    }
    static public void swap(int [] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}