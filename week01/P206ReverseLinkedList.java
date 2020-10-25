package leetcode.editor.cn;

//Java：反转链表

public class P206ReverseLinkedList {

    public static void main(String[] args) {
        P206Solution solution = new P206Solution();
        // TO TEST
//        solution.reverseList();
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class P206Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = head, cur = null;

        while (pre != null) {
            ListNode t = pre.next;
            pre.next = cur;
            cur = pre;
            pre = t;
        }
        return cur;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

