package Arrays;

public class Count_Number_of_Characters {
	public static void main(String[] args) {
		String str = "Hii I am Bijan";
		 	   str = str.toLowerCase();
		int [] arr=new int[122];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ')
				arr[ch]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
				System.out.println((char)i+"-->"+arr[i]);
		}
	}
}
