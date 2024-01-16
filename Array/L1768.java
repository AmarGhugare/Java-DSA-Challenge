package Array;

/**
 * Problem no :- 0004
 * Platform :- Leetcode
 * Question :- Merge Strings Alternately
 * Category :- Array
 * Tags :- Array, String
 * 
 * Author :- Amar
 * Date :- 15/01/2024
 */

public class L1768 {

    /**
     * Merges two strings alternately based on the specified method.
     * @param word1 the first input string
     * @param word2 the second input string
     * @param method the method to use for merging (1 or 2, 0 for default)
     * @return the merged string based on the chosen method
     * @throws IllegalArgumentException if method is not 1 or 2
     * @see <a href="https://leetcode.com/problems/merge-strings-alternately/">Merge Strings Alternately</a>
     */
    public String mergeAlternately(String word1, String word2, int method) {
        switch (method) {
            case 1:
                StringBuilder merged = new StringBuilder();
                for(int i=0, j=0;i<word1.length()||j<word2.length();i++,j++){
                    if (i<word1.length()) {
                        merged.append(word1.charAt(i)); 
                    }
                    if(j<word2.length()){
                        merged.append(word2.charAt(j));
                    }
                }
                return new String(merged);
            case 2:
                int l1 = word1.length(), l2 = word2.length();
                int p1, p2, p3;
                p1 = p2 = p3 = 0;
                char[] merged2 = new char[l1+l2];
                while (p1<l1 || p2<l2) {
                    if(p1<l1) {
                        merged2[p3++] = word1.charAt(p1++);
                    }
                    if (p2<l2) {
                        merged2[p3++] = word2.charAt(p2++);
                    }
                }
                return new String(merged2);
            default:
                return "";
        }
        

        
    }
    public static void main(String[] args) {
        System.out.println(new L1768().mergeAlternately("abc", "pqr", 1));
        System.out.println(new L1768().mergeAlternately("ab", "pqrs", 2));
        System.out.println(new L1768().mergeAlternately("abcd", "pq", 0));
    }
}
