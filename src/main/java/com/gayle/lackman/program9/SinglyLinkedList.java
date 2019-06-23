package com.gayle.lackman.program9;

public class SinglyLinkedList<T> {
    Node<T> head = new Node<T>();

    public void insertData(T data){
        Node newNode = new Node();
        newNode.setData(data);

        Node last = head;

        if(head.getData() == null){
            head = newNode;
        }else{
            while(last.getNextNode() != null){
                last = last.getNextNode();
            }
            last.setNextNode(newNode);
        }

    }

    public void print(){
        Node last = this.head;

        while(last.getNextNode() != null){
            System.out.println(last);
            last = last.getNextNode();
        }

        if(last.getData() != null){
            System.out.println(last);
        }
    }

}

class Node<T> {

    T data;
    Node<T> nextNode;

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}

