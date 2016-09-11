import java.util.ArrayList;
import java.util.Scanner;

public class ProblemA
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int caseNum = 1;
		
		while (true) {
			ArrayList<Integer> scores = new ArrayList<Integer>();
			int targetScore = sc.nextInt();
			if (targetScore < 0)
				break;
			
			int size = 16;
			for (int i = 0; i < size; i++) {
				int bowl = sc.nextInt();
				if (bowl == 10 && i%2 == 0) {
					size--;
					scores.add(bowl);
					scores.add(0);
				}
				else
					scores.add(bowl);
			}
			
			int totalScore = 0;
			int addStrike = 0;
			int addSpare = 0;
			for (int i = 0; i < scores.size(); i+=2) {
				int first = scores.get(i);
				int second = scores.get(i+1);
				int frameSum = first + second;
				System.out.println(frameSum);
				
				if (first == 10 && addStrike < 2) {
					addStrike++;
				}
				if (second == 10 || frameSum == 10) {
					addSpare++;
				}
				
//				System.out.println(addStrike + " " + addSpare + " " + frameSum);

				if (addStrike == 3)
					totalScore += addStrike*10;
				else if (first != 10 && addStrike == 2)
					totalScore += addStrike*10 + scores.get(i+2);
				else if (addStrike == 1)
					totalScore += addStrike*10 + scores.get(i+2);
				else if (addSpare == 1)
					totalScore += addSpare*10 + scores.get(i+2);
				else if (addStrike == 0 && addSpare == 0 && frameSum < 10) {
					totalScore += frameSum;
				}
				
				System.out.println("Score: " + totalScore);
				
				if (addStrike > 0)
					addStrike--;
				if (addSpare > 0)
					addSpare--;
			}
		}
	}
}

//class Frame
//{
//	private ArrayList<Integer> scores;
//	public Frame(int score1, int score2)
//	{
//		scores = new ArrayList<Integer>();
//		scores.add(score1);
//		scores.add(score2);
//	}
//}
