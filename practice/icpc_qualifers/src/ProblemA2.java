import java.util.ArrayList;
import java.util.Scanner;


public class ProblemA2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		for(int i = 1; i <= p; i++)	{
			int count = 0;
			int datasetNo = sc.nextInt();
			ArrayList<Integer> line = new ArrayList<Integer>();
			for (int j = 0; j < 20; j++) {
				int height = sc.nextInt();
				int index = 0;
				for (Integer student : line) {
					if (student > height) continue;
					index+=1;
				}
				count += line.size() - index;
				line.add(index, height);
			}
			
			
			System.out.println(i + " " + count);
		}
	}
}