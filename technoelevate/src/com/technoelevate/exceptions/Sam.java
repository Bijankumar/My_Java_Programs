package com.technoelevate.exceptions;

class Bijan{
	
	private class Dem{
		private int age=50;
//		static int roll=5;
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		 
	}
	Dem dem = new Dem();
	int x=dem.getAge();
}

public class Sam {
	
	public static void main(String[] args) {
		String str = "rajnish kumar singh",res="";
		for (int i = str.length()-1; i >=0; i--) {
			res+=str.charAt(i);
		}
		System.out.println(res);
		
		
		Bijan bijan = new Bijan();
		System.out.println(bijan.x);
	}
}
