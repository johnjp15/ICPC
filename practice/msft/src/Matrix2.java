import java.util.Arrays;
import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int barcount = 0;

		String firstline = sc.nextLine().trim();

		Scanner lineSc = new Scanner(firstline);
		int m = 0;
		int n = 0;
		while(lineSc.hasNext())	{
			String curr = lineSc.next();

			if(curr.equals("|"))	{
				barcount++;
			}	else	{
				if(barcount < 2)	{
					m++;
				}	else	{
					n++;
				}
			}
		}

		System.out.println(n + "x" + m);	//dimensions found

		//first matrix dimension is nxm and second matrix is mxn

		int[][] first = new int[n][m];
		int[][] second = new int[m][n];
		
		int lineNum = 0;
		while(sc.hasNextLine())	{
			String currline = sc.nextLine().trim().replaceAll("\\s","").replaceAll("|", "");
			
			if(lineNum < n && lineNum < m)	{
				for(int i = 0; i < m; i++)	{
					first[lineNum][i] = Integer.parseInt(currline.substring(i, i+1));
				}
				for(int i = m; i < m+n; i++)	{
					second[lineNum][i] = Integer.parseInt(currline.substring(i, i+1));
				}
			}	else	{
				if(n > m)	{
					for(int i = 0; i < m; i++)	{
						first[lineNum][i] = Integer.parseInt(currline.substring(i, i+1));
					}
				}	else	{
					for(int i = 0; i < n; i++)	{
						second[lineNum][i] = Integer.parseInt(currline.substring(i, i+1));
					}
				}
			}
			
			
			lineNum++;
			
		}
		
		System.out.println(first);
	}

}
