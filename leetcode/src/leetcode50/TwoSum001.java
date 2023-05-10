package leetcode50;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 two sum
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @ClassName TwoSum001
 * @Description TODO
 * @Author: huangxj
 * @Create: 2019-10-22 20:38
 * @Version V1.0
 **/
public class TwoSum001 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        for (int a : twoSum(nums, 9)) {
            System.out.println(a);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{(int) map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
