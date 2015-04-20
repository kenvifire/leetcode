package prob104;


/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }

    public static void main(String[] args){

        TreeNode root = null;

        System.out.println(new Solution().maxDepth(root));

        root = new TreeNode(0);

        System.out.println(new Solution().maxDepth(root));

        TreeNode left = new TreeNode(1);

        root.left = left;

        System.out.println(new Solution().maxDepth(root));

        TreeNode right = new TreeNode(2);

        root.right = right;

        System.out.println(new Solution().maxDepth(root));

        TreeNode leftOfLeft = new TreeNode(3);

        left.left = leftOfLeft;

        System.out.println(new Solution().maxDepth(root));



    }


}
