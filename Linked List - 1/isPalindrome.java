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
public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
    if(head== null || head.next==null){
            return head;
        }
        LinkedListNode<Integer> temp =reverse(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
}
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
	
     LinkedListNode<Integer> fast =head;
        LinkedListNode<Integer> slow=head;
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
        }
        
       slow = reverse(slow);
        fast=head;
        while(slow!=null){
            if(slow.data!=fast.data){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
        
        
        }

}
