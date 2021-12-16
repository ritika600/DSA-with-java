public class solution {
    public static boolean isSibling(BinaryTreeNode<Integer> root, int p, int q)
    {
        if(root==null)
            return false;
        if(root.left!=null && root.right !=null)
        {
            if(root.left.data == p && root.right.data == q) 
                return true;
            else if(root.left.data == q && root.right.data == p)
                return true; 
            else return isSibling(root.left, p, q) || isSibling(root.right, p, q);
        }
        if(root.right != null) 
            return isSibling(root.right, p, q);
        else return isSibling(root.left, p, q);
    }
    public static int depth(BinaryTreeNode<Integer> root, int node){ 
        if(root == null) return -1; 
        if(node == root.data) return 0; 
        int left = depth(root.left, node);
        if(left != -1) return left + 1; else 
        {
            int right = depth(root.right, node); 
            if(right != -1)
                return right + 1; 
            else return -1; 
        }
    }
    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) 
    {
        if(root==null) 
            return false;
        return ((depth(root, p) == depth(root, q)) && (!isSibling(root, p, q)));
    }
}
