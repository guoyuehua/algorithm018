package leetcode.editor.cn;

//Java：删除排序数组中的重复项

public class P26RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        P26Solution solution = new P26Solution();
        // TO TEST
        System.out.println(solution.removeDuplicates(new int[] {1, 1, 2}));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P26Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

