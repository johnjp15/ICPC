import java.util.Scanner;



public class ProblemD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case1 = 1;
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int T = sc.nextInt();
			
			Integer[] iList = new Integer[n];
			for (int i = 0; i < n; i++) {
				iList[i] = sc.nextInt();
			}
			
			
			int total = 0;
			int num = 0;
			for (int i = 0; i < n; i++) {
				if (total + iList[i] <= T) {
					total += iList[i];
					num += 1;
				}
				else
					break;
			}
			System.out.println("Case " + case1 + ": " + num);
			case1++;
		}
		
		sc.close();
	}

}
