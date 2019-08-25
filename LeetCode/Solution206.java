/**
 * @author vert  @date 2019/8/25 14:15
 */
/*
#### [206. 反转链表](https://leetcode-cn.com/problems/reverse-linked-list/)
反转一个单链表。
示例:
输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL
 */
public class Solution206 {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 迭代方法
     *      * 1 -> 2 -> 3 -> 4 -> null
     *      * null <- 1 <- 2 <- 3 <- 4
     * @param head
     * @return
     */
    /*
    设置三个节点pre、cur、next
    （1）每次查看cur节点是否为NULL，如果是，则结束循环，获得结果
    （2）如果cur节点不是为NULL，则先设置临时变量next为cur的下一个节点
    （3）让cur的下一个节点变成指向pre，而后pre移动cur，cur移动到next
    （4）重复（1）（2）（3）
     */
    public ListNode reverseList(ListNode head) {
        ListNode current = head,next,pre = null;//三个指针指向三个节点
        while(current != null){
            next = current.next;//next指针指向后继节点
            current.next = pre;//后继指针逆向
            pre = current;//pre指针指向当前节点，当前节点变为pre
            current = next;//下一结点成为当前结点，下一节点变为current
        }
        return pre;//pre指向最后一个节点
    }

}
