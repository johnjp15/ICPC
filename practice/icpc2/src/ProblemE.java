import java.util.Scanner;
import java.lang.Math;

public class ProblemE {

	public static void main(String[] args) {

		Scanner infile = new Scanner(System.in);

		int num = 1;
		while (true) {
			boolean gottem = false;
			int N = infile.nextInt();
			if (N == 0)
				break;
			
			System.out.println("Case " + num + ":");
			System.out.println(N + " pencils for " + N + " cents");
			int totalFourthCents = 0;
			for (int i = 1; i <= N/4; i++) {
				for (int j = 2*N; j > 0; j--) {
					for (int k = 4*N; k > 0; k-=2) {
						if (16*i + 2*j + k == 4*N && i + j + k == N) {
							gottem = true;
							System.out.println(i + " at four cents each");
							System.out.println(j + " at two for a penny");
							System.out.println(k + " at four for a penny");
							System.out.println();
						}							
					}
				}
			}
			
			num++;
			if (!gottem) {
				System.out.println("No solution found.");
				System.out.println();
			}
		}
		infile.close();
	}
}
