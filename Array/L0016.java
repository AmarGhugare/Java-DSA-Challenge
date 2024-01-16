package Array;

import java.util.Arrays;

/**
 * Problem no :- 0016
 * Platform :- Leetcode
 * Question :- 3Sum Closest
 * Category :- Array
 * Tags :- Array, Two Pointers, Sorting
 * 
 * Author :- Amar
 * Date :- 16/01/2024
 */

public class L0016 {
    /**
     * Finds the sum of three integers in the array closest to the target.
     * 
     * @param nums an array of integers
     * @param target the target sum
     * @return the sum of three integers in the array closest to the target
     * @throws IllegalArgumentException if nums is null or has less than three elements
     * @see <a href="https://leetcode.com/problems/3sum-closest/">3Sum Closest</a>
     */
    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int j = i+1, k = nums.length-1;
            while (j<k) {
                int total = nums[i]+nums[j]+nums[k];
                closest = Math.abs(target-total)<Math.abs(target-closest)?total:closest;
                if(total>target){
                    k--;
                } else {
                    j++;
                }
            }
        }
        return closest;
    }
    public static void main(String[] args) {
        System.out.println(new L0016().threeSumClosest(new int[]{-1,2,1,-4}, 1));
    }
}
