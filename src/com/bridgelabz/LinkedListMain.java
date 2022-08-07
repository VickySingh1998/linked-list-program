package com.bridgelabz;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedListLogic linkedListLogic = new LinkedListLogic();

        linkedListLogic.insertNode(56);
        linkedListLogic.appending(56, 30);
        linkedListLogic.appending(30, 70);
        linkedListLogic.toPrint();
    }
}
