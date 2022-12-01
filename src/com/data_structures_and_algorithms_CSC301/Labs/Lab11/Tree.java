package com.data_structures_and_algorithms_CSC301.Labs.Lab11;

public interface Tree<E> extends Iterable<E> {
/** Return true if the element is in the tree */
public boolean search(E e);

/** Insert element e into the binary search tree.
 * Return true if the element is inserted successfully. */
public boolean insert(E e);

/** Delete the specified element from the tree.
 * Return true if the element is deleted successfully. */
public boolean delete(E e);
 
public void inorder(); /** Inorder traversal from the root*/

public void postorder(); /** Postorder traversal from the root */

public void preorder(); /** Preorder traversal from the root */

public int getSize(); /** Get the number of nodes in the tree */

public boolean isEmpty(); /** Return true if the tree is empty */
}
