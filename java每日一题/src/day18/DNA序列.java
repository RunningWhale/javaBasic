package day18;

import java.util.Scanner;

public class DNA序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dna = sc.nextLine();
        int len = sc.nextInt();
        String s = find(dna, len);
        System.out.println(s);

    }

    public static String find(String dna, int len) {
        String s = "";
        int countInit = 0;
        for (int j = 0; j < len; j++) {
            s += dna.charAt(j);
        }
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'G' || s.charAt(j) == 'C') {
                countInit++;
            }
        }
        //下面开始判断后面有没有比这个比例大的
        for (int i = 1; i <= dna.length() - len; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = i; j < len + i; j++) {
                sb.append(dna.charAt(j));
            }
            int count = 0;
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == 'G' || sb.charAt(j) == 'C') {
                    count++;
                }
            }
            if (count > countInit) {
                //这一步一定一定一定要改变最大值的长度
                countInit=count;
                s = sb.toString();
            }
            sb.delete(0,sb.length());
        }
        return s;
    }
}
