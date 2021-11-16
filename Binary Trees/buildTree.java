public class Solution {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder, 0 ,preOrder.length-1, 0, inOrder.length-1);
    	return root;
        
	}
    
    public static BinaryTreeNode<Integer> buildTree(int[] preorder, int[] inorder,int siPre, int eiPre, int siIn, int eiIn)
    {
        if (siPre>eiPre)
    	{
    		return null;
    	}
    	
    	int rootData=preorder[siPre];
    	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    	
    	int rootIndexInorder=-1;
    	for (int i=siIn;i<=eiIn;i++)
    	{
    		if (rootData==inorder[i])
    		{
    			rootIndexInorder=i;
    			break;
    		}
    	}
    	    	
    	int siInLeft=siIn;
    	int eiInLeft=rootIndexInorder-1;
    	
    	int siPreLeft=siPre+1;
    	int leftSubTreeLength = eiInLeft - siInLeft + 1;
    	int eiPreLeft=(siPreLeft)+(leftSubTreeLength-1);
    	
    	int siInRight=rootIndexInorder+1;
    	int eiInRight=eiIn;
    	
    	int siPreRight=eiPreLeft+1;
    	int eiPreRight=eiPre;
    	
    	BinaryTreeNode<Integer> leftChild = buildTree(preorder, inorder, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
    	BinaryTreeNode<Integer> rightChild = buildTree(preorder, inorder, siPreRight, eiPreRight, siInRight, eiInRight);
    	root.left=leftChild;
    	root.right=rightChild;
    	return root;
    }
    

}
