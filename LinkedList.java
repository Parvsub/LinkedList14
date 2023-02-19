package com.Linkedlist;

import java.lang.*;

class Linked
{
    Node head;

    // Node Class
    class Node
    {
        int data;
        Node next;

        Node (int x)		// parameterized constructor
        {
            data = x;
            next = null;
        }
    }
    //searchNode() will search for a given node in the list
    public void searchNode (int data)
    {
        Node current = head;
        int i = 1;
        boolean flag = false;

        //Checks whether list is empty
        if (head == null)
        {
            System.out.println ("List is empty");
        }
        else
        {
            while (current != null)
            {
                //Compares node to be found with each node present in the list
                if (current.data == data)
                {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (flag)
            System.out.
                    println ("Element is present in the node : " + i);
        else
            System.out.println ("Element is not present in the list");
    }

    public Node insert (int data)
    {
        Node newNode = new Node (data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    public void display ()
    {
        Node node = head;
        while (node != null)
        {
            System.out.print (node.data + " ");
            node = node.next;
        }
        System.out.println ("\n");
    }



}

public class LinkedList
{
    public static void main (String args[])
    {
        Linked list = new Linked();

        list.insert (56);
        list.insert (30);
        list.insert (70);


        list.searchNode (30);
    }
}