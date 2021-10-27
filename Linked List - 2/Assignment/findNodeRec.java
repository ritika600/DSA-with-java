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

public static int find(LinkedListNode<Integer> head, int n,int c) {
    if(head==null){
        return -1;
    }
    if(head.data==n){
        return c;
    }
   int ans = find(head.next,n,c+1);
    return ans;
}
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        int c=0;
        if(head== null)
        {
            return -1;
        }     
        int ans = find( head,  n, c);
        return ans;
	}

}
