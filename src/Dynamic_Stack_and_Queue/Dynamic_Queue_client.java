package Dynamic_Stack_and_Queue;

public class Dynamic_Queue_client {
public static void main(String[] args) throws Exception {
	Dynamic_Queue Q=new Dynamic_Queue();
	Q.enqueue(10);
	Q.enqueue(20);
	Q.enqueue(30);
	Q.enqueue(40);
	Q.enqueue(10);
	Q.enqueue(20);
	Q.enqueue(30);
	Q.enqueue(40);
	Q.display();
	Q.deQueue();
	Q.deQueue();
	Q.display();
}
}
