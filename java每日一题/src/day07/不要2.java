package day07;

import java.util.Scanner;

public class 不要2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i % 4 == 2 || i % 4 == 3) {
                    if (j % 4 == 2 || j % 4 == 3) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                } else {
                    if (j % 4 == 2 || j % 4 == 3) {
                        arr[i][j] = 0;
                    } else {
                        arr[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i][j]==1){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
