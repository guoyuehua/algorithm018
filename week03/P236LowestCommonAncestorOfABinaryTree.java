package leetcode.editor.cn;

//Java：二叉树的最近公共祖先

public class P236LowestCommonAncestorOfABinaryTree {

    public static void main(String[] args) {
        P236Solution solution = new P236Solution();
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class P236Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null && right == null) {
            return null;
        }
        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

