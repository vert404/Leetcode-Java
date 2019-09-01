/**
 * @author vert  @date 2019/9/1 21:55
 */
/*
53. 最大子序和(https://leetcode-cn.com/problems/maximum-subarray/)
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:
输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

进阶:
如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class Solution053 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Solution053 s = new Solution053();
        System.out.println(s.maxSubArray(nums));
    }
    //数组中元素都为负值，最大值为最大的那个负数；
    //当元素中有正数时，最大值为那个最大的正数或这些正数附近的连续子序列之和。
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int res = nums[0];
        for (int num : nums){
            if (sum > 0)
                sum += num;//sum值代表当前子序列，大于0则对于后面元素求最大值是有用的
            else    //sum < 0 ,此时序列是负值，应该舍去当前序列，在后面重新开始寻找最大值
                sum = num;
            res = Math.max(res,sum);
        }
        return res;
    }
}
