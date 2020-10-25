package leetcode.editor.cn;

//Java：合并两个有序数组

import java.util.Arrays;

public class P88MergeSortedArray {

    public static void main(String[] args) {
        P88Solution solution = new P88Solution();
        // TO TEST
        int[] nums1 = {1, 3, 4, 5, 8, 0, 0, 0};
        int[] nums2 = {2, 3, 6};
        solution.merge(nums1, 5, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P88Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;

        int t = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[t--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
        }

        while (p2 >= 0) {
            nums1[t--] = nums2[p2--];
        }
//        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

