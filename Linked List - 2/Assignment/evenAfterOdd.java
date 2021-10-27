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

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        if(head==null){
            return head;
        }
	   LinkedListNode<Integer> evenH=null;
        LinkedListNode<Integer> evenT=null;
        LinkedListNode<Integer> oddH=null;
        LinkedListNode<Integer> oddT=null;
        while(head!=null){
            if(head.data%2==0){
                if(evenH==null){
                    evenH=head;
                    evenT=head;
                }
                else{
                evenT.next=head;
                evenT=head;
                }
            }
            else {
                 if(oddH==null){
                    oddH=head;
                    oddT=head;
                }
                else{
                oddT.next=head;
                oddT=head;
                }
            }
        
            head=head.next;
        }
       if (oddH==null)
        {
            return evenH;
        }
        else
        {
            oddT.next=evenH;
        }
        
        if (evenT!=null)
        {
            evenT.next=null;
        }
        
        
        return oddH;
	}
}
