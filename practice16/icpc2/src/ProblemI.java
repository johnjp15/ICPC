//Nathan
//No - wrong answer.

import java.util.Scanner;


public class ProblemI {

	private static int factorial(int n) {
		int x = 1;
		while (n > 0) {
			x *= n;
			n--;
		}
		return x;
	}
	
	private static int teamCombo(int n, int r) {
		return (factorial(n)/(factorial(r)*factorial(n-r)));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testcases = sc.nextInt();

		for (int t = 0; t < testcases; t++) {
			int cases = sc.nextInt();
			for (int c = 0; c < cases; c++) {
				int n = sc.nextInt();
				int r = sc.nextInt();
				r -= 1;
				System.out.println(teamCombo(n,r));
			}
		}
	}
}