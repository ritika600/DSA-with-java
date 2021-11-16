public class Solution {

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
        BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder, 0 ,postOrder.length-1, 0, inOrder.length-1);
    	return root;
	}
    
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int siPost, int eiPost, int siIn, int eiIn) {
		if (siPost>eiPost)
    	{
    		return null;
    	}
    	
    	int rootData=postOrder[eiPost];
    	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    	
    	int rootIndex=-1;
    	for (int i=siIn;i<=eiIn;i++)
    	{
    		if (rootData==inOrder[i])
    		{
                rootIndex=i;
    			break;
    		}
    	}
    	    	
    	int siInLeft=siIn;
    	int eiInLeft=rootIndex-1;
    	
    	int siPostLeft=siPost;
    	int leftSubTreeLength = eiInLeft - siInLeft + 1;
    	int eiPostLeft=(siPostLeft)+(leftSubTreeLength-1);
    	
    	int siInRight=rootIndex+1;
    	int eiInRight=eiIn;
    	
    	int siPostRight=eiPostLeft+1;
    	int eiPostRight=eiPost-1;
    	
        BinaryTreeNode<Integer> rightChild = buildTree(postOrder, inOrder, siPostRight, eiPostRight, siInRight, eiInRight);
    	BinaryTreeNode<Integer> leftChild = buildTree(postOrder, inOrder, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
    	
    	root.left=leftChild;
    	root.right=rightChild;
    	return root;
	}
    
    

}
