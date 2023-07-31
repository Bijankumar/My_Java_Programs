package com.technoelevate.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Methods_ArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(201);
		list2.add(202); // 1. Normal Adding elements
		list2.add(203);
		list2.add(204);
		list2.add(205);

		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(150);
		list3.add(250);
		list3.add(101);
		list3.add(102);
		list3.add(201);
		list3.add(101);

		list3.addAll(list2);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		list.add(3, 10); // 2. Add upon index
		System.out.println("\n" + list);

		list.addAll(list2); // 3. Adding all the elements of another list
		System.out.println(list);

		list2.clear(); // 4. Clear the all the elements from list
		System.out.println(list2);

		boolean x = list.contains(list2); // check the list's all elements is present in current list
		System.out.println(x);

		System.out.println(list.contains(101)); // 5. checks particular element present or not

		System.out.println(list.containsAll(list)); // 6.check the list's all elements is present in current list

		System.out.println(list.hashCode());// 7. Generates has number

		System.out.println(list2.isEmpty()); // 8. It checks the list is empty or not

		System.out.println(list3.lastIndexOf(101)); // 9. it checks the particular value's last repetitive index value

		System.out.println(list3.indexOf(101)); // 10. it checks the first repetitive index value

		list.remove(3); // 11. it removes an element upon index
		System.out.println(list);

		System.out.println(list3.get(5)); // 12. it will fetch element upon index

//		list3.removeAll(list);
		System.out.println(list3); // 13. it will remove all elements

		list.iterator();

		ListIterator<Integer> lis = list.listIterator();
		while (lis.hasNext()) {
			System.out.println("Index " + lis.nextIndex() + " value " + lis.next());
		}

//		list.replaceAll();

		System.out.println(list.retainAll(list3)); //

///		System.out.println(list3.size()); // it will show the length of the list

		while (lis.hasPrevious()) {
			System.out.println("Index " + lis.previousIndex() + " value " + lis.previous());
		}

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("Value " + it.next());
		}
		
	}
}
