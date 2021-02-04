package day42;

import java.util.Scanner;

public class 计算日期到天数转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            int num = 0;
            switch (month) {
                case 1:
                    break;
                case 2:
                    num += 31;
                    break;
                case 3:
                    num += 59;
                    break;
                case 4:
                    num += 90;
                    break;
                case 5:
                    num += 120;
                    break;
                case 6:
                    num += 151;
                    break;
                case 7:
                    num += 181;
                    break;
                case 8:
                    num += 212;
                    break;
                case 9:
                    num += 243;
                    break;
                case 10:
                    num += 273;
                    break;
                case 11:
                    num += 304;
                    break;
                case 12:
                    num += 334;
            }
            num += day;
            if (month > 2) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    num += 1;
                }
            }
            System.out.println(num);
        }
    }
}
