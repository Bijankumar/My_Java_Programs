package MyPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate_Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String Value");
		char ch[]=sc.next().toLowerCase().toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])==false) {
				map.put(ch[i],1);
			}else {
//				int oldv = map.get(ch[i]);
//				int newv = oldv+1;
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		for (Map.Entry<Character, Integer> entery : map.entrySet()) {
			if (entery.getValue()!=1)
			System.out.println(entery.getKey()+"="+entery.getValue());
		}
	}
}
