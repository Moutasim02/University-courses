package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_3;

import java.util.ArrayList;

/**
 * This inner class is static, because it does not access
 * any instance members defined in its outer class
 */
public class TreeNode<E extends Comparable<E>> {
    protected E element;
    protected TreeNode<E> left, right;
    protected int wordOccurrence = 1;
    protected ArrayList<Integer> lineNumber = new ArrayList<>();

    public TreeNode(E e) {
        element = e;
    }

    @Override
    public String toString() {
        return element.toString();
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public void print() {
        print("", this, false);
    }

    public void print(String prefix, TreeNode<E> n, boolean isLeft) {
        if (n != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + n.element);
            print(prefix + (isLeft ? "│   " : "    "), n.left, true);
            print(prefix + (isLeft ? "│   " : "    "), n.right, false);
        }
    }

    public int getWordOccurrence() {
        return wordOccurrence;
    }

    public ArrayList<Integer> getLineNumber() {
        return lineNumber;
    }
}
