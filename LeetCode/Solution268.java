import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author vert  @date 2019/9/11 15:42
 */
/*
268. 缺失数字(https://leetcode-cn.com/problems/missing-number/)
给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。

示例 1:
输入: [3,0,1]
输出: 2

示例 2:
输入: [9,6,4,2,3,5,7,0,1]
输出: 8

说明:
你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */
public class Solution268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        Solution268 s = new Solution268();
        System.out.println(s.missingNumber(nums));
    }
    //哈希表
    /*public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for (int i=0;i<=nums.length;i++){ //这里的i是数组里元素的值，最大为nums.length，
            if (!set.contains(i))
                return i;
        }
        return -1;
    }*/

    //使用^异或
    /*
    举个例子：
        0 ^ 4 = 4
        4 ^ 4 = 0
    输入: [3,0,1]
    按照一下方法：res=3,循环完进行的操作：3^3^0^0^1^1^2,异或满足结合律
    必然出现 0^1^ ... ^n的n+1个数异或,将数组元素值全部带入其中异或,就能得出缺少的元素
     */
    public int missingNumber(int[] nums) {
        int res = nums.length;     //最大的数
        for (int i=0;i<nums.length;i++){
            res ^= nums[i];
            res ^= i;
        }
        return res;
    }
}
