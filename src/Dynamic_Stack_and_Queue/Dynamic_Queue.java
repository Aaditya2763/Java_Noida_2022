package Dynamic_Stack_and_Queue;

import Queue_Implementation.Queue_Implementation;

public class Dynamic_Queue extends Queue_Implementation   {
	@Override
public void enqueue(int item) throws Exception {
	if(isFull()) {
		int []newArr=new int [2*arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[(front+i)%arr.length];
		}
		arr=newArr;
		front=0;
	}
	super.enqueue(item);
}
}
