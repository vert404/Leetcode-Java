/**
 * @author vert  @date 2019/8/20 21:14
 */

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1. 两数之和(https://leetcode-cn.com/problems/two-sum/)
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * ​	给定 nums = [2, 7, 11, 15], target = 9
 *
 * ​	因为 nums[0] + nums[1] = 2 + 7 = 9
 * ​	所以返回 [0, 1]
 */
public class Solution001 {
    public static void main(String[] args) {
        int[] n = {1,2,7,11,15};
        Solution001 s = new Solution001();
        System.out.println(Arrays.toString(s.twoSum(n,9)));
    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            //建立HashMap映射，将找过的数存储起来，以便后面的数对比查找
            map.put(nums[i],i);
        }
        return null;
    }
}
