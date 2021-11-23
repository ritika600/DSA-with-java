/*
 * Binary Tree Node class
 * 
 * class BinaryTreeNode<T> { 
 * 		T data; 
 * 		BinaryTreeNode<T> left; 
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data) 
 * 		{ 
 * 			this.data = data; 
 * 		}
 * }
 */

 /* 
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */
import java.util.*;
public class BinarySearchTree {
    private BinaryTreeNode<Integer> root=null;
    private BinaryTreeNode<Integer> insertHelper(int data ,BinaryTreeNode<Integer> root ){
        if(root==null){
           BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(data);
            return node;
        }
        if(data<=root.data){
            root.left=insertHelper(data,root.left);
        }else if(data>root.data){
            root.right=insertHelper(data,root.right);
        }
        return root;
    }
	public void insert(int data) {
		//Implement the insert() function
        root=insertHelper(data,root);
	}
	public BinaryTreeNode<Integer> delHelper(int data ,BinaryTreeNode<Integer> root ){
        if(root==null){
            return null;
        }
        if(data<root.data){
            root.left = delHelper(data,root.left);
            return root;
        }else if(data>root.data){
            root.right= delHelper(data,root.right);
            return root;
        }else{
            if(root.left==null && root.right==null){
                return null;
            }else if(root.left==null && root.right!=null){
                return root.right;
            }else if(root.right==null && root.left!=null){
                return root.left;
            }else{
                BinaryTreeNode<Integer> minNode = root.right;
                while(minNode.left!=null){
                    minNode=minNode.left;
                }
                root.data=minNode.data;
                root.right = delHelper(minNode.data,root.right);
                return root;
            }
        }
    }
	public void remove(int data) {
		//Implement the remove() function
        root=delHelper(data,root);
	}
	private void helperPrint(BinaryTreeNode<Integer> root){
        
      if (root==null)
        {
            return;
        }
        String nodesToPrint=root.data+":";
         
           
            if (root.left!=null)
            {
                nodesToPrint+="L:"+root.left.data+",";
               
            }
           
            if (root.right!=null)
            {
                nodesToPrint+="R:"+root.right.data;
            }
           
            System.out.println(nodesToPrint);
        	helperPrint(root.left);
            helperPrint(root.right);
        

	}
    
	public void printTree() {
		//Implement the printTree() function
       helperPrint(root);
        
	}
	public boolean helper(int data,BinaryTreeNode<Integer> root){
        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        else if(data>root.data){
            return helper(data,root.right);
        }else{
             return helper(data,root.left);
        }
    }
	public boolean search(int data) {
		//Implement the search() function
        return helper(data,root);
	}
	

}
