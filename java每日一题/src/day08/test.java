package day08;

import java.io.IOException;
import java.util.LinkedList;

public  class test {

    public static void main(String[] args) throws IOException {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.remove());
    }
}
