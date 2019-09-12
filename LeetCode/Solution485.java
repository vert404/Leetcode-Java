/**
 * @author vert  @date 2019/9/12 9:55
 */
/*
485. 最大连续1的个数(https://leetcode-cn.com/problems/max-consecutive-ones/)
给定一个二进制数组， 计算其中最大连续1的个数。

示例 1:
输入: [1,1,0,1,1,1]
输出: 3
解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.

注意：
输入的数组只包含 0 和1。
输入数组的长度是正整数，且不超过 10,000。
 */
public class Solution485 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        Solution485 s = new Solution485();
        System.out.println(s.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i : nums) {
            if (i == 1) {
                count++;
            } else {
                max = max > count ? max : count;
                count = 0;
            }
        }
        max = max > count ? max : count;
        return max;
    }
}
