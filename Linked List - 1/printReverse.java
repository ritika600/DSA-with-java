/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

	public static void printReverse(LinkedListNode head) {
		//Your code goes here
     if(head== null || head.next==null){
            System.out.print(head.data+" ");
        }
     temp =printReverse(head.next);
        head.next.next=head;
        head.next=null;
      
        System.out.print(temp.data+" ");
	}

}
