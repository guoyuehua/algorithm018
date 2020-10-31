package leetcode.editor.cn;

//Java：N叉树的层序遍历

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P429NAryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        P429Solution solution = new P429Solution();
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

class P429Solution {

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

    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) {
            return res;
        }

        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<Integer>();

            for (int i = 0; i < queue.size(); i++) {
                Node node = queue.poll();
                level.add(node.val);
                queue.addAll(node.children);
            }
            res.add(level);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

