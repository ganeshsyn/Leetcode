class Solution {
    public String reverseWords(String s) {
        // store elements in an array of String by removing whitespaces from both the end(trim()) and splits the string s based on one or more spaces(denoted by the regex \\s+).
        // split("\\s+") - This handles cases where there are multiple spaces between words. 
       String [] str=s.trim().split("\\s+");

       StringBuilder sb = new StringBuilder();
       for(int  i=str.length-1;i>=0;i--){
        sb.append(str[i]);
        if(i>0){
            sb.append(" ");
        }
       }
       return sb.toString();
    }
}