package leetcode.editor.cn;

//Java：爬楼梯

import java.util.HashMap;
import java.util.Map;

public class P70ClimbingStairs {

    public static void main(String[] args) {
        P70Solution solution = new P70Solution();
        // TO TEST
        System.out.println(solution.climbStairs(45));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P70Solution {

    Map<Integer, Integer> cache = new HashMap();

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        Integer res = cache.get(n);
        if (res != null) {
            return res;
        }
        res = climbStairs(n - 1) + climbStairs(n - 2);
        cache.put(n, res);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

