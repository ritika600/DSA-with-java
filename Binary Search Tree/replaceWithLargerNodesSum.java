public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */
static int sum = 0;
  static BinaryTreeNode<Integer> Root;
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		if (root == null) 
      return;
 
    // Recur for right subtree
    replaceWithLargerNodesSum(root.right);
 
    // Update sum
    sum = sum + root.data;
 
    // Store old sum in current node
    root.data = sum - root.data;
 
    // Recur for left subtree
    replaceWithLargerNodesSum(root.left);
	}
	
}
