package com.Amanjeet;

import org.w3c.dom.ls.LSOutput;

class Node{
    private int data;
    private Node next;
    int numberOfNode = 0; // will take care of how many node has been created.
    private Node head = null, current = null;

    // function to check whether list is empty of full.
    boolean isEmpty(){
        if(head == null) return true;
        else  return  false;
    }

    // function to create new node and return ref of it.
    private Node createNode(int data){
        Node n = new Node();
        this.numberOfNode += 1;
        n.data = data;
        return n;
    }

    // ************ function for inserting node in list *************

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

    void insert(int data){
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

    // ******* function to display all element of list *********

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

    // will return and display length of list.

    // function to show no of node present in list.
    int length(){
        System.out.println("Length of list : " + this.numberOfNode);
        return this.numberOfNode;
    }


    // ********* code for deleting node from list ********

    // will remove element from end of list.
    void pop(){
        if(this.isEmpty()){
            System.out.println("List is empty!! Nothing to delete.");
            return;
        }
        if(this.numberOfNode == 1){
            this.head = null;
            this.current = null;
        }
        else{
            Node temp = this.head;
            while (temp.next.next != null){
//                System.out.println("append : " + temp.data);
                temp = temp.next;
            }
            this.current = temp;
            temp.next = null;
        }
        this.numberOfNode -= 1;
    }

    // remove node from start.
    void remove(){
        if(this.isEmpty()){
            System.out.println("List is empty!! Nothing to remove..");
            return;
        }
        if (this.numberOfNode == 1){
            this.current = null;
            this.head = null;
        }
        else{
            this.head = head.next;
        }
        this.numberOfNode -= 1;
    }

    // remove element from given position.
    void remove(int pos){
        if (pos < 0){
            System.out.println("Your entered index doesn't exit in computer.");
            return;
        }
        if (this.isEmpty()){
            System.out.println("List is empty!! nothing to remove..");
            return;
        }
        if(pos == 0){
            this.remove();
        }
        else if (pos == this.numberOfNode-1){
            this.pop();
        }
        else if (pos > this.numberOfNode - 1){
            System.out.println("Given index is out of range!!");
            return;
        }
        else{
            // think about this functionality and add it in code.
            System.out.println("printing in remove!!");
            Node temp = head;
            while(pos != 1){
                System.out.println(temp.data);
                temp = temp.next;
                pos -= 1;
            }
            System.out.println("removing element is " + temp.next.data);
            temp.next = temp.next.next;
        }
        this.numberOfNode -= 1;
    }

    // ******* need to implement these properties in linked list ********
//    Searching: To search an element(s) by value.
//    Updating: To update a node.
//    Sorting: To arrange nodes in a linked list in a specific order.
//    Merging: To merge two linked lists into one.

    boolean searchLL(int data){
        Node temp = head;
        while (temp.next != null){
            if (temp.data == data){
                System.out.println(data + " is present in ll");
                return true;
            }
            temp = temp.next;
        }
        System.out.println(data + " is not present in ll.");
        return false;
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
//        ll.display();
//        ll.length();
//        ll.insert(1);
//        ll.display();

//        for(int i=0;i<=5;++i){
//            ll.append(i);
//        }
//        ll.display();
//
//        ll.pop();
//        ll.pop();
//        ll.pop();
//        ll.pop();
//        ll.pop();
//        ll.pop();
//        ll.length();
//        ll.display();

//        ll.append(0);
//        ll.append(1);
//        ll.append(2);
//        ll.append(3);
//        ll.display();
//        ll.remove();
//        ll.remove();
//        ll.remove();
//        ll.remove();
//        ll.remove();
//        ll.display();

        ll.append(0);
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
//        ll.append(4);
//        ll.display();
//        ll.remove(5);
//        ll.display();
        ll.searchLL(5);
    }
}
