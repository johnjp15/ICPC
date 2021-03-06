//Nathan
//YES

import java.math.BigInteger;
import java.util.Scanner;

public class ProblemE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numSets = sc.nextInt();
		for (int set = 0; set < numSets; set++) {
			int k = sc.nextInt();
			String[] frac = sc.next().split("/");
			int p = Integer.parseInt(frac[0]);
			int q = Integer.parseInt(frac[1]);
			String seq = "";
			while (p != 1 || q != 1) {
				if (p > q) {
					// right child
					p = p-q;
					seq += "1";
				} else {
					// left child
					q = q-p;
					seq += "0";
				}
			}
			seq += "1";
			
			BigInteger n = new BigInteger(new StringBuilder(seq).reverse().toString(), 2);
			System.out.println(k + " " + n);
		}	
	}
}
