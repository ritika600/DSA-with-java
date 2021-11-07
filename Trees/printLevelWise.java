import java.util.*;
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
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
    
        QueueUsingLL<TreeNode<Integer>> mq = new QueueUsingLL<TreeNode<Integer>>();
        mq.enqueue(root);
        QueueUsingLL<TreeNode<Integer>> cq = new QueueUsingLL<TreeNode<Integer>>();
        while(mq.size()>0)
        {
            try{
            TreeNode<Integer> node = mq.dequeue();
            
            System.out.print(node.data+" ");
            
            for(TreeNode<Integer> child:node.children)
            {
                cq.enqueue(child);
            }
            
            if(mq.size()==0)
            {
                mq=cq;
                cq = new QueueUsingLL<TreeNode<Integer>>();
                System.out.println();
            }
        
        }catch (QueueEmptyException e) {
			}

	}
		
}
}


