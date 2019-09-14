import java.util.Arrays;

/**
 * @author vert  @date 2019/9/14 22:37
 */
/*
661. 图片平滑器(https://leetcode-cn.com/problems/image-smoother/)
包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。

示例 1:
输入:
[[1,1,1],
 [1,0,1],
 [1,1,1]]
输出:
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
解释:
对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0

注意:
给定矩阵中的整数范围为 [0, 255]。
矩阵的长和宽的范围均为 [1, 150]。
 */
public class Solution661 {
    public static void main(String[] args) {
        int[][] M = {{1,1,1},
                    {1,0,1},
                    {1,1,1}};
        Solution661 s = new Solution661();
        System.out.println(Arrays.deepToString(s.imageSmoother(M)));
    }
    public int[][] imageSmoother(int[][] M) {
        int tmp = 0,count = 0;
        int rows = M.length,cols = M[0].length;
        int[][] res = new int[rows][cols];
        for (int i=0;i<res.length;i++){
            for (int j=0;j<res[0].length;j++){
                if ((i-1) >=0 && (j-1) >=0){
                    tmp += M[i-1][j-1];
                    count++;
                }
                if ((i-1) >=0){
                    tmp += M[i-1][j];
                    count++;
                }
                if ((j-1) >=0){
                    tmp += M[i][j-1];
                    count++;
                }
                tmp += M[i][j];
                count++;
                if ((i+1) < rows){
                    tmp += M[i+1][j];
                    count++;
                }
                if ((j+1) < cols){
                    tmp += M[i][j+1];
                    count++;
                }
                if ((i+1) < rows && (j+1) < cols){
                    tmp += M[i+1][j+1];
                    count++;
                }
                if ((i-1) >=0 && (j+1) < cols){
                    tmp += M[i-1][j+1];
                    count++;
                }
                if ((i+1) < rows && (j-1) >=0){
                    tmp += M[i+1][j-1];
                    count++;
                }
                res[i][j] = (int)Math.floor(tmp/count);
                tmp = 0;
                count = 0;
            }
        }
        return res;
    }
}
