//Nathan and John
//YES

import java.util.Scanner;

public class ProblemB	{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		
		while(sc.hasNext())
		{
			int num = sc.nextInt();
			long n = sc.nextLong();
			long m = sc.nextLong();
			
			long answer = 1L + m * (n-m);
			
//			int n = sc.nextInt();
//			int m = sc.nextInt();
			
//			int answer = 1 + m * (n - m);
			
			System.out.println(num + " " + answer);
		}
	}

}
