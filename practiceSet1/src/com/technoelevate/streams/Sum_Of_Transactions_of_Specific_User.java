package com.technoelevate.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Given a list of transactions, find the total sum of all transactions for a specific user.

class Bank{
	 String user;
	 int amount;
	public Bank(String user, int amount) {
		this.user = user;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Bank [user=" + user + ", amount=" + amount + "]";
	}
	public String getUser() {
		return user;
	}
	public int getAmount() {
		return amount;
	}
	
}

public class Sum_Of_Transactions_of_Specific_User {
	public static void main(String[] args) {
		List<Bank> list = Arrays.asList(new Bank("Chakra", 5000),
										new Bank("Ram", 3000),
										new Bank("Pani", 5000),
										new Bank("Chakra", 3000),
										new Bank("Ram",	3000),
										new Bank("Mam", 4000),
										new Bank("Chakra", 2000),
										new Bank("Ram", 4000),
										new Bank("Raj", 6000));
		
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter Required user : ");
		String requiredUser = ab.next();
		
		Integer reduce = list.stream().filter(e->e.getUser().equals(requiredUser))
					.map(e->e.getAmount()).reduce(0,(a,b)->a+b);
		
		System.out.println(requiredUser+" : "+reduce);
	}
}
