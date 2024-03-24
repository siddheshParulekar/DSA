package org.example;

import java.util.LinkedList;

public class LinkedListExample {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public void printListNode(){
        ListNode l1 = new ListNode(1);
        ListNode l2= new ListNode(2);
        ListNode l3= new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode curr = l1;
        while (curr.next !=null){
            System.out.println( curr.val);
            curr = curr.next;
        }


    }

    public static void main(String[] args) {

        LinkedListExample linkedListExample = new LinkedListExample();
        linkedListExample.printListNode();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.push(3);
        integerLinkedList.addLast(3);
        integerLinkedList.pop();
        System.out.println(integerLinkedList);
    }
}
