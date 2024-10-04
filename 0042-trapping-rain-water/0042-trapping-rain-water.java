class Solution {
    public int trap(int[] height) {
        int n=height.length;
        // calculate left max
        int [] prefix=new int[n];
        prefix[0]=height[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }

        // calculate right max
        int [] postfix=new int[n];
        postfix[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            postfix[i]=Math.max(postfix[i+1],height[i]);
        }

        // compute total
        int total=0;
        for(int i=0;i<n;i++){
            int leftmax=prefix[i],rightmax=postfix[i];
            if(height[i]<leftmax && height[i]<rightmax){
                total+=Math.min(leftmax,rightmax)-height[i];
            }
        }
        return total;
    }
}