import java.util.Arrays;
import java.util.Scanner;

public class FourSides {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)	{
			int[] sides = new int[4];
			
			for(int j = 0; j < 4; j++)	{
				sides[j] = sc.nextInt();
			}
			
			Arrays.sort(sides);
			
			if(sides[0] + sides[1] + sides[2] <= sides[3])	{
				System.out.println("Impossible");
			}	else	{
				System.out.println("Possible");
			}
		}
		sc.close();
	}

}
