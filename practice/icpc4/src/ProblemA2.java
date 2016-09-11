import java.util.ArrayList;
import java.util.Scanner;

public class ProblemA2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int opponentScore = sc.nextInt();

			ArrayList<Score> scores = new ArrayList<Score>();
			
			int limit = 16;
			int doubler = 0;
			
			for(int i = 0; i < limit; i++)	{
				int first = sc.nextInt();
				int second = sc.nextInt();
				
				if(first == 10)	{
					doubler = 2;
				}	else if(first + second == 10)	{
					
				}
				
				
				scores.add(new Score())
			}
		}
	}

}

class Score
{
	private boolean doub;
	private int first, second, third;
	
	public Score(int first, int second, int third, boolean doub)
	{
		this.first = first;
		this.second = second;
		this.third = third;
		this.doub = doub;
	}
	
	public Score(int first, int second, boolean doub)
	{
		this(first, second, 0, doub);
	}
	
	public Score(int first, int second)
	{
		this(first, second, 0, false);
	}
	
	public Score(int score)
	{
		this(score, 0, 0, false);
	}
	
	public boolean isDoubled()
	{
		return this.doub;
	}
	
	public int getTotal()
	{
		int ret = first + second + third;
		return (this.doub) ? 2 * ret : ret;
	}
}