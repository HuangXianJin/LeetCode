package easy;

//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
// 示例：
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
//
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class N0021合并两个有序链表 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode head = ret;
        while (true) {
            int v;
            if (l1 == null) {
                ret.next = l2;
                break;
            }
            if (l2 == null) {
                ret.next = l1;
                break;
            }
            if (l1.val <= l2.val) {
                v = l1.val;
                l1 = l1.next;
            } else {
                v = l2.val;
                l2 = l2.next;
            }
            ret.next = new ListNode(v);
            ret = ret.next;

        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a2 = new ListNode(2);
        ListNode a4 = new ListNode(3);
        ListNode a3 = new ListNode(5);
        a2.next = a4;
        a4.next = a3;
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(3);
        b1.next = b2;
        b2.next = b3;
        ListNode result = mergeTwoLists(a2, b1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
