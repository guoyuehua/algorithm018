package leetcode.editor.cn;

//Java：盛最多水的容器

public class P11ContainerWithMostWater {

    public static void main(String[] args) {
        P11Solution solution = new P11Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(height));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P11Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int max = 0;
        while (i < j) {
            int current = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(current, max);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

