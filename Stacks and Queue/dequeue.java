/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue dq = new Dequeue(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/

public class Dequeue {
       
    static final int MAX = 10; 
    int  arr[]; 
    int  front; 
    int  rear; 
    int  size; 
      
    public Dequeue(int size){ 
        arr = new int[MAX]; 
        front = -1; 
        rear = 0; 
        this.size = size; 
    } 
   
    boolean isFull() 
    { 
        return ((front == 0 && rear == size-1)|| 
            front == rear+1); 
    } 
   
    boolean isEmpty () 
    { 
        return (front == -1); 
    } 
   
    void insertFront(int key) 
    { 
        if (isFull()) 
        { 
            System.out.println("-1");  
            return; 
        } 
   
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
          
        else if (front == 0) 
            front = size - 1 ; 
   
        else 
            front = front-1; 
   
        arr[front] = key ; 
    } 
   
    void insertRear(int key) 
    { 
        if (isFull()) 
        { 
            System.out.println("-1"); 
            return; 
        } 
   
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
   
        else if (rear == size-1) 
            rear = 0; 
   
        else
            rear = rear+1; 
          
        arr[rear] = key ; 
    } 
   void deleteFront() 
    { 
        if (isEmpty()) 
        { 
            System.out.println("-1"); 
            return ; 
        } 
   
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else
            if (front == size -1) 
                front = 0; 
   
            else
                front = front+1; 
    } 
   
    void deleteRear() 
    { 
        if (isEmpty()) 
        { 
            System.out.println("-1"); 
            return ; 
        } 
   
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else if (rear == 0) 
            rear = size-1; 
        else
            rear = rear-1; 
    } 
   
    int getFront() 
    { 
        if (isEmpty()) 
        { 
            return -1 ; 
        } 
        return arr[front]; 
    } 
   
    
    int getRear() 
    { 

        if(isEmpty() || rear < 0) 
        { 
            return -1 ; 
        } 
        return arr[rear]; 
    }
}
