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
public static int  height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int height=1;
        height+=height(root.left);
        height+=height(root.right);
    return height;
}
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null){
            return true;
        }
       
        int ht=height(root.left);
       int  ht2=height(root.right);
        if(ht==ht2){
            return true;
        }
        else return false;
	}

}
