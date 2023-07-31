package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionToArray {
public static void main(String[] args) {
	ArrayList l= new ArrayList();
	l.add(121);
	l.add(120);
	l.add(112);
	l.add(150);
	
	for (Object o : l) {
		System.out.print(o+", ");
	}
	System.out.println();
	//or
	System.out.println(Arrays.toString(l.toArray()));
	//or
	System.out.println(l);
	
}
}
