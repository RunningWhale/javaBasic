package day32;

public class Count2 {
    public static void main(String[] args) {
        int i = countNumberOf2s(30);
        System.out.println(i);
    }

    public static int countNumberOf2s(int n) {
        // write code here
        int count = 0;
        String s = String.valueOf(n);
        while (n != 0) {
            int i = n % 10;
            int i1 = n / 10;
            if (i == 0 || i == 1) {
                count += i1;
            } else if (i == 2) {
                count += i1 * 2 + 1;
            } else {
                count += (i1 + 1) * 2;
            }

        }

        return count;
    }
}