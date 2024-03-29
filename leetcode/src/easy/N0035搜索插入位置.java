package easy;

/**
 * //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * //
 * // 你可以假设数组中无重复元素。
 * //
 * // 示例 1:
 * //
 * // 输入: [1,3,5,6], 5
 * //输出: 2
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: [1,3,5,6], 2
 * //输出: 1
 * //
 * //
 * // 示例 3:
 * //
 * // 输入: [1,3,5,6], 7
 * //输出: 4
 * //
 * //
 * // 示例 4:
 * //
 * // 输入: [1,3,5,6], 0
 * //输出: 0
 * //
 * // Related Topics 数组 二分查找
 */


public class N0035搜索插入位置 {

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int d = start + ((end - start) / 2);
            if (target == nums[d]) {
                return d;
            }
            if (target < nums[d]) {
                end = d - 1;
            } else {
                start =d + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 3};
        System.out.println(searchInsert(a, 4));

    }
}
