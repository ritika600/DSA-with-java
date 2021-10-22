/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/
public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int element) {
		// Write your code here.
        LinkedListNode<Integer> temp=head;
     int count=0;
	 while(temp!=null)
	 {
		 if(temp.data==element)
		 {
			 
			 break;
		 }
		 else
		 {
			 count++;
			 temp=temp.next;
		 }
	 }
	 if(temp==null)
	 {
		 return -1;
	 }
	 else
	 {
		 return count;
	 }
	}
}
