package com.technoelevate.streams;

import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test_Streams {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "two", "three", "four");
		boolean match = stream.anyMatch(s -> s.contains("two")); // returns true
		System.out.println(match);
		
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
		int sum = stream2.reduce(0, Integer::sum, Integer::sum); // returns 15
		System.out.println(sum);
		
		// or
		
		Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
		int sum2 = stream3.reduce(0, (a,b)->a+b); // returns 15
		System.out.println(sum2);
		
		// to reverse string
		String str = "Bijan";
		String rev = str.chars().mapToObj(c->(char)c).reduce("",(a,b)->b+a,(x,y)->y+x);
		System.out.println(rev);
		
		//To avoid null Value
		Stream<String> stream4 = Stream.of("a", "b", null, "c");
		try {
		    stream4.peek(Objects::requireNonNull)// it will fetch all values except  null.
		    					.forEach(System.out::println);
		} catch (NullPointerException e) {
		    System.out.println("null element found"); 
		}

	}
}
