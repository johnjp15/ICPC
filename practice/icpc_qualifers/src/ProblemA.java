//import java.util.HashMap;
import java.util.Scanner;


public class ProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = 1;
		double mlog2 = Math.log(2);
		
		while(sc.hasNext()) {
			int n = 0;
			n = sc.nextInt();
			
//			// calculations
			int sum = 0;
			int numberOfRepeats = 1;
			int numTimesRepeated = 1;
			double lastCalc = 0;
			for (int i = 1; i <= n; i++) {
				if (numTimesRepeated == 0) {
					lastCalc = Math.log(i)/mlog2;
					numberOfRepeats *= 2;
					numTimesRepeated = numberOfRepeats;
				}
				sum += Math.floor(lastCalc+1);
				numTimesRepeated -= 1;
			}
//			// end of calculations
			
//			int arith = (int)(Math.floor((Math.log(n)/mlog2) + 1));
//			int sum = 0;
//			for (int i = 0; i < arith; i++) {
//				sum += i*Math.pow(2, i-1);
//			}
//			System.out.println(sum);
			
			System.out.println("Case " + caseNum + ": " + sum);
			caseNum++;
		}
	}
}
