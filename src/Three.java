import java.util.HashMap;

// 无重复字符的最长子串（滑动窗口）
public class Three {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int result = 0;
        for(int end=0, start=0; end<s.length(); end++) {
            if(map.containsKey(s.charAt(end))) {
                // 此处的处理可以避免abba当扫描到第二个a时，start值会被前一个map（a）的value影响
                start = Math.max(start, map.get(s.charAt(end)));
            }
            result = Math.max(result, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return result;
    }
}
