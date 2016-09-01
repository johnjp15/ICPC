import java.util.ArrayList;
import java.util.Scanner;

public class ProblemB {
   public static Integer[] convertToIntArr(Object[] o) {
      Integer[] i = new Integer[o.length];
      for(int x = 0; x < o.length; x++) {
         i[x] = (Integer)(o[x]);
      }
      return i;
   }
   
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		Integer[] rev;
      while(true){
			ArrayList<Integer> reviews = new ArrayList<Integer>();
			
			int n = sc.nextInt();
			int m = sc.nextInt();
         if (n==0 && m==0) break;
         
			for (int x = 0; x < n; x++) {
				int j = sc.nextInt();
				int c = sc.nextInt();
				for (int y = 0; y < j; y++)
					reviews.add(c);
			}
         rev = convertToIntArr(reviews.toArray());
			for (int z = 0; z < m; z++) {
				int k = sc.nextInt();
				int d = sc.nextInt();
				for (int w = 0; w < k; w++) {
					int d_copy = d;
					for (int v = 0; v < rev.length; v++) {
                  if (d_copy == 0) break;
                  rev[v]--;
						d_copy--;
					}
               ArrayList<Integer> copy = new ArrayList<Integer>();
               for (int u  = 0; u < rev.length; u++) {
                  if (rev[u] != 0) copy.add(rev[u]);
               }
               rev = convertToIntArr(copy.toArray());
				}
			}
			if (rev.length <= 0)
				System.out.println(1);
			else
				System.out.println(0);
		}
		sc.close();
	}
}
