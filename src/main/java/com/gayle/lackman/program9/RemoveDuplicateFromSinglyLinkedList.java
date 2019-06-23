package com.gayle.lackman.program9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RemoveDuplicateFromSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertData(10);
        list.insertData(12);
        list.insertData(12);
        list.insertData(15);
        list.insertData(10);
        list.insertData(12);
        list.insertData(15);
        list.insertData(1);
        list.insertData(7);


        List list1 = new ArrayList();
        Node head = list.head;
        Node last = head;
        System.out.println(last.getData());
        list1.add(last.getData());



        while(last.getNextNode() != null){
            for(int i=0; i<list1.size(); i++){
                if(last.getData() == list1.get(i)){

                }
            }
            last = last.getNextNode();
            System.out.println(last.getData());
        }


    }
}
