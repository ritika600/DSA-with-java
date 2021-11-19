/*

	Following is the Binary Tree Node class structure.

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

	public static int getSum(BinaryTreeNode<Integer> root) {
		//Your code goes here.
        if(root==null){
            return 0;
        }
        int sum =root.data;
        sum+=getSum(root.left);
        sum+=getSum(root.right);
        return sum;
	}

}
