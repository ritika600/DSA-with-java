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

import java.util.Scanner;
public class Solution {
   public static LinkedListNode<Integer> takeInput(){
		LinkedListNode<Integer> head=null,tail=null;
       Scanner sc = new Scanner(System.in);
       int data = sc.nextInt();
       while(data!=-1){
           LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
           if(head==null){
               head=newNode;
               tail=newNode;
           }
           else{
               tail.next=newNode;
               tail=newNode;
               
           }
           data = sc.nextInt();
       }
       return head;
	}
	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
	}
    public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			LinkedListNode<Integer> a=takeInput();
			int count=length(a);
            System.out.print(count);
			n=n-1;
		}

	}
}
