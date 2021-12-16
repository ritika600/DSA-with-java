import java.util.ArrayList;
public class Solution {
    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) 
    {
        if(root == null || root.children.size() == 0)
        {
            return null;
        }
        ArrayList<Integer> indexes = new ArrayList<Integer>(); 
        for(int i = 0; i < root.children.size(); i++) 
        {
            TreeNode<Integer> child = root.children.get(i); 
            if(child.children.size() == 0)
            {
                indexes.add(i); 
            }
        }
        for(int i = indexes.size()-1; i >= 0; i--) 
        {
            int j = indexes.get(i); root.children.remove(j); 
        }
        for(int i = 0; i < root.children.size(); i++)
        {
            TreeNode<Integer> child = removeLeafNodes(root.children.get(i)); 
            if(child == null)
            {
                root.children.remove(i); 
            }
        }
        return root; 
    }
}
