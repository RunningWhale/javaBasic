package day19;

//子串判断
public class 子串判断 {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] arrs = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (s.contains(p[i])) {
                arrs[i] = true;
            } else {
                arrs[i] = false;
            }
        }
        return arrs;
    }
}