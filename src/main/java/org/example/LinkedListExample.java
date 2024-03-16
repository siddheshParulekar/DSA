package org.example;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.push(3);
        integerLinkedList.addLast(3);
        integerLinkedList.pop();
        System.out.println(integerLinkedList);
    }
}
