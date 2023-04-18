package impletationOfStack;

import java.util.Stack;

public class ReverseStack {
public static void main(String[] args) {
	Stack<Integer>st=new Stack<>();
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	st.push(50);
	System.out.println(st);
	reverse(st);
//	insert_Down(st, 50);
	System.out.println(st);
}
public static void reverse(Stack<Integer>st) {
	if(st.isEmpty()) {
//		st.push(item);
		return;
	}
	int val=st.pop();
	reverse(st);
	insert_down(st,val);
}
public static void insert_down(Stack<Integer>st,int item) {
	if(st.isEmpty()) {
		st.push(item);
		return;
	}
	int val=st.pop();
	insert_down(st, item);
	st.push(val);
}
}
