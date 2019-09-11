import java.util.Arrays;

/**
 * @author vert  @date 2019/9/11 16:44
 */
/*
283. 移动零(https://leetcode-cn.com/problems/move-zeroes/)
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]

说明:
必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数。
 */
public class Solution283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        Solution283 s = new Solution283();
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void moveZeroes(int[] nums) {
        int j = 0,k = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == 0)
                j++;
            else {
                nums[k] = nums[i];
                k++;
            }
        }
        for (;j>0;j--){     //k 和 j 分别代表：不是0的元素个数，是0的元素个数。
            nums[k+j-1] = 0;
        }
    }
}
