import java.util.ArrayList;
class Solution {
    public int[] rearrangeArray(int[] nums) {
       //optimal soln
       int n=nums.length;
       int [] ans = new int[n];
       int pos=0,neg=1;
       for(int i=0;i<n;i++){
        if(nums[i]>0){
            ans[pos]=nums[i];
            pos+=2;
        }
        else{
            ans[neg]=nums[i];
            neg+=2;
        }
       }
       return ans;    


        // bruteforce soln
        // ArrayList<Integer> pos=new ArrayList<>();
        // ArrayList<Integer> neg=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         pos.add(nums[i]);
        //     }
        //     else{
        //         neg.add(nums[i]);
        //     }
        // }
        // for(int i=0;i<nums.length/2;i++){
        //     nums[2*i]=pos.get(i);
        //     nums[2*i+1]=neg.get(i);
        // }
        // return nums;
    }
}