package day21;

import java.util.Scanner;

public class 统计每个月兔子总数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){

            int n = sc.nextInt();
            int month = month(n);
            System.out.println(month);
        }


    }
    public static int month(int count){
        if (count==1||count==2){
            return 1;
        }
        return month(count-1)+month(count-2);
    }
}
