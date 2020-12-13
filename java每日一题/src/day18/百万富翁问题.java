package day18;

import java.math.BigInteger;

public class 百万富翁问题 {
    public static void main(String[] args) {
        BigInteger moneyStrangerAll = new BigInteger("1");
        BigInteger moneyStrangerToday = new BigInteger("1");
        for (int i = 2; i <= 30; i++) {
            BigInteger num = new BigInteger("2");
            moneyStrangerToday = moneyStrangerToday.multiply(num);
            moneyStrangerAll = moneyStrangerAll.add(moneyStrangerToday);
        }
        System.out.println("300"+" "+moneyStrangerAll);
    }
}
