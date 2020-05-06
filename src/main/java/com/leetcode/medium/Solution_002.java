package com.leetcode.medium;


import com.leetcode.structure.ListNode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ldb
 * @date 2020-03-27 9:46
 * @description <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * Example:
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Solution_002 {

    public static ListNode addTwoNumbers1(ListNode list1, ListNode list2) {
        int bit = 0;
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {

        }
        while (list1 != null || list2 != null) {

        }
        return null;

    }

    public static int addTwoNumbers2(ListNode list1, ListNode list2) {

        return 0;

    }

    public static void main(String[] args) {


    }
}
