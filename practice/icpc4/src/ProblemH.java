import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ProblemH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casenum = 1;
		while(true)
		{
			String line1 = sc.nextLine().trim();
			String line2 = sc.nextLine().trim();
			
			if(line1.equals("END") && line2.equals("END"))	{break;}
			
			ArrayList<String> sort1 = new ArrayList<String>();
			ArrayList<String> sort2 = new ArrayList<String>();
			
			
			for(char c : line1.toCharArray())	{
				sort1.add(Character.toString(c));
			}
			for(char c : line2.toCharArray())	{
				sort2.add(Character.toString(c));
			}
			
			Collections.sort(sort1);
			Collections.sort(sort2);
			
			boolean match = (sort1.toString().equals(sort2.toString()));
			
			System.out.println("Case " + (casenum++) + ": " + (match ? "same" : "different"));
			
		}
		
		sc.close();
	}

}
