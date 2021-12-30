import java.util.ArrayList;
public class PQ {
	// Complete this class
    private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		// Implement the isEmpty() function here
        return heap.size() == 0;
	}

	int getSize() {
		// Implement the getSize() function here
        return heap.size();
	}

	int getMax(){
		// Implement the getMax() function here
        if (isEmpty()) {
			// Throw an exception
			return 0;
		}
		return heap.get(0);
	}

	void insert(int element) {
		// Implement the insert() function here
        heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) > heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMax()   {
		// Implement the removeMax() function here
        // Complete this function
// 		// Throw the exception PriorityQueueException if queue is empty
        if (isEmpty()) {
			return 0;
		}
        int temp=heap.get(0);
        heap.set(0,heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int index=0;
        int minIndex=index;
        int leftIndex=1;
        int rightIndex=2;
        while(leftIndex<heap.size()){
        if(heap.get(leftIndex)>heap.get(minIndex)){
            minIndex=leftIndex;
        }
         if(rightIndex<heap.size() && heap.get(rightIndex)>heap.get(minIndex)){
            minIndex=rightIndex;
        }
            if(minIndex==index){
                break;
            }else{
        int temp1 = heap.get(index);
        heap.set(index,heap.get(minIndex));
        heap.set(minIndex,temp1);
        index=minIndex;
            leftIndex=2*index+1;
            rightIndex=2*index+2;
            }
        }
        return temp;
	}
}

// boolean isEmpty() {
// 		return heap.size() == 0;
// 	}

// 	int size() {
// 		return heap.size();
// 	}

// 	int getMin() throws PriorityQueueException {
// 		if (isEmpty()) {
// 			// Throw an exception
// 			throw new PriorityQueueException();
// 		}
// 		return heap.get(0);
// 	}

// 	void insert(int element) {
// 		heap.add(element);
// 		int childIndex = heap.size() - 1;
// 		int parentIndex = (childIndex - 1) / 2;

// 		while (childIndex > 0) {
// 			if (heap.get(childIndex) < heap.get(parentIndex)) {
// 				int temp = heap.get(childIndex);
// 				heap.set(childIndex, heap.get(parentIndex));
// 				heap.set(parentIndex, temp);
// 				childIndex = parentIndex;
// 				parentIndex = (childIndex - 1) / 2;
// 			} else {
// 				return;
// 			}
// 		}
// 	}

// 	int removeMin() throws PriorityQueueException {
// 		// Complete this function
// 		// Throw the exception PriorityQueueException if queue is empty
//         if (isEmpty()) {
// 			// Throw an exception
// 			throw new PriorityQueueException();
// 		}
//         int temp=heap.get(0);
//         heap.set(0,heap.get(heap.size() - 1));
//         heap.remove(heap.size() - 1);
//         int index=0;
//         int minIndex=index;
//         int leftIndex=1;
//         int rightIndex=2;
//         while(leftIndex<heap.size()){
//         if(heap.get(leftIndex)<heap.get(minIndex)){
//             minIndex=leftIndex;
//         }
//          if(rightIndex<heap.size() && heap.get(rightIndex)<heap.get(minIndex)){
//             minIndex=rightIndex;
//         }
//             if(minIndex==index){
//                 break;
//             }else{
//         int temp1 = heap.get(index);
//         heap.set(index,heap.get(minIndex));
//         heap.set(minIndex,temp1);
//         index=minIndex;
//             leftIndex=2*index+1;
//             rightIndex=2*index+2;
//             }
//         }
//         return temp;
// 	}
// 	}
