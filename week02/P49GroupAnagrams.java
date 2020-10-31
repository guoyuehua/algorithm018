package leetcode.editor.cn;

//Java：字母异位词分组

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P49GroupAnagrams {

    public static void main(String[] args) {
        P49Solution solution = new P49Solution();
        // TO TEST
    }
}

//leetcode submit region begin(Prohibit modification and deletion)
class P49Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<String, List>();
        for (String str: strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}
//leetcode submit region end(Prohibit modification and deletion)

