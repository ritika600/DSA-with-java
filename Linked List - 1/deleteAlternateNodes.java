/* 

    Following is the class used to represent the Node of a Singly Linked List

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
*/

public class Solution {
	public static void deleteAlternateNodes(Node<Integer> head) {
         while(head.next!=null){
             if(head.next.next!=null){
             head.next=head.next.next;
             head=head.next;
             }else{
                 head.next=null;
             }
         }
	}
}
