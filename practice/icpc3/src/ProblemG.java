import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemG {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
			
		while (true) {
			int rot = sc.nextInt();
			if (rot == 0)
				break;
			String phrase = sc.next();
			String reversePhrase = new StringBuffer(phrase).reverse().toString();
			String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
			
			String ans = "";
			for (int i = 0; i < reversePhrase.length(); i++) {
				int index = (alpha.indexOf(reversePhrase.substring(i, i+1)) + rot)%alpha.length();
				ans += alpha.substring(index, index+1);
			}
			
			System.out.println(ans);
		}
	}
}
