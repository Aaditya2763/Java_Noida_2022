package Queue_Implementation;

public class Queue_Implementation {
protected int []arr;
protected int idx=0;
protected int front=0;
 
public Queue_Implementation() {
	arr=new int [5];
}
public Queue_Implementation(int cap) {
	arr=new int [cap];
}

public int Size() {
	return arr.length;
}

public boolean isEmpty() {
	return idx==0;
}

public boolean isFull() {
	return idx==arr.length;
}

public void enqueue(int item) throws Exception {
	if(isFull()) {
		throw new Exception("Queue is Full");
	}
	int i=(idx+front)%arr.length;
	arr[i]=item;
	idx++;
}

public int deQueue() throws Exception {
	if(isEmpty()|| front==arr.length-1) {
		throw new Exception("Queue is Empty");
	}
	int removeVal=arr[front];
	//increasing front  
	front=(front+1)%arr.length;
	//decreasing array size
	idx--;
	return removeVal;
	
}
public int getFront() throws Exception {
	if(isEmpty()) {
		throw new Exception("Queue is Empty");
	}
	return arr[front];
}

public void display(){
	for (int i = 0; i < idx; i++) {
		int idx = (i + front) % arr.length;
		System.out.print(arr[idx] + " ");

	}
	System.out.println();
}





}