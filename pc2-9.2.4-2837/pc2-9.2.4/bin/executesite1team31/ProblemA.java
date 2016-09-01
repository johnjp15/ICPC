import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
   
		Scanner sc = new Scanner(System.in);
		
		int j = sc.nextInt();
		
		
		for(int k = 1; k <= j; k++)	{
			int n = sc.nextInt();
			
//			int n = Integer.parseInt(input);
			
			int sum = 0;
			
			for(int i = n; i > 0; i--)	{
				sum += (i * (i + 1) / (2));
			}
			
			System.out.println(k + ": " + n + " " + sum);
		}
      sc.close();
	}

}
