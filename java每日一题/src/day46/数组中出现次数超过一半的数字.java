package day46;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 数组中出现次数超过一半的数字 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arr={1,2,3,2,2,2,5,4,2};
        int i = solution.MoreThanHalfNum_Solution(arr);
        System.out.println(i);
    }
    public static class Solution {
        public int MoreThanHalfNum_Solution(int [] array) {
            HashMap<Integer,Integer> hashMap=new HashMap<>();
            for (int i=0;i<array.length;i++){
                hashMap.put(array[i],hashMap.getOrDefault(array[i],0)+1);
            }
            Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
            int i1 = array.length / 2;
            int num=-1;
            for (Map.Entry<Integer, Integer> i:entries){
                if (i.getValue()>i1){
                    num=i.getKey();
                }
            }
            return num;
        }
    }
}
