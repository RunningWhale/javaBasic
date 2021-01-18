import java.util.LinkedList;

public class 无重复字符的最长字串 {
    public static void main(String[] args) {
        int pwwkew = lengthOfLongestSubstring("aab");
        System.out.println(pwwkew);
    }

    public static int lengthOfLongestSubstring(String s) {
/*        if (s.length() == 0) {
            return 0;
        }*/
        /*int len = 0;
        String[] split = s.split("");
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 += split[i];
            for (int j = i + 1; j < split.length; j++) {
                if (!s1.contains(split[j])) {
                    s1 += split[j];
                } else {
                    break;
                }
            }
            len = s1.length() > len ? s1.length() : len;
            s1="";
        }
        return len;*/
        if (s.length()==0){
            return 0;
        }
        int i = 0, j = 0;
        int len = 0;
        LinkedList<String> linkedList = new LinkedList<>();
        String[] split = s.split("");
//        String s1="";
        for (; i < split.length; i++) {
            if (!linkedList.contains(split[i])) {
                linkedList.add(split[i]);
            } else {
                while (linkedList.contains(split[i])) {
                    linkedList.remove();
                    j++;
                }
                linkedList.add(split[i]);
            }
            len= linkedList.size()>len?linkedList.size():len;
        }
        return len;
    }

}
