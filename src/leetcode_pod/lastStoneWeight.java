package leetcode_pod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lastStoneWeight {
public static void main(String[] args) {
	int []stones = {2,7,4,1,8,1};
	
	System.out.println(weight(stones));
}
public static int weight(int []stones) {
	ArrayList<Integer>list=new ArrayList<Integer>();
	for(int i=0;i<stones.length;i++) {
		list.add(stones[i]);
	}
	while(list.size()>1) {
 Collections.sort(list);
 int n=list.size();
 if(list.get(n-1)==list.get(n-2)) {
	 list.remove(n-1);
	 list.remove(n-2);
 }
 else {
	 int a=list.get(n-1);
	 int b=list.get(n-2);
	 list.remove(n-1);
	 list.remove(n-2);
	 list.add(a-b);
 }
	}
	
	if(list.size()==1) {
		return list.get(0);
	}
	return 0;
	
}
}
