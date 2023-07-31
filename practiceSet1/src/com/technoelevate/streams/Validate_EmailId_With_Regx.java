package com.technoelevate.streams;
//Given a list of email addresses, filter out the invalid email 
//addresses using regular expressions.

import java.util.Arrays;
import java.util.List;

public class Validate_EmailId_With_Regx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("bijan@gmail.com", "chakra@gmail.com", "pani.com", "ganesh@gmail", "pavitra@gmail.com");
		System.out.println("List of Invalid addresses ..");
		list.stream().filter(e->!e.endsWith("@gmail.com")).map(e->"*"+e).forEach(System.out::println);
	}
}
