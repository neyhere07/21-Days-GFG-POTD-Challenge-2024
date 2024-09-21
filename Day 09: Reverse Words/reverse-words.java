


class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        // Split the string by '.'
        String[] words = str.split("\\.");
        
        // Use StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Traverse the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            // Add the dot after each word except for the last word
            if (i != 0) {
                result.append(".");
            }
        }
        
        // Return the reversed string
        return result.toString();
    }
}