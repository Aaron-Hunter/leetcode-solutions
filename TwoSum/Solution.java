import java.util.HashMap;
import java.util.Map;

/**
 * Solution for the 'TwoSum' problem on leetcode.com
 *
 * @author Aaron Hooper
 * @version 1.0
 * @since 2021.01.08
 */

public class Solution {

    /**
     * Uses a hashmap to store previously checked numbers.
     * A solution pair is found when the difference between target and current num exists in the hashmap
     *
     * @param nums array of numbers containing exactly one pair which add to target
     * @param target int which two nums must add to
     * @return nums solution pair
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(prevNums.containsKey(diff)) {
                return new int[]{prevNums.get(diff), i};
            }
            prevNums.put(nums[i], i);
        }
        return new int[0]; //Will never execute if nums contains solution pair
    }
}
