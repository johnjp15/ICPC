import java.util.Scanner;



public class ProblemC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case1 = 1;
		while(sc.hasNext())
		{
			boolean agree = true;
			int n = sc.nextInt();
			int[] first = new int[n];
			int[] second = new int[n];
			
			for(int i = 0; i < first.length; i++)	{
				first[i] = sc.nextInt();
			}
			for(int j = 0; j < second.length; j++)	{
				second[j] = sc.nextInt();
			}
			
			//at this point, the arrays have been filled
			int maxfirst = 0;
			int maxsecond = 0;
			for(int i = 0; i < n; i++)	{
				for (int k = 0; k < n; k++) {
					if (first[maxfirst] < first[k]) {
						maxfirst = k;
					}
					if (second[maxsecond] < second[k]) {
						maxsecond = k;
					}
				}
//				System.out.println(maxfirst + ": " + first[maxfirst]);
//				System.out.println(maxsecond + ": " + second[maxsecond]);
				
				first[maxfirst] = -1;
				second[maxsecond] = -1;
				
				if(maxfirst != maxsecond)	{
					System.out.println("Case " + case1 + ": " + (i+1));
					agree = false;
					break;
				}
			}
			if(agree)	{
				System.out.println("Case " + case1 + ": agree");
			}
			
			
			
			case1++;
		}
		
		sc.close();
	}

}
