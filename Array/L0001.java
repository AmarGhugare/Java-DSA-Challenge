package Array;

/**
 * Problem no :- 0001
 * Platform :- Leetcode
 * Question :- Two Sum
 * Category :- Array
 * Tags :- Array, Hash Table
 * 
 * Author :- Amar
 * Date :- 16/01/2024
 */

public class L0001 {
    /**
     * Finds and returns the indices of two numbers in the array that add up to the target.
     * 
     * @param nums an array of integers
     * @param target the target sum
     * @return an array containing the indices of the two numbers that add up to the target
     * @throws IllegalArgumentException if nums is null or empty
     * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
     */
    public int[] twoSum(int[] nums, int target) {
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j+i < nums.length; j++) {
                if (nums[i+j] + nums[j] == target){
                    return new int[]{i+j, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] ans = new L0001().twoSum(new int[]{3,7,11,2}, 9);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}
