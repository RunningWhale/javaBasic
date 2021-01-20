import java.util.Arrays;
import java.util.LinkedList;

public class 最大子序和 {
    public static void main(String[] args) {
        int[] arrs = {-2};
        Solution solution = new Solution();
        int i1 = solution.maxSubArray(arrs);
        System.out.println(i1);
    }

    static class Solution {
        public int maxSubArray(int[] nums) {
            //暴力法
            LinkedList<Integer> linkedList = new LinkedList<>();
//            LinkedList<LinkedList<Integer>> linkedLists=new LinkedList<>();
            int max = nums[0];
            for (int i = 0; i < nums.length; i++) {
                int n = 0;
                for (int j = i; j < nums.length; j++) {
                    n += nums[j];
                    if (n >= max) {
                        max = n;
                        linkedList.clear();
                        for (int k = i; k <= j; k++) {
                            linkedList.add(nums[k]);
                        }
                    }
                }
            }
            int[] result = new int[linkedList.size()];
            for (int i = 0; i < result.length; i++) {
                Integer remove = linkedList.remove();
                result[i] = remove;
            }
            System.out.println(Arrays.toString(result));
            return max;
        }
    }
}
