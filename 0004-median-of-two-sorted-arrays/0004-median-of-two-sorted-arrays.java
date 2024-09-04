class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // optimal soln - to reduce the extra space - eliminate list
        int i=0,j=0;
        int count=0;
        int n1=nums1.length,n2=nums2.length;
        int n=n1+n2;
        int index1=n/2-1,index2=n/2;
        int index1Ele=-1,index2Ele=-1;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(count==index1) index1Ele=nums1[i]; 
                if(count==index2) index2Ele=nums1[i];
                i++;
                count++; 
            }
            else{
                if(count==index1) index1Ele=nums2[j]; 
                if(count==index2) index2Ele=nums2[j];
                j++;
                count++; 
            }
        } 
        while(i<n1){
            if(count==index1) index1Ele=nums1[i]; 
            if(count==index2) index2Ele=nums1[i];
            i++;
            count++;
        }
        while(j<n2){
            if(count==index1) index1Ele=nums2[j]; 
            if(count==index2) index2Ele=nums2[j];
            j++;
            count++;
        }
        if(n%2==1){
            return (double) index2Ele;
        }
        double ans=(double)(index1Ele+index2Ele)/2.0;
        return ans;




        // Brute force soln
        // int i=0,j=0;
        // List <Integer> list=new ArrayList<>();
        // int n1=nums1.length,n2=nums2.length;
        // int n=n1+n2;
        // while(i<n1 && j<n2){
        //     if(nums1[i]<nums2[j]){
        //         list.add(nums1[i]);
        //         i++;
        //     }
        //     else{
        //         list.add(nums2[j]);
        //         j++;
        //     }
        // }
        // while(i<n1){
        //     list.add(nums1[i]);
        //     i++;
        // }
        // while(j<n2){
        //     list.add(nums2[j]);
        //     j++;
        // }
        // if(n%2==1){
        //     return (double) list.get(n/2);
        // }
        // double ans=(double)(list.get(n/2)+list.get((n/2)-1))/2.0;
        // return ans;
    }
}