public class 搜索插入位置 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int n = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < target) {
                    n = i;
                } else if (nums[i] == target) {
                    return i;
                }
            }
            return n + 1;//不是返回n，是n+1，因为要插入位置在后一位
        }
    }

}
