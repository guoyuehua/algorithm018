package leetcode.editor.cn;

//Java：组合

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P77Combinations {

    public static void main(String[] args) {
        P77Solution solution = new P77Solution();
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P77Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (k <= 0 || n < k) {
            return res;
        }

        ArrayDeque<Integer> path = new ArrayDeque<Integer>();
        combineHelper(0, k, n,path, res);
        return res;
    }

    public void combineHelper(int index, int k, int n, Deque<Integer> path, List<List<Integer>> res) {
        if (index == k) {
            res.add(new ArrayList<Integer>(path));
        }

        for (int i = index; i <= n; i++) {
            path.addLast(i);
            combineHelper(index + 1, k, n , path, res);
            path.removeLast();
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

