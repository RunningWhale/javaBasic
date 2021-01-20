public class 移除元素 {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int length = nums.length;
            int n = length;
            int i = 0;
            while (i < n) {
                if (nums[i] == val) {
                    nums[i] = nums[n - 1];//表示最后一位替换当前这位
                    n--;
                } else {//直到不想等才比较下一位
                    i++;
                }
            }
            return n;
        }
    }
}
