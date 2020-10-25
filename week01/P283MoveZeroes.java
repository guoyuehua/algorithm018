package leetcode.editor.cn;

//Java：移动零

import java.util.Arrays;

public class P283MoveZeroes {

    public static void main(String[] args) {
        P283Solution solution = new P283Solution();
        // TO TEST
        int[] nums = {1, 0, 1, 1, 0, 3, 12};
        solution.moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }
}

/**
 * 输入: [0,1,0,3,12] 输出: [1,3,12,0,0]
 */

//leetcode submit region begin(Prohibit modification and deletion)
class P283Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            while (zeroIndex < nums.length && nums[zeroIndex] != 0) {
                zeroIndex++;
            }
            if (zeroIndex >= nums.length) {
                return;
            }
            if (i < zeroIndex && nums[i] != 0) {
                continue;
            }
            if (i > zeroIndex && nums[i] != 0) {
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
                zeroIndex++;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        if (nums == null) {
            return;
        }
        //两个指针i和j
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

