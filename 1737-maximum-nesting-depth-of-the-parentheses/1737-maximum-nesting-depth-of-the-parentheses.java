class Solution {
    public int maxDepth(String s) {
        int max=0,curMax=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                curMax++;
                max=Math.max(max,curMax);
            }
            else if(s.charAt(i)==')'){
                curMax--;
            }
            else{
                continue;
            }
        }
        return max;
    }
}