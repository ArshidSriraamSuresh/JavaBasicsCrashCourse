package BasicsJava;

import java.util.LinkedList;
import java.util.List;

public class JavaCollectionsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> linkedlist1 = new LinkedList<Integer>(); // This is wrong.
		//The reference type LIST does not contain addLast method we should use the LinkedList reference.
		// https://stackoverflow.com/questions/26040741/i-am-getting-an-error-on-addfirst-method-why
		LinkedList<Integer> linkedlist1 = new LinkedList<Integer>();
		// append
		linkedlist1.add(8);
		linkedlist1.add(7);
		linkedlist1.add(6);
		linkedlist1.add(5);
		linkedlist1.add(4);
		linkedlist1.add(3);
		linkedlist1.add(2);
		linkedlist1.add(1);
		linkedlist1.add(0);
		System.out.println(linkedlist1);
		// insert can be done in add
		linkedlist1.add(2,0);// 1 - index not the position is the same as index starts from 0, 0 -value.
		System.out.println(linkedlist1);
		linkedlist1.addFirst(2); // not there.
		System.out.println(linkedlist1);
		linkedlist1.addLast(2); // not there.
		System.out.println(linkedlist1);
		// remove first item.
		linkedlist1.remove(0);// 0 is the index same as position
		System.out.println(linkedlist1);
		linkedlist1.removeFirst();
		System.out.println(linkedlist1);
		// remove last item.
		linkedlist1.remove(linkedlist1.size()-1);
		System.out.println(linkedlist1);
		linkedlist1.removeLast();
		System.out.println(linkedlist1);
		System.out.println(linkedlist1.getClass());
		
	}

}
