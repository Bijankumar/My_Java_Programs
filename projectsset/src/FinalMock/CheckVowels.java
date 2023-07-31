package FinalMock;

public class CheckVowels {
	public static void main(String[] args) {
		String str = "bijan";
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				flag=true;
		}
		if(flag==true)
			System.out.println("YES");
		else
			System.out.println("No");
	}
}
