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
public static boolean helper(BinaryTreeNode<Integer> root, int range_min, int range_max)
{
    if(root == null)
        return true;
    
    if (root.data < range_min || root.data > range_max)
        return false;
    
    if (helper(root.left, range_min, root.data-1))
        if (helper(root.right, root.data+1, range_max))
            return true;
    return false;
}

public static boolean isBST(BinaryTreeNode<Integer> root)
{
    if (helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
        return true;
    return false;
}
	}

