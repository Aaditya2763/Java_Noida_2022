package impletationOfStack;

public class Stack_Implementation {
private int arr[];
private int idx=0;;

public Stack_Implementation() {
	arr=new int[5];
}
public Stack_Implementation(int capacity) {
	arr=new int [capacity];
}

public void push(int item) throws Exception {
	if(isFull()) {
		throw new Exception("Stack is full");
	}
	arr[idx]=item;
	idx++;
}

public int  pop() throws Exception {
	if(isEmpty()) {
		throw new Exception("Stack is empty");
	}
	idx--;
return arr[idx];

}

public int peek() throws Exception {
	if(isEmpty()) {
		throw new Exception("Stack is Empty");
	}
	return arr[idx-1];
}

public boolean isFull() {
	return idx==arr.length-1;
}

public boolean isEmpty() {
	return idx==0;
}

public void display() {
	for(int i=0;i<idx;i++) {
		System.out.println(arr[i]);
	}
}


}
