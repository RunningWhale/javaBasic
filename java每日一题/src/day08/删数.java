package day08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 删数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            num=num>1000?999:num;
            Queue<Integer> queue = new LinkedList<>();

            for (int i = 0; i < num; i++) {
                queue.offer(i);
            }
            int count = 0;
            int poll=-1;
            while (!queue.isEmpty()) {
                if (count == 2) {
                    poll=queue.poll();
                    count=0;
                    continue;
                }
                count++;
                poll = queue.poll();
                queue.offer(poll);
            }
            System.out.println(poll);
        }
    }
}
