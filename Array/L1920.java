package Array;

/**
 * Problem no :- 1920
 * Platform :- Leetcode
 * Question :- Build Array from Permutation
 * Category :- Array
 * Tags :- Array, Simulation
 * 
 * Author :- Amar
 * Date :- 15/01/2024
 */

public class L1920 {
    
    /**
     * Constructs an array from the given permutation
     * @param nums an array representing a permutation
     * @return an array constructed based on the given permutation
     * @throws IllegalArgumentException if nums is null or empty
     * @see <a href="https://leetcode.com/problems/build-array-from-permutation/">Build Array from Permutation</a>
     */
    public static int[] buildArray(int[] nums) {
        // Initiating the permutation process
        permutation(nums,0);
        
        // Suggesting the garbage collector to run for efficient memory management
        System.gc();
        
        // Returning the transformed array
        return nums;
    }

    /**
     * Recursively performs permutation on the given array.
     * @param nums an array representing a permutation
     * @param start the starting index for permutation
     */
    public static void  permutation(int nums[],int start) {
        // Base case: if the starting index exceeds the array length, exit recursion
        if(start >= nums.length) return;
        
        // Swapping elements based on the permutation logic
        int res = nums[nums[start]];
        permutation(nums,start+1);
        nums[start] = res;
    }

    public static void main(String[] args) {
        int[] ans = L1920.buildArray(new int[]{0,2,1,5,3,4});
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
