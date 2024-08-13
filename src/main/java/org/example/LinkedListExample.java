package org.example;

import java.util.*;

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode l3 = head;
        while (l1 != null || l2 != null) {
            int l1Value = (l1 == null) ? 0 : l1.val;
            int l2Value = (l2 == null) ? 0 : l2.val;

            int sum = l1Value + l2Value + carry;
            int val= sum %10;
            carry = sum/10;

            ListNode newNode = new ListNode(val);
            l3.next = newNode;

            if (l1 !=null)
                l1 = l1.next;
            if (l2 != null)
                l2= l2.next;
            l1= l3.next;

        }
        return head.next;
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()){
            return 0;
        }
        if (s.isBlank() || s.length()==1){
            return 1;
        }
       int countSet[]= new int[s.length()];

       for (int i =0;i<s.length();i++){
           int count = 1;
           Set<Character> set = new HashSet<>();
           set.add(s.charAt(i));
        
           for (int j = i+1;j<s.length();j++){
               if (set.contains(s.charAt(j))){
                   countSet[i] = count;
                   break;
               }
               else{
                   count++;
                   set.add(s.charAt(j));
                   if (j == s.length()-1) {
                    countSet[i] = count;
                    break;
                   }
              }
           }

       }

        Arrays.sort(countSet);        
       return countSet[countSet.length-1];
    }

    public static void main(String[] args) {

        LinkedListExample linkedListExample = new LinkedListExample();

       // linkedListExample.printListNode();
       // String s="auabc";
       // System.out.println(linkedListExample.lengthOfLongestSubstring(s));
//        LinkedList<Integer> integerLinkedList = new LinkedList<>();
//        integerLinkedList.add(1);
//        integerLinkedList.add(2);
//        integerLinkedList.push(3);
//        integerLinkedList.addLast(3);
//        integerLinkedList.pop();
//        System.out.println(integerLinkedList);
    }
}
