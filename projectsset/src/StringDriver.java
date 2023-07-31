
public class StringDriver {
	public static void main(String[] args) {
		String str="ABC";//String literal :- String Constant pool area
		String str1="ABC";
		String str2= new String("abc");//String Object:- String non-Constant pool area
		String str3= new String("ABC");
		
		System.out.println(str==str1);
		System.out.println(str==str2);
		System.out.println(str.equals(str3));
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		
		
	}
}
