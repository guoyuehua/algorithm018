package leetcode.editor.cn;

//Java：环形链表

public class P141LinkedListCycle {

    public static void main(String[] args) {
        P141Solution solution = new P141Solution();
        // TO TEST
    }

//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) { val = x; next =
     * null; } }
     */
    public static class P141Solution {
        class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
                next = null;
            }
        }

        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while (slow != fast) {
                if (fast == null || fast.next == null) {
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }

            return true;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

