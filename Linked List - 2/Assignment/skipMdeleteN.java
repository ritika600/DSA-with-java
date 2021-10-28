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
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here
           if (N==0)
        {
            return head;
        }
        if(M==0){
            return null;
        }
        
       
        LinkedListNode<Integer> temp2=head;
        LinkedListNode<Integer> temp=null;
        while(temp2!=null){
             int c=0;
            while(c!=M-1 && temp2!=null){
                c++;
                temp2=temp2.next;
            }
             
               if (temp2==null)
            {
                break;
            }
            temp=temp2.next;
             int p=0;
                while(p!=N && temp!=null ){
                    p++;
                    temp=temp.next;
                }
                temp2.next=temp;
               temp2=temp;
               
        }
        return head;
	}
}
