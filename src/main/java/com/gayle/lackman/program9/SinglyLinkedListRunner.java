package com.gayle.lackman.program9;

public class SinglyLinkedListRunner {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list =
                new SinglyLinkedList<>();

        list.insertData(10);
        list.insertData(20);
        list.insertData(30);
        list.insertData(40);
        list.insertData(50);
        list.insertData(20);
        list.insertData(70);
        list.insertData(80);
        list.insertData(90);
        list.insertData(100);

        list.print();





    }
}
