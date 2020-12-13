package day10;

public class 机器人走方格 {
    public static void main(String[] args) {
        int i = countWays(2, 3);
        System.out.println(i);
    }
    public static int countWays(int x, int y) {
        // write code here
        if (x==1||y==1){
            return 1;
        }else {
            return countWays(x-1,y)+countWays(x,y-1);
        }
    }
}
