package Array;

/**
 * Problem no :- 0004
 * Platform :- Leetcode
 * Question :- Median of Two Sorted Arrays
 * Category :- Array
 * Tags :- Array, Binary Search, Divide and Conquer
 * 
 * Author :- Amar
 * Date :- 15/01/2024
 */

public class L0004 {

    /**
     * Finds the median of two sorted arrays.
     * @param nums1 the first sorted array
     * @param nums2 the second sorted array
     * @return the median of the combined sorted arrays
     * @throws IllegalArgumentException if nums1 or nums2 is null
     * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i, j, k;
        i = j = k = 0;
        double median;
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        int newLength = num1Length+ num2Length;

        int[] newArr = new int[newLength];

        while(i < num1Length && j < num2Length){
            if(nums1[i] < nums2[j]){
                newArr[k++] = nums1[i++];
            }else{
                newArr[k++] = nums2[j++];
            }
        }
        while(i < num1Length){
            newArr[k++] = nums1[i++];
        }
        while(j < num2Length){
            newArr[k++] = nums2[j++];
        }

        int mid = newLength/2;
        if( ( newLength & 1 ) == 0) { // Even
            median = (newArr[mid-1]+newArr[mid])/2.0;
        } else{ // odd
            median = newArr[mid];
        }
        return median;
    }
    public static void main(String[] args) {
       System.out.println(L0004.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4})); 
    }
}
