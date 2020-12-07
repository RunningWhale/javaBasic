package day02;

import java.util.LinkedList;
import java.util.Scanner;

public class 空汽水瓶问题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            linkedList.add(n);
        }
        //判断每个数据分别对应多少瓶子
        int count = 0;
        int remove;
        //存放一组数据换回的瓶子
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        while (!linkedList.isEmpty()) {
            remove = linkedList.remove();
            while (remove >= 3) {
                count += remove / 3;
                remove = remove % 3 + remove / 3;
            }
            if (remove == 2) {
                count++;
            }
            if (count > 0) {
                linkedList1.add(count);
            }
            count = 0;
        }
        while (!linkedList1.isEmpty()) {
            System.out.println(linkedList1.remove());
        }
    }
}
