package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		LinkedList lList = new LinkedList();
		
		for (int i=0; i<100000; i++) {
			aList.add(i);
			lList.add(i);
		}
		
		System.out.println("ArrayList");
		long start = System.currentTimeMillis();
		for (int i=0; i<aList.size(); i++) {
			aList.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간:"+(end-start));
		
		System.out.println("LinkedList");
		start = System.currentTimeMillis();
		for (int i=0; i<lList.size(); i++) {
			lList.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간:"+(end-start));
	}

}
