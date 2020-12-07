package day12;

import java.util.Arrays;
import java.util.LinkedList;

public class 格雷码 {
    public static void main(String[] args) {
        String[] gray = getGray(3);
        System.out.println(Arrays.toString(gray));
    }

    public static String[] getGray(int n) {
        if (n == 1) {
            String[] arr = {"0", "1"};
            return arr;
        }
        String[] gray = getGray(n - 1);
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < gray.length; i++) {
            linkedList.add("0" + gray[i]);
        }
        for (int i = gray.length - 1; i >= 0; i--) {
            linkedList.add("1" + gray[i]);
        }
        String[] arr = new String[linkedList.size()];
        for (int i=0;i<arr.length;i++){
            arr[i]=linkedList.remove();
        }
        return arr;

    }
}
