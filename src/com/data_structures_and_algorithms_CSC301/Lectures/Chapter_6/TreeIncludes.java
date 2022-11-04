package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_6;

//      a
//    /   \
//   b     c
//  / \     \
// d   e     f

public class TreeIncludes {
    public static void main(String[] args) {
        TreeNode<Integer> a = new TreeNode<>(10);
        TreeNode<Integer> b = new TreeNode<>(9);
        TreeNode<Integer> c = new TreeNode<>(15);
        TreeNode<Integer> d = new TreeNode<>(7);
        TreeNode<Integer> e = new TreeNode<>(8);
        TreeNode<Integer> f = new TreeNode<>(12);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;
        System.out.println(treeIncludes(a, 11)); // False
        System.out.println(treeIncludes(a, 12)); // True
    }

    static boolean treeIncludes(TreeNode<Integer> node, int target) {
        if (node == null) return false;
        if (node.element == target) return true;
        return treeIncludes(node.left, target) || treeIncludes(node.right, target);
    }
}
