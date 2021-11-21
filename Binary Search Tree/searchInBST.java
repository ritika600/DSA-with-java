public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
        if(root==null ){
            return false;
        }
        // if(root.data!=k && root.left==null || root.right==null){
        //     return false;
        // }
		if(root.data==k){
            return true;
        }
        else if(root.data>k && root.left!=null){
           return searchInBST(root.left,k);
        }
        else if(root.data<k && root.right!=null) {
            return searchInBST(root.right,k);
        }
         return false;
	}
}
