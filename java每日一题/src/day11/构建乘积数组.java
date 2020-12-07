package day11;

public class 构建乘积数组 {

}
 class Solution {
    public int[] multiply(int[] A) {
        int[]B=new int[A.length];
        for (int i=0;i<B.length;i++){
            int num=1;
            for (int j=0;j<A.length;j++){
                if (i==j){
                    continue;
                }else {
                    num*=A[j];
                }
            }
            B[i]=num;
            num=1;
        }
        return B;
    }
}