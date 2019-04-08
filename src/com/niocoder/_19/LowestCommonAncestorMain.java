package com.niocoder._19;

import com.niocoder._17.TreeNode;

public class LowestCommonAncestorMain {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //p,q分别在根节点左右, 则祖先为根节点
        if ((root.val >= p.val && root.val <= q.val) || (root.val <= p.val && root.val >= q.val))
            return root;
            //p,q都小于根节点, 则最近祖先节点为根节点左边
        else if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
            //p,q都大于根节点, 则最近祖先节点为根节点右边
        else //if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
    }
}
