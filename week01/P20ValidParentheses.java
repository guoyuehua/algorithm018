package leetcode.editor.cn;

//Java：有效的括号

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P20ValidParentheses {

    public static void main(String[] args) {
        P20Solution solution = new P20Solution();
        // TO TEST
        System.out.println(solution.isValid("()"));
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P20Solution {

    public boolean isValid(String s) {
        int n = s.length();

        if (n % 2 == 1) {
            return false;
        }

        char[] chars = s.toCharArray();

        Map<Character, Character> pairs = new HashMap<Character, Character>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');


        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < chars.length; i++) {
            if (!pairs.containsKey(chars[i])) {
                stack.push(chars[i]);
            } else {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(chars[i]))){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

