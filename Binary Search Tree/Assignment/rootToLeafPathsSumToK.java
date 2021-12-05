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
public static void helper(BinaryTreeNode<Integer> root, int k,String ans,int sum){
    if(root==null){
        return;
    }
    if(root.left==null && root.right==null){
        sum+=root.data;
        if(sum==k){
            System.out.println(ans+root.data+" ");
        }
    }
    helper(root.left,k,ans+root.data+" ",sum+root.data);
     helper(root.right,k,ans+root.data+" ",sum+root.data);
    
}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        helper(root,k,"",0);
	}

}
