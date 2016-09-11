import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class ProblemI {
	public static boolean connected(String a, String b) {
		for (char ch : a.toCharArray()) {
			a = a.replaceFirst(ch+"", "");
			if (b.contains(ch+"")) {
				b = b.replaceFirst(ch+"", "");
			}
		}
		if ((b.length() < 1) || (a.length() == 1 && b.length() == 1 && a.equals(b))) {
			return true;
		}
		return false;
	}
	public static String reverse(String s) {
		String ret = "";
		for (int i = s.length()-1; i >= 0; i--) {
			ret += s.charAt(i);
		}
		return ret;
	}
	public static void main(String[] args) {
		System.out.println(connected("pen","pin"));
		System.out.println(connected("snip","pin"));
		System.out.println(connected("pains","pianos"));
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		HashMap<String, ArrayList<String>> dict = new HashMap<String, ArrayList<String>>(); 
//		for (int i = 0; i < n; i++) {
//			String word = sc.next();
//			Set<String> keys = dict.keySet();
//			dict.put(word, new ArrayList<String>());
//			for (String key : keys) {
//				if (connected(key,word) || connected(reverse(key),word)) {
//					ArrayList<String> keyNewList = dict.get(key);
//					keyNewList.add(word);
//					ArrayList<String> wordNewList = dict.get(word);
//					keyNewList.add(key);
//					dict.put(word, wordNewList);
//					dict.put(key,keyNewList);
//				}
//			}
//		}
//		int m = sc.nextInt();
//		HashMap<String,Boolean> visited = new HashMap<String,Boolean>();
//		for (int i = 0; i < m; i++) {
//			
//		}
	}
}
