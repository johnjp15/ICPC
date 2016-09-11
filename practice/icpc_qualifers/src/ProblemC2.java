import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProblemC2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case1 = 1;
		while(sc.hasNext())
		{
			boolean agree = true;
			int n = sc.nextInt();
			
			ArrayList<Score> first = new ArrayList<Score>();
			ArrayList<Score> second = new ArrayList<Score>();
			
			for(int i = 1; i <= n; i++)	{
				first.add(new Score(i, sc.nextInt()));
			}
			for(int i = 1; i <= n; i++)	{
				second.add(new Score(i, sc.nextInt()));
			}
			
//			first.sort(new Comparator<Score>()	{
//				public int compare(Score a, Score b)	{
//					return b.getValue() - a.getValue();
//				}
//				
//			});
			
			Collections.sort(first);
			Collections.sort(second);
			
//			System.out.println(first);
//			System.out.println(second);
//			
			int result = -1;
			for(int i = 0; i < n; i++)	{
				if(first.get(i).getIndex() != second.get(i).getIndex())	{
					agree = false;
					result = i + 1;
					break;
				}
			}
			if(agree)	{
				System.out.println("Case " + case1 + ": agree");
			}	else	{
				System.out.println("Case " + case1 + ": " + result);
			}
			
						/*
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
			//*/
			
			
			
			case1++;
		}
		
		sc.close();
	}

}

class Score implements Comparable<Score>
{
	private int index, value;
	public Score(int index, int value)
	{
		this.index = index;
		this.value = value;
	}
	
	public int getIndex()
	{
		return this.index;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public String toString()
	{
		return "(" + index + ", " + value + ")";
	}
	
	public int compareTo(Score s)
	{
//		return this.value - s.value;	//for sorting from least to max
		return s.value - this.value;	//for sorting from max to least
	}
}
