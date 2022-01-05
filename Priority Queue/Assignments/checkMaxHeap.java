public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
        return checkMaxHeapHelper(arr,0);
	}
    
    private static boolean checkMaxHeapHelper(int[] arr, int startIndex)
    {
        if(startIndex==arr.length)
            return true;
        
        int parentIndex=startIndex;
        int leftChildIndex=2*parentIndex+1,rightChildIndex=2*parentIndex+2;
        
        boolean leftAns=true,rightAns=true;
        
        if(leftChildIndex<arr.length)
        {
            if(arr[parentIndex]<arr[leftChildIndex])
                return false;
            else
                leftAns=checkMaxHeapHelper(arr,leftChildIndex);
        }
        
        if(rightChildIndex<arr.length)
        {
            if(arr[parentIndex]<arr[rightChildIndex])
                return false;
            else
                rightAns=checkMaxHeapHelper(arr,rightChildIndex);
        }
        
        return (leftAns && rightAns);
            
    }
}
