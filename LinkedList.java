package com.Linkedlist;
import java.io.*;

class LinkedList {
    Node head; // head of list

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    void deleteNode(int position) {
        if (head == null)
            return;

        Node temp = head;


        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;


        if (temp == null || temp.next == null)
            return;


        Node next = temp.next.next;

        temp.next
                = next;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    /* Driver program to test above functions. Ideally this
       function should be in a separate user class.  It is
       kept here to keep code compact */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(70);
        list.push(40);
        list.push(30);
        list.push(56);


        System.out.println("\nCreated Linked list is: ");
        list.printList();

        list.deleteNode(2);

        System.out.println(
                "\nLinked List after Deletion at position 4: ");
        list.printList();
    }
}