public class Solution {
  public static void insert(int arr[],int i){
      	
		int childIndex =i;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (arr[childIndex]< arr[parentIndex]) {
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] =  temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}
  public static int del(int arr[],int size){
       int temp=arr[0];
       arr[0]=arr[size-1];
        size--;
        int index=0;
        int leftIndex=2*index+1;
        int rightIndex=2*index+2;
        while(leftIndex<size){
            int minIndex=index;
        if(arr[leftIndex]<arr[minIndex]){
            minIndex=leftIndex;
        }
         if(rightIndex<size && arr[rightIndex]<arr[minIndex]){
            minIndex=rightIndex;
        }
            if(minIndex==index){
                break;
            }else{
        int temp1 = arr[index];
        arr[index]=arr[minIndex];
        arr[minIndex]=temp1;
        index=minIndex;
            leftIndex=2*index+1;
            rightIndex=2*index+2;
            }
        }
        return temp;
  }

	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
        for(int i=0;i<arr.length;i++){
            insert(arr,i);
        }
        for(int i=0;i<arr.length;i++){
           arr[arr.length-1-i]=del(arr,arr.length-i);
        }
        
		
	}
}
