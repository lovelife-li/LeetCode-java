package com.leetcode.structure;

/**
 * @author ldb
 * @date 2020/05/06
 * @description 链表
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length <= 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        ListNode tail = head;
        for (int i = 1; i < arr.length; i++) {
            current = new ListNode(arr[i]);
            tail.next = current;
            tail = current;

        }
        return head;
    }

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        print(createList(arr));
    }
}
