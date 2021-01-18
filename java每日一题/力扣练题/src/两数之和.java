public class 两数之和 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            int[] ints = new int[2];
            for (int i = 0; i < nums.length; i++) {
                int i1 = target - nums[i];
                for (int i2 = 0; i2 < nums.length; i2++) {
                    if (i2 == i) {
                        continue;
                    }
                    if (nums[i2] == i1) {
                        ints[0] = i;
                        ints[1] = i2;
                    }
                }
            }
            return ints;
        }
    }
}
