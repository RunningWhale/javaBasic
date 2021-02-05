package web1考试;

import java.util.*;

public class 数组中值出现了一次的数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < num; i++) {
            int i1 = sc.nextInt();
            hashMap.put(i1,hashMap.getOrDefault(i1,0)+1);
        }
        LinkedList<Integer> linkedList= new LinkedList();
        Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            if (next.getValue()%2==1){
                linkedList.add(next.getKey());
            }
        }
        Integer remove = linkedList.remove();
        Integer remove1 = linkedList.remove();
        if (remove<remove1){
            System.out.print(remove+" "+remove1);
        }else {
            System.out.print(remove1+" "+remove);
        }


    }
}
