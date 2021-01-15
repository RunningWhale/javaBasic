package day28;

import java.util.Scanner;

public class 密码验证合格程序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int daxiezimu = 0;
            int xiaoxiezimu = 0;
            int shuzi = 0;
            int qitafuhao = 0;
            //检查长度大于8
            if (s.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            //判断字符类型
            String[] split = s.split("");
            for (int i = 0; i < split.length; i++) {
                char c = split[i].toCharArray()[0];
                if (Character.isDigit(c)) {
                    shuzi++;
                } else if (Character.isUpperCase(c)) {
                    daxiezimu++;
                } else if (Character.isLowerCase(c)) {
                    xiaoxiezimu++;
                } else {
                    qitafuhao++;
                }
            }
            int sanzhong = 0;
            if (shuzi == 0) {
                sanzhong++;
            } else if (daxiezimu == 0) {
                sanzhong++;
            } else if (xiaoxiezimu == 0) {
                sanzhong++;
            } else if (qitafuhao == 0) {
                sanzhong++;
            }
            if (sanzhong >= 2) {
                System.out.println("NG");
                continue;
            }
            if (!xiangTong(s)) {
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }

    public static boolean xiangTong(String s) {
        for (int i = 0; i < s.length() - 3; i++) {
            String substring = s.substring(i, i + 3);
            String substring1 = s.substring(i + 1);
            if (substring1.contains(substring)) {
                return false;
            }
        }
        return true;
    }
}
