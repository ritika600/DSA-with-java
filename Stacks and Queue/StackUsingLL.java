
/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class Stack {

    //Define the data members
     private Node head;
    private int size;
   


    public Stack() {
        //Implement the Constructor
        head=null;
        size=0;
        
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return (size==0);
    }

    public void push(int element) {
        //Implement the push(element) function
        Node neww = new Node(element);
        neww.next=head;
        head=neww;
        size++;
        
    }

    public int pop() {
        //Implement the pop() function
        if(size==0){
            return -1;
        }
        Node fin=head;
        head=head.next;
        size--;
        return fin.data;
    }

    public int top() {
        //Implement the top() function
        if(size==0){
            return -1;
        }
        return head.data;
    }
}
// public class Stack {

//     private Node head;
//     private int size;


//     public Stack() {
//         head = null;
//         size = 0;
//     }


//     public int getSize() { 
//         return size;
//     }

//     public boolean isEmpty() {
//         return (size == 0);
//     }

//     public void push(int element) {
//         Node toAdd = new Node(element);
//         toAdd.next = head;
//         head = toAdd;
//         size++;
//     }

//     public int pop() {
//         if(size == 0) {
//             return -1;
//         }
//         Node remove = head;
//         head = head.next;
//         size--;
//         return remove.data;
//     }

//     public int top() {
//         if(size == 0) {
//             return -1;
//         }
//         return head.data;
//     }
// }
