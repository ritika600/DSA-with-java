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
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
      
         LinkedListNode<Integer> head3=null;
        if(head1.data<head2.data){
            head3=head1;
            head1=head1.next;
        }
        else{
             head3=head2;
            head2=head2.next;
        }
      LinkedListNode<Integer> current=head3;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
               current.next= head1;
                 head1=head1.next;
            }else {
                current.next= head2;
                 head2=head2.next;
            }
          current=current.next;
        }
        if(head1==null){
            current.next=head2;
        }else{
            current.next=head1;
        }
        return head3;
        
    }

}
