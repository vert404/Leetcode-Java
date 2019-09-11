import java.util.HashSet;

/**
 * @author vert  @date 2019/9/11 17:16
 */
/*
414. 第三大的数(https://leetcode-cn.com/problems/third-maximum-number/)
给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。

示例 1:
输入: [3, 2, 1]
输出: 1
解释: 第三大的数是 1.

示例 2:
输入: [1, 2]
输出: 2
解释: 第三大的数不存在, 所以返回最大的数 2 .

示例 3:
输入: [2, 2, 3, 1]
输出: 1
解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
存在两个值为2的数，它们都排第二。
 */
public class Solution414 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        Solution414 s = new Solution414();
        System.out.println(s.thirdMax(nums));
    }
    public int thirdMax(int[] nums) {
        //以下这三个数比给定的nums[]任意元素值小
        long first = Long.MIN_VALUE,second = Long.MIN_VALUE,third = Long.MIN_VALUE;
        for (int num : nums){
            if (num > first){   //依次更新数据
                third = second;
                second = first;
                first = num;
            }
            else if (num > second && num < first){
                third = second;
                second = num;
            }
            else if (num > third && num < second){
                third = num;
            }
        }
        //如果数组长度为1或2；如果当数组长度大于等于3，但没有第三大的数；这两种情况 third 值均为Long.MIN_VALUE
        //如果 third 值不为Long.MIN_VALUE，则表示存在第三大的值
        return (int) (third == Long.MIN_VALUE ? first : third);
    }
}
