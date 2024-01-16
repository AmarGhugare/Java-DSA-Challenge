package Array;

/**
 * Problem no :- 0004
 * Platform :- Leetcode
 * Question :- Container With Most Water
 * Category :- Array
 * Tags :- Array, Two Pointers, Greedy
 * 
 * Author :- Amar
 * Date :- 15/01/2024
 */

public class L0011 {
    /**
     * Finds the maximum area that can be formed by vertical lines and the x-axis.
     * 
     * @param height an array representing the height of vertical lines
     * @return the maximum area formed by the vertical lines and the x-axis
     * @throws IllegalArgumentException if height is null or empty
     * @see <a href="https://leetcode.com/problems/container-with-most-water/">Container With Most Water</a>
     */
    public int maxArea(int[] height) {
        int maxWater = 0, left = 0, right = height.length-1;
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, minHeight*(right-left));
            while (height[left]<=minHeight && left < right) {
                left++;
            }
            while (height[right]<=minHeight && left < right) {
                right--;
            }
        }
        System.gc();
        return maxWater;
    }
    public static void main(String[] args) {
        System.out.println(new L0011().maxArea(new int[]{}));
    }
}
