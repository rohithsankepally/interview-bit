/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    public int isValidBST(TreeNode A) {
        if(A == null) {
            return 1;
        }
        return isValidBST(A, min, max) ? 1 : 0;
    }
    
    private boolean isValidBST(TreeNode A, int min, int max) {
        if(A == null) {
            return true;
        }
        if(isValidBST(A.left, min, A.val) && isValidBST(A.right, A.val, max) && A.val > min && A.val < max) {
            return true;
        }
        return false;
    }

}
