package Array;

/**
 * Problem no :- 1929
 * Platform :- Leetcode
 * Question :- Concatenation of Array
 * Category :- Array
 * Tags :- Array, Simulation
 * 
 * Author :- Amar
 * Date :- 15/01/2024
 */
public class L1929 {

    /**
     * Concatenation of Array
     * @param nums an array of integers
     * @return an array of integers that is the concatenation of two nums arrays
     * @throws IllegalArgumentException if nums is null or empty
     * @see <a href="https://leetcode.com/problems/concatenation-of-array/">Concatenation of Array</a>
     */
    public static int[] getConcatenation(int[] nums) {
        int oldLength = nums.length;

        // Used BitWise Operator to double the value
        int newLength = oldLength << 1;

        // Creating a new array to store the concatenated result
        int[] ans = new int[newLength];
        
        // Copying elements from the original array to the new array
        System.arraycopy(nums, 0, ans, 0, oldLength);

        // Copying elements from the original array again to complete concatenation
        System.arraycopy(nums, 0, ans, oldLength, oldLength);

        // Suggesting the garbage collector to run for efficient memory management
        System.gc();
        return ans;
    }
    public static void main(String[] args) {

        int[] ans = L1929.getConcatenation(new int[] {1, 2, 1});
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}