package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_3.Lists.ArrayListImplementation;


import com.data_structures_and_algorithms_CSC301.Lectures.Chapter_3.Lists.MyAbstractList;
import java.util.Iterator;



public class MyArrayList<E> extends MyAbstractList<E> {
    public static final int INITIAL_CAPACITY = 10;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];

    public MyArrayList() {
    }

    // List from an array of objects
    public MyArrayList(E[] obj) {
        for (int i = 0; i < obj.length ; i++) {
            add(obj[i]);
        }
    }


    @Override
    public void add(int index, E e) {
        ensureCapacity();

        // shifting from the end of the array, starts from size (default initial is 10)
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        // insert e to data[index]
        data[index] = e;
        size++;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public void clear() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("index" + index + "out of bounds");
        }
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        for (int i = size - 1; i >= 0; i++) {
            if (e.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E e = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return e;
    }

    @Override
    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    public void trimToSize() {
        if (size != data.length) {
            E[] newData = (E[]) (new Object[size]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }
    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
