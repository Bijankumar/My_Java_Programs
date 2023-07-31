package com.technoelevate.optionalclass;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		String name = "Chakra",name2="Chakra";
		Optional optional = Optional.ofNullable(name);
		optional=optional.empty();
		// empty() --> it will remove my value
		System.out.println(optional.get());
		
		System.out.println(name.equals(name2));
		
	}
}
