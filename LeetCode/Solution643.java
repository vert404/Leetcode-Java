/**
 * @author vert  @date 2019/9/14 17:22
 */
/*
643. 子数组最大平均数 I(https://leetcode-cn.com/problems/maximum-average-subarray-i/)
给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。

示例 1:
输入: [1,12,-5,-6,50,3], k = 4
输出: 12.75
解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75

注意:
1 <= k <= n <= 30,000。
所给数据范围 [-10,000，10,000]。
 */
public class Solution643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        Solution643 s = new Solution643();
        System.out.println(s.findMaxAverage(nums,k));
    }
    public double findMaxAverage(int[] nums, int k) {
        // sum用来记录最大连续和
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        // 窗口整体前进一位，temp始终记录当前窗口内值的和
        double temp = sum;
        for (int i = k, j = 0; i < nums.length; i++) {
            temp += nums[i];
            temp -= nums[j++];
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum / k;
    }
}
