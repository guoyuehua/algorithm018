package leetcode.editor.cn;

//Java：从前序与中序遍历序列构造二叉树

public class P105ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public static void main(String[] args) {
        Solution solution = new Solution();
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
class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode buildTreeHelper(int[] preorder, int pstart, int pend, int[] inorder, int istart, int iend) {
        if (pstart == pend) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[pstart]);

        int rootIndex = 0;
        for (int i=0; i<inorder.length; i++) {
            if (inorder[i] == root.val) {
                rootIndex = i;
                break;
            }
        }
        int leftNum = rootIndex - pstart;
        root.left = buildTreeHelper(preorder, pstart+1, pstart + leftNum + 1, inorder, istart, rootIndex);
        root.right = buildTreeHelper(preorder, pstart + leftNum + 1, pend, inorder, rootIndex + 1, iend);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

