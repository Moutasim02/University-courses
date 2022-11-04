package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_6;


import java.util.Stack;

// Go deep to the left, then the next node to the right (if available)
// See the readme file

//      a
//    /   \
//   b     c
//  / \     \
// d   e     f
public class Depth_First_Search {
    public static void main(String[] args) {
        TreeNode<Character> a = new TreeNode<>('a');
        TreeNode<Character> b = new TreeNode<>('b');
        TreeNode<Character> c = new TreeNode<>('c');
        TreeNode<Character> d = new TreeNode<>('d');
        TreeNode<Character> e = new TreeNode<>('e');
        TreeNode<Character> f = new TreeNode<>('f');

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.right = f;

        DFS(a);
    }

    private static void DFS(TreeNode<Character> root) {
        if (root == null) System.out.println("Root is null");

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        while (stack.size() > 0) {
            var current = stack.pop();
            System.out.println(current);

            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
    }

}
