class PassNode<T>
{
	T head;
    T tail;
}
public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        PassNode<LinkedListNode<Integer>> passNode= constructLinkedListHelper(root);
        return passNode.head;
	}
    
    public static PassNode<LinkedListNode<Integer>> constructLinkedListHelper(BinaryTreeNode<Integer> root)
    {
    	if(root==null)
        {
            return new PassNode<LinkedListNode<Integer>>();
        }
        
        if (root.left==null && root.right==null)
        {
        	PassNode<LinkedListNode<Integer>> passNode = new PassNode<LinkedListNode<Integer>>();
        	passNode.head=new LinkedListNode<Integer>(root.data);
            passNode.tail=null;
            return passNode;
        }
        
        PassNode<LinkedListNode<Integer>> passNodeLeft = constructLinkedListHelper(root.left);
        PassNode<LinkedListNode<Integer>> passNodeRight = constructLinkedListHelper(root.right);
        PassNode<LinkedListNode<Integer>> passNode = new PassNode<LinkedListNode<Integer>>();
        LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(root.data);
        
        if (passNodeLeft.head==null)
        {
        	passNode.head=newNode;
            //passNode.tail=newNode;
        }
        else
        {
        	passNode.head=passNodeLeft.head;
        }
        
        if(passNodeLeft.tail==null)
        {
        	passNode.head.next=newNode;
            passNode.tail=newNode;
        }
        else
        {
        	passNodeLeft.tail.next=newNode;
            passNode.tail=newNode;
        }
        
        if (passNodeRight.head!=null)
        {
        	passNode.tail.next=passNodeRight.head;
            passNode.tail=passNodeRight.head;
        }
        
        if(passNodeRight.tail!=null)
        {
        	passNode.tail=passNodeRight.tail;
        }
    
        return passNode;
   
    }
}
