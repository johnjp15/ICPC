import java.util.Scanner;
import java.util.Stack;


public class ProblemH {
	public static void contFrac(double d) {
		double error = 0.0000000000001;
		String s = "";
		int tmp = 0;
		int count = 0;
		while(true){
			tmp = (int)(d+0.000000001);
			s += tmp + " ";
			d -= tmp;
			count++;
			
			if (d < error) break;
			d = 1/d;
			
			if (count  == 15) break;
		}
		System.out.println(s.substring(0,s.length()-1));
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = -1, n2 = -1;
		int caseNo = 1;
		Stack<Integer> stack = new Stack<Integer>();
		while (sc.hasNext()) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			// making n1 (verified correct)
			for (int i = 0; i < j; i++) {
				stack.push(sc.nextInt());
			}
			n1 = stack.pop();
			while (!stack.empty()) {
				n1 = 1/n1 + stack.pop();
			}
			// making n2 (verified correct)
			for (int i = 0; i < k; i++) {
				stack.push(sc.nextInt());
			}
			n2 = stack.pop();
			while (!stack.empty()) {
				n2 = 1/n2 + stack.pop();
			}
			// output
			System.out.println("Case " + caseNo + ":");
			contFrac(n1+n2);
			contFrac(n1-n2);
			contFrac(n1*n2);
			contFrac(n1/n2);
			caseNo++;
		}
	}
}
