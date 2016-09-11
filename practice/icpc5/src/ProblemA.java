import java.util.Scanner;

public class ProblemA
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		
		for(int i = 1; i <= p; i++)	{

			int k = sc.nextInt();
			
			int islandCount = 0;
			int prev = sc.nextInt();
			for(int j = 2; j <= 15; j++)	{
				int curr = sc.nextInt();
				if(curr > prev)	{
					islandCount++;
				}
				prev = curr;
			}
			
			System.out.println(k + " " + islandCount);
		}
	}

}
