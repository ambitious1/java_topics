package com.list.singly_linked_list;

import com.list.Node;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;

    public void add(T item) {
        Node<T> nde = new Node<T>(item);

        if (head == null) {
            head = nde;
            size++;
        } else {
            int currentSize = 0;
            Node last = head;

            while (last.getNext() != null) {
                last = last.getNext();
                currentSize++;
            }

            last.setNext(nde);
            size = size + currentSize;
        }
    }

    public Node<T> getList() {
        return head;
    }

    public void setList(Node<T> list) {
        this.head = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printList() {
        Node<T> currNde = head;
        System.out.println("LinkedList: ");

        while (currNde != null) {
            System.out.println(currNde.getVal() + " ");
            currNde = currNde.getNext();
        }
    }

}
