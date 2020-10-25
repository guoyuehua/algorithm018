package leetcode.editor.cn;

//Java：三数之和

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P15ThreeSum {

    public static void main(String[] args) {
        P15Solution solution = new P15Solution();
        // TO TEST
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P15Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

        if (nums.length < 2) {
            return res;
        }

        Arrays.sort(nums);

        for (int k = 0; k < nums.length - 2; k++) {
            //排序之后，如果nums[k] > 0，且 i>k, j>k，则三数之和 > 0
            if (nums[k] > 0) {
                break;
            }
            //排除重复组合
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = nums.length - 1;

            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) {
                    }
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) {
                    }
                } else {
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[++i]) {
                    }
                    while (i < j && nums[j] == nums[--j]) {
                    }
                }
            }

        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

