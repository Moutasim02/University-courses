package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_3.Lists;

public interface MyList<E> extends Iterable<E> {
    public void add(E e);

    /**
     * Add a new element at the end of this list
     */
    public void add(int index, E e);

    /**
     * Add a new element at the specified index in this list
     */
    public void clear();

    /**
     * Clear the list
     */
    public boolean contains(E e);

    /**
     * Return true if this list contains the element
     */
    public E get(int index);

    /**
     * Return the element from this list at the specified index
     */
    public int indexOf(E e);

    /**
     * Return the index of the first matching element in this list.
     * Return -1 if no match.
     */
    public boolean isEmpty();

    /**
     * Return true if this list doesn't contain any elements
     */
    public int lastIndexOf(E e);

    /**
     * Return the index of the last matching element in this list
     * Return -1 if no match.
     */
    public boolean remove(E e);

    /**
     * Remove the first occurrence of the element e from this list.
     * Shift any subsequent elements to the left.
     * Return true if the element is removed.
     */
    public E remove(int index);

    /**
     * Remove the element at the specified position in this list.
     * Shift any subsequent elements to the left.
     * Return the element that was removed from the list.
     */
    public Object set(int index, E e);

    /**
     * Replace the element at the specified position in this list
     * with the specified element and return the old element.
     */
    public int size(); /* Return the number of elements in this list */
}

