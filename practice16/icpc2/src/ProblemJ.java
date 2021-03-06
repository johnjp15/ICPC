//Nathan
//No - Run-time error.

import java.util.*;

public class ProblemJ {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int NUM_TESTCASES = sc.nextInt();
		
		for(int t = 0; t < NUM_TESTCASES; t++)
		{
			int NUM_CASES = sc.nextInt();
			for(int c = 0; c < NUM_CASES; c++)	{
				int n = sc.nextInt();
				int m = sc.nextInt();
				int[][] problem = new int[m][n];
				
				for (int x = 0; x < m; x++)
					for (int y = 0; y < n; y++)
						problem[x][y] = -1;
				
				sc.nextLine();
				for (int x = 0; x < m; x++) {
					String s = sc.nextLine();
					for (String str : s.split(" v ")) {
						int y = Integer.parseInt(""+str.charAt(str.length()-1));
						if (str.charAt(0) == '~') {
							problem[x][y-1] = 0;
						} else {
							problem[x][y-1] = 1;
						}
					}
				}
				
				
				boolean satisfiable = searchSolution(problem);
				
				if (satisfiable) {
					System.out.println("satisfiable");
				} else {
					System.out.println("unsatisfiable");
				}
				
			}
		}
	}
	private static boolean searchSolution(int[][] problem) {
		int[] solution = new int[problem[0].length];
		for (int x = 0; x < problem[0].length; x++) solution[x] = -1;
		
		return help(problem,solution,0);
	}
	private static boolean help(int[][] problem, int[] solution, int level) {
		if (level == problem.length) return true;
		for (int x = 0; x < problem[0].length; x++) {
			if (problem[level][x] == -1) continue;
			if (problem[level][x] != solution[x] && solution[x] != -1) continue;
			int[] clone = solution.clone();
			clone[x] = problem[level][x];
			if (help(problem,clone,level+1)) return true;
		}
		return false;
	}

}