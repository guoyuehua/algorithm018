package leetcode.editor.cn;

//Java：两数之和

import java.util.HashMap;

public class P1TwoSum {

    public static void main(String[] args) {
        P1Solution solution = new P1Solution();
        // TO TEST
        System.out.println(solution.twoSum(new int[] {2, 7, 11, 15}, 9));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P1Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();


        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if (cache.get(another) == null) {
                cache.put(nums[i], i);
            } else {
                return new int[] {i, cache.get(another)};
            }
        }
        return new int[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

