import java.util.ArrayList;
import java.util.Scanner;


public class ProblemD3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		for (int i = 1; i <= caseNum; i++) {
			int K = sc.nextInt();
			int m = sc.nextInt();
			
			ArrayList<Integer> found = new ArrayList<Integer>();
			
			if (!isPrime(m)) {
				System.out.println("NO");
			}
			else {
				int index = 0;
				int sum = 0;
				while (true) {
					String strSum = sum + "";
					if (index == 0) {
						strSum = m+"";
						index += 1;
					}
					
					for (int j = 0; j < strSum.length(); j++) {
						sum += Math.pow(Integer.parseInt(strSum.substring(j, j+1)), 2);
					}
					
					System.out.println(sum);
					
					if (sum == 1) {
						System.out.println("YES");
						break;
					}
					
					else {
						if (found.contains(sum)) {
							System.out.println("NO");
							break;
						}
						found.add(sum);
					}
				}
			}
				
		}
		sc.close();
	}
	
	public static boolean isPrime(int x) {
		if (x == 1)
			return false;
		boolean prime = true;
		for(int i = 2; i <= Math.floor(Math.pow(x, 0.5)); i++) {
			if (x%i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
