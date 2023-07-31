import java.util.HashSet;

class Panagram {
	public static void main(String[] args) {
		String str = "abcdef";
		HashSet h = new HashSet();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				h.add(ch);
		}
		if (h.size()== 26)
			System.out.println("It is a Panagram");
		else
			System.out.println("it is not a panagaram");
	}
}