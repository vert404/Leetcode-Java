import java.util.Arrays;

/**
 * @author vert  @date 2019/9/4 16:40
 */
/*
66. 加一(https://leetcode-cn.com/problems/plus-one/)
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:
输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。

示例 2:
输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。
 */
public class Solution066 {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        Solution066 s = new Solution066();
        System.out.println(Arrays.toString(s.plusOne(digits)));
    }
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i >= 0;i--){
            if (digits[i] != 9){    //判断的第i位不是9，加一返回即可,再往高位循环
                digits[i] ++;
                return digits;  //如果数组里面不是全部都是9，则会返回结果
            }
            //判断的第i位是9,将这一位变为0,再往高位循环
            digits[i] = 0;
        }
        //进行到这一步，表示数组里面都是9，要将数组长度加一,最高位赋值为1
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
