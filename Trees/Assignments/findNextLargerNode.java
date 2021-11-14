
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
	static TreeNode<Integer> res;
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int x){
		
		// Write your code here
         if (root == null)
        return null;
 
    if (root.data > x)
        if ((res == null || (res).data > root.data))
            res = root;
 
    int numChildren = root.children.size();
 
    for (int i = 0; i < numChildren; i++)
        findNextLargerNode(root.children.get(i), x);
 
    return res;

	}
	
}
