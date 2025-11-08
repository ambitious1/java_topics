package com.list;

import com.list.singly_linked_list.SinglyLinkedList;

public class ListDemo {
    public static void run() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
        list.add(1);
        list.printList();
        list.add(2);
        list.printList();
        list.add(3);
        list.printList();
        list.add(4);
        list.printList();
        list.add(5);

        list.printList();
    }
}
