package leetcode.editor.cn;

//Java：旋转数组

import java.util.Arrays;

public class P189RotateArray {

    public static void main(String[] args) {
        P189Solution solution = new P189Solution();
        // TO TEST
        int[] nums = new int[] {1, 2, 3, 4, 5};
        solution.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P189Solution {
    public void rotate(int[] nums, int k) {
        while (k > 0) {
            int previous = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                int tmp = nums[i];
                nums[i] = previous;
                previous = tmp;

            }
            k--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

