package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem no :- 0004
 * Platform :- Leetcode
 * Question :- Kids With the Greatest Number of Candies
 * Category :- Array
 * Tags :- Array
 * 
 * Author :- Amar
 * Date :- 16/01/2024
 */

public class L1431 {
    /**
     * Determines if each child can have the greatest number of candies by adding extra candies.
     * @param candies an array representing the number of candies each child has
     * @param extraCandies the additional candies that can be given to each child
     * @return a list of booleans indicating whether each child can have the greatest number of candies
     * @throws IllegalArgumentException if candies is null or empty
     * @see <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/">Kids With the Greatest Number of Candies</a>
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxAmongAll = 0;
        for (int candie : candies) {
            maxAmongAll = maxAmongAll<candie ? candie : maxAmongAll;
        }
        for (int i : candies) {
            result.add(i+extraCandies>=maxAmongAll?true:false);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Boolean> result = new L1431().kidsWithCandies(new int[]{2,3,5,1,3},3);
        for (Boolean boolean1 : result) {
            System.out.println(boolean1+" ");
        }
    }
}
