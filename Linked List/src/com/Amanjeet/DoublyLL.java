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
        this.head = this.current = null;
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

    // ********** Display property ************

    // 1. Display all element of node in ascending order.
    public void display(){
        if (isEmpty()){
            System.out.println("List is empty!! Nothing to display.");
            return;
        }
        NodeD temp = this.head;
        System.out.println("\n Displaying in forward order : ");
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // 2. display list both in ascending and desending order.
    public void display(boolean rev){
        if (isEmpty()){
            System.out.println("list is empty!! Nothing to display!!");
            return;
        }
        else if(rev){
            NodeD temp = current;
            System.out.println("Displaying element in reverse order : ");
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
        NodeD n = createNode(data);

        if(isEmpty()){
            this.head = this.current = n;
            n.prev = n.next = null;
        }else {
            head.prev = n;
            n.next = head;
            n.prev = null;
            head = n;
        }
    }












    public static void main(String[] args) {

    }
}
