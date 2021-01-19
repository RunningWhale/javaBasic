import java.util.Scanner;

public class 斐波那契数列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] ints = new int[i];
        ints[0] = 0;
        ints[1] = 1;
        for (int i1 = 2; i1 < ints.length; i1++) {
            ints[i1] = ints[i1 - 1] + ints[i1 - 2];
        }
        System.out.println(ints[ints.length-1]);
    }
}
