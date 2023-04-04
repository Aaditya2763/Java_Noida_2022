package Queu_Implementation;

public class Queue_Implementation {
private int []arr;
private int front=0;
private int size=0;

public Queue_Implementation() {
	arr=new int [5];
}
public Queue_Implementation(int cap) {
	arr=new int [cap];
}

public boolean isEmpty() {
	return size==0;
}
public void Enqueue(int item) {
	arr[size]=item;
	size++;
}

}