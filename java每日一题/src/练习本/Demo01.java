package 练习本;

import java.math.BigInteger;

public class Demo01 {

    public static void main(String[] args) {
        BigInteger bigInteger=new BigInteger("3165757026");
        String s=bigInteger.toString(2);
        System.out.println(s);
    }
}
