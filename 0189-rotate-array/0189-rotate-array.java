class Solution {
    public int[] rotate(int[] nums, int k) {
    //     optimal solution
    int n = nums.length;
    k = k % n; 
    if (k == 0) {
    return nums;
    }

    int d = n - k;
    reverse(nums,0,d-1);
    reverse(nums,d,n-1);
    reverse(nums,0,n-1);
    return nums;


        // brute force soln
        // int k2=k%(nums.length);
        // int n=nums.length-k2;
        // int []temp=new int[n];
        // // for store temp
        // for(int i=0;i<n;i++){
        //     temp[i]=nums[i];
        // }
        // // shift the element
        // for(int i=n;i<nums.length;i++){
        //     nums[i-n]=nums[i];
        // }
        // // store the element back to the array
        // for(int i=nums.length-n;i<nums.length;i++){
        //     nums[i]=temp[i-(nums.length-n)];
        // }

        

    }
    static int[] reverse(int [] nums,int fi,int li){
        int j=fi;
        for(int i=li;i>=j;i--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
        }
        return nums;
    }
   
}