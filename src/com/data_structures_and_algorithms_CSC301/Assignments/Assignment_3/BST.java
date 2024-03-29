package com.data_structures_and_algorithms_CSC301.Assignments.Assignment_3;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    static int lineNum = 0;
    static int wordsCounter = 0;
    protected TreeNode<E> root;
    protected int size = 0;

    /**
     * Create a default binary search tree
     */
    public BST() {
    }

    public void bstFromFileInput(String fileName, BST<String> binarySearchTree) {
        Scanner sc;
        try {
            FileReader fileReader = new FileReader(fileName);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

            lineNumberReader.lines();
            while (lineNumberReader.ready()) {
                lineNum = lineNumberReader.getLineNumber() + 1;
                String temp = lineNumberReader.readLine().replaceAll("[\"()?,.!;:-]", "").toLowerCase();
                sc = new Scanner(temp);
                while (sc.hasNext()) {
                    wordsCounter++;
                    String next = sc.next();
                    if (!(next.equals("the") ||
                            next.equals("a") ||
                            next.equals("an"))) {
                        binarySearchTree.insert(next, lineNum);
                    }
                }
            }
            fileReader.close();
            lineNumberReader.close();
        } catch (IOException e) {
            System.out.println("Wrong File Name!");
            System.exit(1);
        }
    }

    void getStats() {
        System.out.print("""
        --------------------------------------------------------------------------------------
        Stats from the Chosen File
        --------------------------------------------------------------------------------------
        """);
        System.out.printf("The total number of word(s) are: %d" +
                "%nThe total number of unique word(s): %d" +
                "%nThe total number of line(s) are: %d%n", wordsCounter, size, lineNum);
    }

    void printFormattedOutput() {
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("    | %-20s | %-8s | %80s |%n", "Word", "Count", "Line Number");
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------%n");
        this.inorder();
    }

    /**
     * Returns the number of occurrences of a word from the tree
     */
    public int getWordOccurrence(E e) {
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                return current.getWordOccurrence();
            }
        }
        return 0;
    }

    public ArrayList<Integer> getLineOfOccurrence(E e) {
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                return current.getLineNumber();
            }
        }
        return null;
    }

    @Override
    /** Return true if the element is in the tree */
    public boolean search(E e) {
        TreeNode<E> current = root; // Start from the root
        while (current != null) {
            if (e.compareTo(current.element) < 0)
                current = current.left;
            else if (e.compareTo(current.element) > 0)
                current = current.right;
            else
                return true; // Element is found
        }
        return false;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    /** Insert element e into the binary search tree.
     * Return true if the element is inserted successfully. */
    public boolean insert(E e, int lineNum) {
        if (root == null) {
            root = createNewNode(e); // Create a new root
            root.getLineNumber().add(lineNum);
        } else {
            // Locate the parent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;

            while (current != null) {
                if (e.compareTo(current.element) < 0) { // -1, a comes before b
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) { // 1, b comes after a
                    parent = current;
                    current = current.right;
                } else { // 0 - Duplicated word
                    current.wordOccurrence += 1;
                    if (!current.getLineNumber().contains(lineNum))
                        current.getLineNumber().add(lineNum);
                    return false;
                }
            }
            // Create the new node and attach it to the parent node
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
                parent.left.getLineNumber().add(lineNum);
            } else {
                parent.right = createNewNode(e);
                parent.right.getLineNumber().add(lineNum);
            }
        }
        size++;
        return true; // Element inserted successfully
    }

    @Override ///** Inorder traversal from the root */
    public void inorder() {
        inorder(root);
    }

    /**
     * Inorder traversal from a subtree
     */
    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.printf("    | %-20s | %-8s | %80s |%n", root.element, root.getWordOccurrence(), root.getLineNumber());
        inorder(root.right);
    }

    @Override
    /** Postorder traversal from the root */
    public void postorder() {
        postorder(root);
    }

    /**
     * Postorder traversal from a subtree
     */
    protected void postorder(TreeNode<E> root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.element + " ");
        }
    }


    @Override
    /** Get the number of nodes in the tree */
    public int getSize() {
        return size;
    }


    /**
     * Returns the root of the tree
     */
    public TreeNode<E> getRoot() {
        return root;
    }


    /**
     * Remove all elements from the tree
     */
    public void clear() {
        root = null;
        size = 0;
    }

    /**
     * Returns a path from the root leading to the specified element
     */
    public java.util.ArrayList<TreeNode<E>> path(E e) {
        java.util.ArrayList<TreeNode<E>> list =
                new java.util.ArrayList<>();
        TreeNode<E> current = root; // Start from the root

        while (current != null) {
            list.add(current); // Add the node to the list
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                current = current.right;
            } else
                break;
        }
        return list; // Return an array list of nodes
    }

    @Override
    /** Delete an element from the binary search tree.
     * Return true if the element is deleted successfully.
     * Return false if the element is not in the tree. */
    public boolean delete(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else
                break;
        }

        if (current == null)
            return false;
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            }
        } else {
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right; // Keep going to the right
            }

            // Replace the element in current by the element in rightMost
            current.element = rightMost.element;

            // Eliminate rightmost node
            if (parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else
                // Special case: parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
        }
        size--;
        return true; // Element deleted successfully
    }


    @Override
    /** Obtain an iterator. Use inorder. */
    public java.util.Iterator<E> iterator() {
        return new InorderIterator();
    }

    // Inner class InorderIterator
    private class InorderIterator implements java.util.Iterator<E> {
        // Store the elements in a list
        private java.util.ArrayList<E> list = new java.util.ArrayList<>();
        private int current = 0; // Point to the current element in list

        public InorderIterator() {
            inorder(); // Traverse binary tree and store elements in list
        }

        /**
         * Inorder traversal from the root
         */
        private void inorder() {
            inorder(root);
        }

        /**
         * Inorder traversal from a subtree
         */
        protected void inorder(TreeNode<E> root) {
            if (root == null) return;
            inorder(root.left);
            inorder(root.right);
        }

        @Override
        /** More elements for traversing? */
        public boolean hasNext() {
            if (current < list.size())
                return true;
            return false;
        }

        @Override
        /**Get the current element and move to the next */
        public E next() {
            return list.get(current++);
        }

        @Override
        /** Remove the current element */
        public void remove() {
            delete(list.get(current)); // Delete the current element
            list.clear(); // Clear the list
            inorder(); // Rebuild the list
        }
    }


    public void print() {
        print(root);
    }

    public void print(TreeNode<E> root) {
        if (root == null) return;
        root.print();
        root.print("Left", root.left, true); //left
        root.print("Right", root.left, false); //right
    }


}