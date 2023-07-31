package com.technoelevate.streamsparactice;

import java.util.Arrays;
import java.util.List;

// Given a list of email addresses, filter out the invalid email addresses using regular expressions.

public class FilterOut_Invalid_Mail {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("bijan@gmail.com", "chakrapani@gmail.com", "pani.gamil.com", "ganesh@gmail", "pavitra.gamil");
		
		System.out.println("Invalid Mail id..");
		list.stream().filter(e->!e.endsWith("@gmail.com")).map(e->"* "+e).forEach(System.out::println);
	}
}
