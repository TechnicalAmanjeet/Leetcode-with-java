package com.Amanjeet;

import org.w3c.dom.ls.LSOutput;

class Node{
    private int data;
    private Node next;
    int numberOfNode = 0; // will take care of how many node has been created.
    private Node head = null, current = null;

    boolean isEmpty(){
        if(head == null) return true;
        else  return  false;
    }

    private Node createNode(int data){
        Node n = new Node();
        this.numberOfNode += 1;
        n.data = data;
        return n;
    }

    // working fine.
    // inserting node at the start of
    void insertNodeAtStart(int data){
        Node n = this.createNode(data);
        if(this.isEmpty()){
            this.insertFirstNode(n);
        }else{
            Node temp = this.head;
            n.next = this.head;
            this.head = n;
        }
    }

    private void insertFirstNode(Node n) {
        this.head = n;
        this.current = n;
        n.next = null;
    }

    // working fine.
    // Inserting node at end.
    void append(int data){
        Node n = this.createNode(data);
        if(this.isEmpty()){
            this.insertFirstNode(n);
        }else{
            current.next = n;
            current = n;
            current.next = null;
        }
    }

    void inser(int data){
        this.insertNodeAtStart(data);
    }

    // insert node at any particular position.
    void insert(int data, int pos){
        if(pos < 0){
            System.out.println("you entered a position which doesn't exit in computer world.");
            return;
        }
        else if(pos == 0){
            this.insertNodeAtStart(data);
        }
        else if(this.isEmpty()){
            if(pos == 0){
                     Node n = this.createNode(data);
                    this.insertFirstNode(n);
            }else {
                System.out.println("list is empty..");
            }
        }
        else if(pos == this.numberOfNode){
            this.append(data);
        }
        else if(pos > this.numberOfNode){
            System.out.println("list index out of range.");
        }
        else{
            Node temp = head, prev = temp;
            int tempPosition = pos;
            while (tempPosition-- == 0){
                prev = temp;
                temp = temp.next;
            }
            Node n = this.createNode(data);
            prev.next = n;
            n.next = temp;
        }
    }

    // working fine.
    // Display data of linked list.
    void display(){
        Node temp = head;
        if(head == null){
            System.out.println("\nLinked List is empty!!!");
            return;
        }else{
            System.out.println("Display : ");
            while (temp.next != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        System.out.println(temp.data);
    }
}

public class SingleLL {
    public static void main(String[] args) {
        Node ll = new Node();
//        ll.insertNodeAtStart(10);
////        ll.insertNodeAtStart(9);
////        ll.insertNodeAtStart(8);
//        ll.append(11);
//        ll.append(12);
//        ll.insertNodeAtStart(0);
//        ll.insert(1,1);
//        ll.insert(0,2);
        ll.display();
    }
}
