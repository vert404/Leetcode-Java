import java.util.Arrays;

/**
 * @author vert  @date 2019/8/22 20:02
 */
/*
905. 按奇偶排序数组(https://leetcode-cn.com/problems/sort-array-by-parity/)
给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
你可以返回满足此条件的任何数组作为答案。
示例：
输入：[3,1,2,4]
输出：[2,4,3,1]
输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。

提示：
1 <= A.length <= 5000
0 <= A[i] <= 5000
 */
public class Solution905 {
    public static void main(String[] args) {
        int[] a = {6,3,1,2,4};
        Solution905 s = new Solution905();
        System.out.println(Arrays.toString(s.sortArrayByParity(a)));
    }
    public int[] sortArrayByParity(int[] A) {
        if(A == null || A.length == 1)
            return A;
        int left = 0;
        int right = A.length-1;
        int tmp;
        while(left < right){//正整数&1，值为1，这个数为奇数；值为0，这个数为偶数
            if ((A[left] & 1) == 1 && (A[right] & 1) == 0){//当左边为奇数，右边为偶数时交换两个数
                tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }else if((A[left] & 1) == 0) {//左边为偶数，不管，向右移
                left++;
            }
            else if((A[right] & 1) == 1) {//右边为奇数，不管，向左移
                right--;
            }
        }
        return A;
    }
}
