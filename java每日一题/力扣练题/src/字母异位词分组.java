import java.util.*;

public class 字母异位词分组 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String[] strings={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = solution.groupAnagrams(strings);
        System.out.println(lists);
    }
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
            for (int i = 0; i < strs.length; i++) {
                char[] chars = strs[i].toCharArray();
                Arrays.sort(chars);
                String s1=String.valueOf(chars);
//                String s1=chars.toString();
                List<String> orDefault = hashMap.getOrDefault(s1, new ArrayList<String>());
                orDefault.add(strs[i]);
                hashMap.put(s1, orDefault);


            }
            System.out.println(hashMap.values());
            return new ArrayList<List<String>>(hashMap.values());
        }
    }
}
