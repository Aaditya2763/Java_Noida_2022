package impletationOfStack;


public class stack_client {
public static void main(String[] args) throws Exception {
	Stack_Implementation st=new Stack_Implementation();
      st.push(10);
      st.push(20);
      st.push(30);
      st.push(40);
     
      st.display();
      
      System.out.println(st.Size());
//      st.push(50);
//     System.out.println(st.pop());
System.out.println(st.peek()); 
}
}
