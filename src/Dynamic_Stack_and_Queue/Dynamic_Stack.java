package Dynamic_Stack_and_Queue;

import impletationOfStack.Stack_Implementation;
//we have to change the access modifier to protected
	//because we are not able to access arr in the dynamic Stack
public class Dynamic_Stack extends Stack_Implementation{
@Override
	public void push(int item) throws Exception {
		if(isFull()) {
			int []newArr=new int [2*arr.length];
			for(int i=0;i<arr.length;i++) {
				newArr[i]=arr[i];
			}
			arr=newArr;
		} 
		//if we simply use this
		//push(item);
		//this will give stack overflow error due to recursion
		//we have to use super keyword to access the push function
		super.push(item);
		
	}
	
}
