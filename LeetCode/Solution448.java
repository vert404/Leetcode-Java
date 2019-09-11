import java.util.ArrayList;
import java.util.List;

/**
 * @author vert  @date 2019/9/11 21:50
 */
/*
448. 找到所有数组中消失的数字(https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/)
给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
找到所有在 [1, n] 范围之间没有出现在数组中的数字。
您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

示例:
输入:
[4,3,2,7,8,2,3,1]
输出:
[5,6]
 */
public class Solution448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        Solution448 s = new Solution448();
        System.out.println(s.findDisappearedNumbers(nums));
    }

    /*数组的所有正数作为数组的下标，将该下标对应的数变为负数，来标记数字的出现于否，通过一遍遍历即可标记出全部已经出现的数
      原始数组：[4,3,2,7,8,2,3,1]
      [4,3,2,-7,8,2,3,1] 第一个数据 4 出现，将数组的第四个也就是下标 3 的数据修改为负数
      [4,3,-2,-7,8,2,3,1] ......
      最后为[-4,-3,-2,-7,8,2,-3,-1]，8和2为正数，其下标[5,6],即为消失的数
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            nums[Math.abs(nums[i])-1] = -Math.abs(nums[Math.abs(nums[i])-1]);
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }
}
