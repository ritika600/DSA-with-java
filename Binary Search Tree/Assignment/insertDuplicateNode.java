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

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
         insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
        BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<Integer>(root.data);
         BinaryTreeNode<Integer>  save = root.left;
        root.left=duplicate;
         duplicate.left=save;
       
	}
	
}
