package leetcode.editor.cn;

//Java：二叉树的中序遍历

import java.util.ArrayList;
import java.util.List;

public class P94BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        P94Solution solution = new P94Solution();
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
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class P94Solution {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List res) {
        if (root == null) {
            return;
        }

        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);


    }
}
//leetcode submit region end(Prohibit modification and deletion)

