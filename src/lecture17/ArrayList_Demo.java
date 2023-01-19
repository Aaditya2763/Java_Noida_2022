package lecture17;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list=new ArrayList<>();
// or ArrayList<Integer> list=new ArrayList<Integer>();
System.out.println(list);
list.add(1);
list.add(2);
list.add(3);
System.out.println(list);
System.out.println(list.size());
//default capacity of arrayList is 10 and if we want to change we can change it
//Size: current element present currently
//capacity: maximum	 element that can be stored

//to get element we have to use get method
System.out.println(list.get(0));

//add particular element to any particular index
list.add(1,-9);
//1 is index and -9 is element
System.out.println(list);

//remove element form arrayList
System.out.println(list.remove(2));
System.out.println(list);

//if we have to replace any element
list.set(1,-11);
System.out.println(list);

list.add(4);
list.add(5);
list.add(6);
list.add(7);
list.add(8);
list.add(9); 
list.add(10); //autoboxing
System.out.println(list.size());
System.out.println(list);
for(int i=0;i<list.size();i++) {
		
}
	}
}
