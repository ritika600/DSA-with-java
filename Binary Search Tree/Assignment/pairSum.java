/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

 */
import java.util.*;
public class Solution {
   static ArrayList<Integer> toArray(BinaryTreeNode<Integer> root){
       if(root==null){
           return new ArrayList<>();
       }
       ArrayList<Integer> leftArray = toArray(root.left);
         ArrayList<Integer> rightArray = toArray(root.right);
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i : leftArray){
           ans.add(i);
       }
        for(int i : rightArray){
           ans.add(i);
       }
       ans.add(root.data);
       return ans;
       
   }
	static void pairSum(BinaryTreeNode<Integer> root, int sum) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        if(root==null){
            return;
        }
        ArrayList<Integer> arr = toArray(root);
        Collections.sort(arr);
        int i=0,j=arr.size()-1;
        while(i<j){
            if(arr.get(i)+arr.get(j)==sum){
                System.out.println(arr.get(i)+" "+arr.get(j));
                i++;
                j--;
            }else if(arr.get(i)+arr.get(j)<sum){
                i++;
            }else{
                j--;
            }
        }
        
        
	}

}
