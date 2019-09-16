import java.util.List;

/**
 * @author vert  @date 2019/9/16 14:57
 */
/*
21. 合并两个有序链表(https://leetcode-cn.com/problems/merge-two-sorted-lists/)
将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

示例：
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
 */
public class Solution021 {
    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                prev.next = l1;
                prev = prev.next;
                l1 = l1.next;
            }else{
                prev.next = l2;
                prev = prev.next;
                l2 = l2.next;
            }
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}
