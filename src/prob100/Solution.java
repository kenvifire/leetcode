package prob100;


import sun.jvm.hotspot.utilities.Assert;

/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q== null){
            return true;
        }else if(p != null && q !=null ){
            if(p.val != q.val){
                return false;
            }else {
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args){

        TreeNode p = null;
        TreeNode q = null;

        Assert.that(new Solution().isSameTree(p,q),"p q should be same tree");

        p = new TreeNode(1);
        q = new TreeNode(2);
        Assert.that(new Solution().isSameTree(p,q) == false,"p q should not be same tree");

        p = new TreeNode(1);
        q = new TreeNode(1);
        Assert.that(new Solution().isSameTree(p,q),"p q should be same tree");


    }


}
