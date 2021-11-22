public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	public static BinaryTreeNode<Integer> helper(int[] arr, int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        BinaryTreeNode<Integer>  node = new BinaryTreeNode<Integer> (arr[mid]);
 
        /* Recursively construct the left subtree and make it
         left child of root */
        node.left = helper(arr, start, mid - 1);
 
        /* Recursively construct the right subtree and make it
         right child of root */
        node.right = helper(arr, mid + 1, end);
         
        return node;
    }
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return helper(arr,0,n-1);
            
		}
	}
