package prob144;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root != null) {
            result.add(root.val);
        }else{
            return result;
        }

        if(root.left != null){
            result.addAll(preorderTraversal(root.left));
        }
        if(root.right != null){
            result.addAll(preorderTraversal(root.right));
        }
        return result;

    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        if(root == null){
           return result;
        }

        if(root.left != null){
            result.addAll(inorderTraversal(root.left));
        }

        if(root != null) {
            result.add(root.val);
        }

        if(root.right != null){
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }
    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode right = new TreeNode(2);
        root.right = right;

        TreeNode leftOfRight = new TreeNode(3);
        root.right.left = leftOfRight;

        System.out.println(new Solution().preorderTraversal(root));
        System.out.println(new Solution().inorderTraversal(root));

    }
}
