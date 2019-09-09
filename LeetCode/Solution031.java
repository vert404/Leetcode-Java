import java.util.Arrays;

/**
 * @author vert  @date 2019/9/9 15:08
 */
/*
31. 下一个排列(https://leetcode-cn.com/problems/next-permutation/)
实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
必须原地修改，只允许使用额外常数空间。

以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1

1,5,8,4,7,6,5,3,1 → 1,5,8,5,1,3,4,6,7
 */
public class Solution031 {
    public static void main(String[] args) {
        int[] nums = {1,5,8,4,7,6,5,3,1};
        Solution031 s = new Solution031();
        s.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    //从右边找到第一对两个连续的数字 a[i+1] 和 a[i]，它们满足 a[i+1]>a[i]，找到不满足的第一对
    //需要将数字 a[i] 替换为位于其右侧区域的数字中比它稍大的数字
    //替换后 a[i] 右侧区域也是降序排列
    //需要将 a[i]右边的数字按升序排列，以获得最小的排列。
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if (i >= 0){
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);  //a[i] 右边的数字按升序排列，以获得最小的排列
    }

    private void reverse(int[] nums,int start){
        int i = start,j = nums.length - 1;
        while (i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
