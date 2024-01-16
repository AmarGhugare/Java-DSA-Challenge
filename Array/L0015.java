package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem no :- 0015
 * Platform :- Leetcode
 * Question :- 3Sum
 * Category :- Array
 * Tags :- Array, Two Pointers, Sorting
 * 
 * Author :- Amar
 * Date :- 16/01/2024
 */

public class L0015 {
    /**
     * Finds all unique triplets in the array that add up to zero.
     * 
     * @param nums an array of integers
     * @return a list of lists containing unique triplets that sum to zero
     * @throws IllegalArgumentException if nums is null or has less than three elements
     * @see <a href="https://leetcode.com/problems/3sum/">3Sum</a>
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> ans = new L0015().threeSum(new int[]{-1,0,1,2,-1,-4});
        for (List<Integer> list : ans) {
            for (int num : list) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
