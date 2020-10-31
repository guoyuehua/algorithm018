package leetcode.editor.cn;

//Java：N叉树的前序遍历

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class P589NAryTreePreorderTraversal {

    public static void main(String[] args) {
        P589Solution solution = new P589Solution();
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class P589Solution {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        Stack<Node> stack = new Stack();

        if (root != null) {
            stack.push(root);
        }

        ArrayList<Integer> res = new ArrayList<Integer>();

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            res.add(node.val);

            Collections.reverse(node.children);

            for (Node item : node.children) {
                stack.push(item);
            }
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

