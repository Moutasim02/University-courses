package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_6;

public class BinaryTree_Demo {
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
    }
}
