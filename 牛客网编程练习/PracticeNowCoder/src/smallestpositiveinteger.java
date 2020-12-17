import java.util.HashSet;

//给定一个无序数组arr，找到数组中未出现的最小正整数
//例如arr = [-1, 2, 3, 4]。返回1
//arr = [1, 2, 3, 4]。返回5
//[要求]
//时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)
public class smallestpositiveinteger {
    public static void main(String[] args) {

    }
    public int minNumberdisappered (int[] arr) {
        // write code here
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i:arr){
            if (i>0){

                hashSet.add(i);
            }
        }
        Object[] objects = hashSet.toArray();
        int object =(int) objects[0];
        if (object>0){
            return object-1;
        }else {
            return object;
        }
    }
}
