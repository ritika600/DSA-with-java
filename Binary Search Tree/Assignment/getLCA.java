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

	static int getLCA(BinaryTreeNode<Integer> root, int c, int d) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null){
            return -1;
        }
        if(root.data==c || root.data==d){
            return root.data;
        }
        int a = getLCA(root.left,c,d);
        int b = getLCA(root.right,c,d);
        if(a==-1){
            return b;
        }else if(b==-1){
            return a;
        }else if(a==-1 && b==-1){
            return -1;
        }else{
            return root.data;
        }
        
	}

}
