import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicte_Char_Map {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a String Value");
		char []ch = sc.next().toLowerCase().toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			} else {
				map.put(ch[i], 1);
			}
		}
		for (Map.Entry <Character, Integer> entry : map.entrySet()) {
//			if (entry.getValue()!=1) {
				System.out.println(entry.getKey()+"::"+entry.getValue());
//			}
		}
	}
}
