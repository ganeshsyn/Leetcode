import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Better Solution
        // List<Integer> al=Arrays.asList(nums);
        // ArrayList<Integer> list=new ArrayList<>(list);
        // Collections.addAll(list,nums);
        // Collections.sort(list);
        // int i=0,j=list.size()-1;
        // while(i<j){
        //     if(list.get(i)+list.get(j)<target){
        //         i++;
        //     }
        //     else if(list.get(i)+list.get(j)>target){
        //         j--;
        //     }
        //     else{
        //         return new int[]{i,j};
        //     }
        // }
        // return new int[] {};

        // Better soln - using Hashmap
        Map<Integer,Integer> numMap=new HashMap<>();
        int n=nums.length;

        //Build the hash table 
        for(int i=0;i<n;i++){
            numMap.put(nums[i],i);
        }

        // find complement
        for(int i=0;i<n;i++){
            int comp=target-nums[i];
            // looking for a number in the array that, when added to the current number, equals the target, and ensuring that it’s not the same number being used twice.
            if(numMap.containsKey(comp) && numMap.get(comp)!=i){
                return new int[] {i,numMap.get(comp)};
            }
        }
        return new int[] {};
    }
}