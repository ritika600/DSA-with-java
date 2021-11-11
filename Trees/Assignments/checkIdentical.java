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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
    if(root1==null || root2==null){
        return false;
    }
	if(root1.children.size()!=root2.children.size())
        {
            return false;
        }
         if(root1.children.size()==root2.children.size()){
            if(root1.data==root2.data)
            {
                for(int i=0 ,j=0;i<root1.children.size()&&j<root2.children.size();i++ ,j++){
                    checkIdentical(root1.children.get(i),root2.children.get(j));
                        return true;
                }
            }
        }
        return false;
	}
	
}
