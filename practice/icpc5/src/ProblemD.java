import java.util.ArrayList;
import java.util.Scanner;

public class ProblemD
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		
		
		for(int i = 1; i <= p; i++)	{
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			
			int first = 1;
			int second = 1;
			int count = 3;
//			ArrayList<Integer> fib = new ArrayList<Integer>();
//			fib.add(1);
//			fib.add(1);
//			
			int seqstart = (first) & m;
			
			boolean foundzero = false;
			
			while(true)
			{
				int currFib = first + second;
				if(currFib % m == 0)	{
					foundzero = true;
				}
				first = second;
				second = currFib;
				
				if(foundzero){
					if(seqstart == (first + second) % m)	{
						break;
					}
					foundzero = false;
				}
				
				count++;
				
				//debug
//				fib.add(currFib);
			}
			
			System.out.println(i + " " + count);
		}
	}
	
//	public static int fibb(int first, int second)
//	{
//		return 
//	}

}
