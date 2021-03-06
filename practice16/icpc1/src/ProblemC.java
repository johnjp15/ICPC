//Nathan
//No, wrong answer.

import java.util.Scanner;

public class ProblemC	{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String alphabet = "PQWERTYUIOJ#SZK*?F@D!HNM&LXGABCV";
		
		int p = sc.nextInt();
		
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			double d = sc.nextDouble();
			
			String bytes = "";
			
			if (d < 0) {
				bytes += "1";
				d += 1;
			} else {
				bytes += "0";
			}
			
			if (d > 1) {
				System.out.println(n + " " + "INVALID VALUE");
			}
			
			double sub = 0.5;
			for (int i = 0; i < 16; i++) {
				if (d >= sub) {
					d -= sub;
					bytes += "1";
				} else {
					bytes += "0";
				}
				sub /= 2;
			}
			if (d > 0.0000000000000001) { bytes = bytes.substring(0, bytes.length()-1) + "1"; }
			
			
			System.out.print(n + " ");
			System.out.print(alphabet.charAt(binaryToInt(bytes.substring(0, 5))) + " ");
			System.out.print(binaryToInt(bytes.substring(5,16)) + " ");
			if (bytes.charAt(16) == '0') {
				System.out.println("F");
			} else {
				System.out.println("D");
			}
			
		}
	}
	
	private static int binaryToInt(String s) {
		int ret = 0;
		int add = 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				ret += add;
			}
			add *= 2;
		}
		return ret;
	}

}
