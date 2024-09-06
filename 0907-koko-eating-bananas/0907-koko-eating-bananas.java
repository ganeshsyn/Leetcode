class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=findMax(piles),ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            int totalH=totalHour(piles,mid);
            if(totalH<=h){
                // ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       return low; 
    }
    // find maxm element in array - because that should be maximum hour to finish all the banana
    public static int findMax(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    // calculate ceiling value
    public static int totalHour(int [] arr,int hourly){
        int totalHour=0;
        for(int i=0;i<arr.length;i++){
            totalHour+=Math.ceil((double)arr[i]/(double)hourly);
        }
        return totalHour;
    }

}