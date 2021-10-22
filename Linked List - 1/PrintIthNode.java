/*

 	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

*/

public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        int c=0;
        while(head!=null){
            if(c==i){
                System.out.println(head.data);
            }
            c++;
            head=head.next;
        }
	}
}
