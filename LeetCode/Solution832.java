import java.util.Arrays;

/**
 * @author vert  @date 2019/8/21 15:28
 */

/*
 *  832. 翻转图像(https://leetcode-cn.com/problems/flipping-an-image/)
 *
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 *
 * ​	示例 1:
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 *      然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * 	示例 2:
 * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 *      然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 * 	说明:
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 */

/*
int[][] A = {
                {1,1,0},
                {1,0,1},
                {0,0,0},
                {0,0,1}};
        System.out.println(A.length);//4
        System.out.println(A[1][2]);//1
 */
public class Solution832 {
    public static void main(String[] args) {
        int[][] A = {
                {1,1,0},
                {1,0,1},
                {0,0,0}};
        Solution832 s = new Solution832();
        System.out.println(Arrays.deepToString(s.flipAndInvertImage(A)));
    }
    //解题思路：对于某行上处于对称位置上的数字（要交换的），不相同的话其实是不需要动的，
    // 翻转加互换后还是它本身；如果相同的话，可以不翻转，需要1，0互换。
    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length,n = A[0].length;//m是行的长度，n是列的长度
        for (int i=0;i<m;i++){
            for (int j=0;j<(n+1)/2;j++){//(n+1)/2 表示要交换次数
                if (A[i][j]==A[i][n-1-j]){//n-1-j 表示对称位置上的数的位置
                    A[i][j]=A[i][n-1-j]=A[i][j]^1;//连等赋值，从右往坐逐一赋值
                    //0^1为1，1^1为0，与1异或起到1,0转换的作用
                }
            }
        }
        return A;
    }
}