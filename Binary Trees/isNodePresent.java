/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if(root==null){
            return false;
        }
        if(x==root.data){
            return true;
        }
       boolean leftt= isNodePresent(root.left,x);
       boolean rightt= isNodePresent(root.right,x);
        if(leftt){
            return true;
        }
        if(rightt){
            return true;
        }
        return false;
	}

}
