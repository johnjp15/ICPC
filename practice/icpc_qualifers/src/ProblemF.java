import java.util.Scanner;

public class ProblemF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case1 = 1;
		while(sc.hasNext()) {
			int n = sc.nextInt();
			Integer[] ratings = new Integer[n];
			String str = "";
			
			for (int i = 0; i < n; i++) {
				str+=ratings[i]+"";
			}
			
			int ratingSum = 0;
			for (int i = 0; i < n; i++) {
				ratings[i] = sc.nextInt();
				ratingSum += ratings[i];
			}
			
			long top = ratingSum + n - 1;
			long ans = fact(top) / (fact(n)*fact(top-n));
			
//			for (int i = 0; i <= ratingSum; i++) {
//				for (int j = 0; j < ratings.length; j++) {
//					if (i < ratings[j]) {
//						break;
//					}
//					else {
//						ans += fact(ratingSum + n - 2) / (fact(n-2)*fact(ratingSum));
//					}
//				}
//			}
			
			for (int i = 0; i < str.length(); i++) {
				if (str.substring(i, i+1).equals(i+"")) {
				}
			}
			
			
			System.out.println("Case " + case1 + ": " + ans);
			case1++;
		}
		
		sc.close();
	}
	
	public static long fact(long n) {
		if (n == 1)
			return 1;
		return n*fact(n-1);
	}

}
