//John and Nathan

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class ProblemD {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		boolean first = true;
		while(sc.hasNext())
		{
			if (!first) {
				System.out.println();
			}
			
			int setNumber = sc.nextInt();
			int m = sc.nextInt();
			int count = 1;
			int printed = 0;
			
			TreeSet<Poo> poops = new TreeSet<Poo>();
			//SortedSet<Poo> poops = new SortedSet<Poo>();
			System.out.println(setNumber + " " + ((m / 2) + 1));
			for(int i = 0; i < m; i++)	{
				Poo fresh = new Poo(sc.nextInt());
				poops.add(fresh);
				if(i % 2 == 0)	{
					if(printed >= 10)	{
						printed = 0;
						System.out.println();
					}
					Object[] sewage = poops.toArray();
					System.out.print(sewage[i / 2] + " ");
					//System.out.print(poops.get());
					printed++;
				}
			}
			
			first = false;
			/*
			count++;
			if(count < p)	{
				System.out.println("TESST");
			}//*/
		}
	}

}

/*
class Tset<E> extends TreeSet<E>
{
	public Tset()
	{
		super();
	}
	public TreeNode
}//*/

class Poo implements Comparable<Poo>
{
	public int value;
	public Poo(int value)
	{
		this.value = value;
	}
	public int compareTo(Poo poo)
	{
		if (this.value > poo.value) {
			return -1;
		}
		return 1;
	}
	public String toString()
	{
		return Integer.toString(this.value);
	}
}