package com.Amanjeet;

//functionality of linked list
// 1. Display => both in forward and backward. => display()
// 2. insertion =>
//              1. insert at start. => insert()
//              2. insert at end.  => append()
//              3. insert in between. => insert(int pos)
// 3. Deletion =>
//              1. delete at start => remove()
//              2. delete at end => pop()
//              3. delete in beetween => remove(int data)
// 4. Search in linked list. => search(int data)
// 5. update => update(int prev, int curr)
// 6. merge => merge(Node ll)
// 7. sort => sort()

class NodeD{
    NodeD prev, next;
    int data;
}


public class DoublyLL {
    private int numberOfNode;
    private  NodeD head, current;

    // Default constructor.
    DoublyLL(){
        this.numberOfNode = 0;
        this.head = null;
        this.current = null;
    }

    // isEmpty => return true : if list is empty ? false
    private boolean isEmpty(){
        if (this.numberOfNode == 0) return true;
        return false;
    }

    // create new node and return ref. of it.
    private NodeD createNode(int data){
        this.numberOfNode += 1;
        NodeD n = new NodeD();
        n.data = data;
        return n;
    }

    public int length(){
        System.out.println("Length of list : " + this.numberOfNode);
        return this.numberOfNode;
    }

    // ********** Display property ************

    // 1. Display all element of node in ascending order.
    public void display(){
        if (isEmpty()){
            System.out.println("\nList is empty!! Nothing to display.");
            return;
        }
        NodeD temp = this.head;
        System.out.println("\nDisplaying in forward order : ");
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // 2. display list both in ascending and desending order.
    public void display(boolean rev){
        if (isEmpty()){
            System.out.println("\nlist is empty!! Nothing to display!!");
            return;
        }
        else if(rev){
            NodeD temp = current;
            System.out.println("\nDisplaying element in reverse order : ");
            while(current != null){
                System.out.print(current.data + " ");
                current = current.prev;
            }
        }
        else this.display();
    }

    // *********** Insertion functionality ***********


    // 1. insert(int data) => insert element at start.
    public void insert(int data){
//        System.out.println(n + " " + n.data);
        if(isEmpty()){
            NodeD n = this.createNode(data);
            this.head = n;
            this.current = n;
            n.prev = n.next = null;
        }else{
            NodeD n = this.createNode(data);
            head.prev = n;
            n.next = head;
            n.prev = null;
            head = n;
        }
    }

    // 2. append(int data)
    public void append(int data){
        if(this.isEmpty()){
            this.insert(data);
        }
        else{
            NodeD n = this.createNode(data);
            current.next = n;
            n.prev = current;
            n.next = null;
            current = n;
        }
    }

    // insert data at some position. => insert(int data, int pos)
    public void insert(int data, int pos){
        if(pos == 0){
            this.insert(data);
        }else if(pos == this.numberOfNode){
            this.append(data);
        }else if(pos > this.numberOfNode - 1){
            System.out.println("List index out of range!!");
        }else if(pos < 0){
            System.out.println("negative index is not there in list.");
        }
        else{
            NodeD temp = this.head, n = this.createNode(data);
            while (pos == 0){
                temp = temp.next;
                pos -= 1;
            }
            n.prev = temp.prev;
            temp.prev.next = n;
            n.next = temp;
            temp.prev = n;
        }
    }

    // ********* Deletion of Node started from here ***********

    // 1. delete node from start. => remove()
    public void remove(){
        if(this.isEmpty()){
            System.out.println("List is empty!! Nothing to remove.");
            return;
        }
        else if(this.numberOfNode == 1){
            this.current = this.head = null;
        }
        else{
            this.head = this.head.next;
            this.head.prev = null;
        }
        this.numberOfNode -= 1;
    }

    // 2. delete node from end => pop()
    public void pop(){
        if(this.isEmpty()){
            System.out.println("List is empty!! Nothing to remove.");
            return;
        }
        else if(this.numberOfNode == 1){
            this.current = this.head = null;
        }
        else{
            this.current = this.current.prev;
            this.current.next = null;
        }
        this.numberOfNode -= 1;
    }

    // 3rd type of deletion method => remove(int data)
    public void remove(int data){
        if (this.isEmpty()){
            System.out.println("List is empty!! Nothing to remove.");
        }
        else if(this.numberOfNode == 1 && this.head.data == data){
            this.head = this.current = null;
            this.numberOfNode -= 1;
        }else if(this.head.data == data){
            this.head = this.head.next;
            this.head.prev = null;
            return;
        }
        else{
            NodeD temp = this.head;
            while (temp.next != null){
                if(temp.data == data){
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                    this.numberOfNode -= 1;
                    return;
                }
                temp = temp.next;
            }
            if(temp.data == data){
                this.current = temp.prev;
                this.current.next = null;
                this.numberOfNode -= 1;
                return;
            }
        }
        System.out.println(data + " is not present in the list.");
    }

    // 4. Search in linked list. => search(int data)
    //// 5. update => update(int prev, int curr)
    //// 6. merge => merge(Node ll)
    //// 7. sort => sort()

    // search in list.
    public boolean search(int data){
        if(this.isEmpty()){
            System.out.println("List is empty!!");
        }
        else{
            NodeD temp = head;
            while (temp != null){
                if(temp.data == data){
                    System.out.println(data + " is present in list.");
                    return true;
                }
                temp = temp.next;
            }
            System.out.println(data + " is not present in list.");
        }
            return false;
    }







    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
//        System.out.println(ll.head + " " + ll.current);
//        ll.insert(5);
//        ll.insert(4);
//        ll.insert(3);
//        ll.insert(2);
//        ll.insert(1);
//        ll.insert(0);
//
//        ll.append(0);
//        ll.append(1);
//        ll.append(2);
//        ll.append(3);
////        ll.append(04);
//        ll.length();
//        ll.display();
//        ll.display(true);

//        ll.insert(0,0);
//        ll.insert(1,1);
//        ll.insert(2,2);
////        ll.remove();
//        ll.remove();
//        ll.remove();
//        ll.pop();
//        ll.pop();
//        ll.pop();

//        ll.remove(0);

        ll.append(0);
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
//        ll.remove(0);
        ll.append(5);
        ll.search(6);
        ll.display();
    }
}
