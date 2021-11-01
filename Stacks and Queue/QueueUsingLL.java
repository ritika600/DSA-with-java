public class Queue {
	
	Node front;
    Node rear;
    int size;


	public Queue() {
		front = null;
        rear = null;
        size = 0;
	}
	public int getSize() { 
		return size;
    }


    public boolean isEmpty() { 
    	return (size == 0);
    }


    public void enqueue(int data) {
        Node toAdd = new Node(data);
        if(size == 0) {
            front = toAdd;
            rear = toAdd;
        } else {
            rear.next = toAdd;
            rear = toAdd;
        }
        size++;
    }


    public int dequeue() {
        if(size == 0) {
            return -1;
        }
    	Node delete = front;
        front = front.next;
        size--;
        if(size == 0) {
            rear = null;
        }
        return delete.data;
        
    }


    public int front() {
    	if(size == 0) {
            return -1;
        }
        return front.data;
    }
}
