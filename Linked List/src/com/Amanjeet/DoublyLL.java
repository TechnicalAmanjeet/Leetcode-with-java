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
    private NodeD createNode(){
        this.numberOfNode += 1;
        return new NodeD();
    }

    // Display all element of node in ascending order.
    public void display(){
        if (isEmpty()){
            System.out.println("List is empty!! Nothing to display.");
            return;
        }
        NodeD temp = this.head;
        System.out.println("\n Display : ");
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

    }
}
