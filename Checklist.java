package com.Linkedlist;

import static javax.swing.UIManager.get;

public class Checklist {
    public static void main(String[] args) {
       LinkedList<Integer>list2 = new LinkedList<>();
       list2.add(56);
       list2.add(70);
       System.out.println("After insertion at a given position");
       list2.searchAndInsert(56,30);
       list2.show();
    }
}

