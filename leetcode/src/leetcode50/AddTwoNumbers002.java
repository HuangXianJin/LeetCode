package leetcode50;

/**
 * @ClassName AddTwoNumbers002
 * @Description TODO
 * @Author: huangxj
 * @Create: 2019-10-22 20:46
 * @Version V1.0
 **/
public class AddTwoNumbers002 {

    public static void main(String[] args) {
        ListNode a2 = new ListNode(2);
        ListNode a4 = new ListNode(4);
        ListNode a3 = new ListNode(3);
        a2.next = a4;
        a4.next = a3;
        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(2);
        ListNode b3 = new ListNode(3);
        b1.next = b2;
        b2.next = b3;
        ListNode result = addTwoNumbers(a2, b1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int out = 0;
        ListNode listNode = null;
        ListNode cur = null;
        while (l1 != null || l2 != null || out == 1) {
            int val = 0 + out;
            if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }
            out = val / 10;
            if (listNode == null) {
                listNode = new ListNode(val % 10);
                cur = listNode;
            } else {
                cur.next = new ListNode(val % 10);
                cur = cur.next;
            }
        }
        return listNode;
    }
}
