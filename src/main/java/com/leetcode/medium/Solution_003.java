package com.leetcode.medium;


import static java.lang.Math.max;

/**
 * @author ldb
 * @date 2020-03-27 9:46
 * @description <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串的长度。
 * <p>
 * Example:
 * 输入: "abcabcbb"   "abcaaabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class Solution_003 {


    /**
     * 两层循环遍历所有元素
     */
    public static int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int l = 0, r = -1; //滑动窗口为s[l...r]
        int res = 0;
        // 整个循环从 l == 0; r == -1 这个空窗口开始
        // 到l == s.length(); r == s.length()-1 这个空窗口截止
        // 在每次循环里逐渐改变窗口, 维护freq, 并记录当前窗口中是否找到了一个新的最优值
        while (l < s.length()) {
            if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
                r++;
                freq[s.charAt(r)]++;
            } else {   //r已经到头 || freq[s.charA(t+1)] == 1
                freq[s.charAt(l)]--;
                l++;
            }
            res = max(res, r - l + 1);
        }
        return res;

    }


    public static void main(String[] args) {


    }
}
