package com.leetcode.medium;


import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ldb
 * @date 2020-03-27 9:46
 * @description <p>
 *     给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * Example:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class Solution_003 {


    /**
     * 两层循环遍历所有元素
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int res = nums[i] + nums[j];
                if (res == target) {
                    return new int[]{
                            i, j
                    };
                }
            }
        }
        return null;

    }

    /**
     * 利用 HashMap 作为存储，键为目标值减去当前元素值，索引为值，比如 `i = 0` 时，此时首先要判断 `nums[0] = 2` 是否在 map 中，如果不存在，
     * 那么插入键值对 `key = 9 - 2 = 7, value = 0`，之后当 `i = 1` 时，此时判断 `nums[1] = 7` 已存在于 map 中，那么取出该 `value = 0`
     * 作为第一个返回值，当前 `i` 作为第二个返回值，具体代码如下所示。
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target - nums[i],i);

        }
        return null;

    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 15, 2, 7};
        int[] res = twoSum2(nums, 9);
        System.out.println(Arrays.toString(res));


    }
}
