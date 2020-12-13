package day02;
//逆序对问题

public class AntiOrder {
    public static void main(String[] args) {
        int[] arr = {7,5,6,4};
        int count = count(arr, 4);
        System.out.println(count);

    }

    public static int count(int[] A, int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[i]) {
                    count++;
                }
            }
        }
        return count;
    }
}