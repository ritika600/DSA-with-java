
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
    static class Pair<T>{
        TreeNode<T> node;
        int sum;
    }
	
	
    public static Pair<Integer> helper(TreeNode<Integer> root){
		if(root.children.size()==0){
            Pair<Integer> t = new Pair<Integer>();
            t.node=null;
            t.sum= Integer.MIN_VALUE;
            return t;
        }
        int sum =root.data;
        for(TreeNode<Integer> child:root.children){
            sum+=child.data;
        }
         Pair<Integer> ans = new Pair<Integer>();
        ans.node=root;
        ans.sum=sum;
        for(TreeNode<Integer> child:root.children){
           Pair<Integer> childAns = helper(child);
            if(childAns.sum>ans.sum){
                ans = childAns;
            }
        }
        return ans;
	}
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		return helper(root).node;
	}
	
		
}
