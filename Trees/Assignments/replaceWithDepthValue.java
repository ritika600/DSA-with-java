public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
   
    
    static void helper(TreeNode<Integer> root, int depth)
    {
        root.data = depth;
        for (int i = 0; i < root.children.size(); i++) {
            helper(root.children.get(i), depth + 1);
        }
    }
    static void
    replaceWithDepthValue(TreeNode<Integer> root)
    {
        helper(root, 0);
    }
 


	
	
}
