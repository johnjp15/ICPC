//Nathan
//YES

import java.util.*;

public class ProblemA {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			int r = sc.nextInt();
			String s = sc.next();
			
			String repeated = "";
			for (char ch : s.toCharArray()) {
				for (int i = 0; i < r; i++) {
					repeated += ch;
				}
			}
			
			System.out.println(n + " " + repeated);
		}
	}

}
