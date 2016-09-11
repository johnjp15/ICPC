import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ProblemB
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		
		for(int i = 1; i <= p; i++)	{
			double n = sc.nextDouble();
			double d = sc.nextDouble();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double f = sc.nextDouble();
			
			double vsum = a + b;
			
			double time = d / vsum;
			
			double dist = time * f;
//			
//			System.out.println(vsum);
//			System.out.println(time);
//			System.out.println(dist);

			NumberFormat formatter = new DecimalFormat("#0.00");
			
			System.out.println(i + " " + formatter.format(dist));
		}
	}

}
