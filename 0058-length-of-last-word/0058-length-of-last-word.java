class Solution {
    public int lengthOfLastWord(String s) {
     
        // Trim the string to remove any leading or trailing whitespace
        s = s.trim();
        
        // Check if the string is empty after trimming
        if (s.isEmpty()) {
            return 0;
        }
        
        // Split the string into words based on spaces
        String[] words = s.split(" ");
        
        // Get the last word in the array
        String lastWord = words[words.length - 1];
        
        // Return the length of the last word
        return lastWord.length();
    }
}
