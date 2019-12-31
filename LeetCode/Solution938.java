/**
 * @author vert  @date 2019/8/24 16:56
 */
/*
给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
二叉搜索树保证具有唯一的值。
示例 1：
输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
输出：32

示例 2：
输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
输出：23
 
提示：
树中的结点数量最多为 10000 个。
最终的答案保证小于 2^31。
 */

/*
二叉搜索树：一棵二叉树，可以为空；如果不为空，满足以下性质：
1. 非空左子树的所有键值小于其根结点的键值。
2. 非空右子树的所有键值大于其根结点的键值。
3. 左、右子树都是二叉搜索树。
 */
public class Solution938 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        if (root.val >= L && root.val <= R){//当前节点在两数之间，把自身值加到结果里，并往左右子节点递归
            return root.val + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
        }else if(root.val < L){//当前节点值小于L，往右子节点寻找，非空右子树Right的所有键值大于其根结点的键值
            return rangeSumBST(root.right,L,R);
        }else{  //root.val > R
            //当前节点大于R，往左子节点寻找，非空左子树Left的所有键值小于其根结点的键值
            return rangeSumBST(root.left,L,R);
        }
    }

}
