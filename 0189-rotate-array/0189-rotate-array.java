
class Solution {
    public void rotate(int[] nums, int k) {
        int k2=k%(nums.length);
        int n=nums.length-k2;
        int []temp=new int[n];
        // for store temp
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        // shift the element
        for(int i=n;i<nums.length;i++){
            nums[i-n]=nums[i];
        }
        // store the element back to the array
        for(int i=nums.length-n;i<nums.length;i++){
            nums[i]=temp[i-(nums.length-n)];
        }
    }
}