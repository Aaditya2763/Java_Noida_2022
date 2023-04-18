package Linked_list;

public class linkedList {
	public class Node{
		int val;
		
		//for student s=new student();
		//here type of s=student;
		//address of node class e.g
	Node next;
	}
	//storing the address of first diaryo-ii
	private Node head;
	private int size;
	private Node tail;
	public void AddFirst(int item) {
		Node nn=new Node();
		nn.val=item;
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
		}
		else {
			nn.next=head;//next me new previous head ka address store kiya 
			//store kiya hai
			head=nn;// head me new node ka address store kiya hai
			size++;
		}
		
	}
	
	private Node GetNode(int k) throws Exception{ //kth index ka address daga
		if(k<0 || k>=size) {
			throw new Exception("Baklol");
		}
		Node temp = head;
		for(int i=0;i<k;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public void Addlast(int item) {
		if(size == 0) {
			AddFirst(item);
		}else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	
	public void Display(){
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.val+"->");
			temp=temp.next;
		}
		System.out.println(".");
	}
	public void getFront(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("Baklol k sahi dal");
		}
		Node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		System.out.print(temp);
		
	}
	public void Addatindex(int item,int k) throws Exception {
		if(k==0) {
			AddFirst(item);
		}else if(k ==size) {
			Addlast(item);
		}else {
			Node nn = new Node();
			nn.val = item;
			Node k_1th = GetNode(k-1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
			
		}
	}
	
	public int getFirst(){
		return head.val;
}
	
	public int getlast(){
		return tail.val;
}
	public int atIndex(int k) throws Exception{
		return GetNode(k).val;
}
	public int removeFirst() {
		Node rv=head;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}
		else {
			head=head.next;
			size--;
			rv.next=null;
		}
		return rv.val;
	}
	
	public int removelast() throws Exception {
		if(size==1) {
			return removeFirst();
		}
		else {
			Node rv=GetNode(size-2);
			int val=tail.val;
			rv.next=null;
			tail=rv;
			size--;
			return val;
		}
	}
	
	public int removeAtIndex(int k) throws Exception {
		if(k==0) {
			return removeFirst();
		}
		else if(k==size-1) {
			removelast();
		}
		else {
			Node k_1th =GetNode(k-1);
			Node kth=k_1th.next;
			k_1th.next=kth.next;
			kth.next=null;
			size--;
			return kth.val;
		}
		return k;
	}
}