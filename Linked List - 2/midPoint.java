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
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null){
            return head;
        }
        LinkedListNode<Integer> temp=head;
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        int mid;
        if(len%2==0){
            mid=len/2-1;
        }
        else{
            mid = len/2;
        }
        int m=0;
        while(m!=mid){
            m++;
            temp=temp.next;
        }
        return temp;
    }

}
