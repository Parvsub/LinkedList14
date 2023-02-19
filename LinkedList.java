package com.Linkedlist;

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void insertfront(int data) {
        // Allocating and inserting the data in that node
        Node new_node = new Node(data);


        new_node.next = head;
        head = new_node;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

