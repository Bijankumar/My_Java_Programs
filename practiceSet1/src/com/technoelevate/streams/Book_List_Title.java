package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Filter a list of books by a specific genre and return the book titles.

class Books {
	String name;
	String gener;

	public Books(String name, String gener) {
		this.name = name;
		this.gener = gener;
	}

	public String getGener() {
		return gener;
	}


	@Override
	public String toString() {
		return "Books [name=" + name + ", gener=" + gener + "]";
	}

}

public class Book_List_Title {
	public static void main(String[] args) {
		List<Books> list = Arrays.asList(new Books("Geeta", "Devotional"), 
										 new Books("Ramayana", "Devotional"),
										 new Books("Bhagabata", "Devotional"),
										 new Books("Grandma's Bag", "Story"),
										 new Books("Panchatatnra", "Story"),
										 new Books("Bad Times", "Story"),
										 new Books("Life Of Pi", "Animation"));
		
		list.stream().filter(e -> e.getGener().equals("Animation")).forEach(System.out::println);
	}
}
