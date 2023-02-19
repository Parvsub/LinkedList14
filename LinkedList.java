package com.Linkedlist;

public class LinkedList {
    private static class Node
    {
        int data = 70;
        Node next;
        Node(int data)
        {
            this.data= data;
            next = null;
        }
    }
    Node head;
    public void add(int data)
    {
        Node toinsert= new Node(data );
        if(head== null)
        {
            head = toinsert;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = toinsert;
    }
    //Print list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

