package leetcode.editor.cn;

//Java：加一

import java.util.Arrays;

public class P66PlusOne {

    public static void main(String[] args) {
        P66Solution solution = new P66Solution();
        // TO TEST
        int[] result = solution.plusOne(new int[] {1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P66Solution {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

