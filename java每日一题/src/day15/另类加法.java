package day15;

import java.math.BigInteger;

public class 另类加法 {
    public static void main(String[] args) {

    }

    public int addAB(int A, int B) {
        // write code here
        BigInteger bigInteger = BigInteger.valueOf(A);
        BigInteger bigInteger1 = BigInteger.valueOf(B);
        BigInteger add = bigInteger.add(bigInteger1);
        return add.intValue();
    }
}


