import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ProblemG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = 0;
		while(true)
		{
			int n = sc.nextInt();
			if(n < 0)	{break;}
			
			double massSum = 0;
			double cx = 0;
			double cy = 0;
			
			for(int i = 0; i < n; i++)	{
				int x = sc.nextInt();
				int y = sc.nextInt();
				int m = sc.nextInt();
			
				massSum += m;
				
				cx += (m * x);
				cy += (m * y);
			}
			
			double a = cx / massSum;
			double b = cy / massSum;
			
			NumberFormat formatter = new DecimalFormat("#0.00");
			
			
			System.out.println("Case " + (++caseNum) + ": " + formatter.format(a) + " " + formatter.format(b));
		}
	}

}
