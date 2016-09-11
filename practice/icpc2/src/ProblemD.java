import java.util.ArrayList;
import java.util.Scanner;

public class ProblemD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int problem_num = 1;
		while(true){
			int n = sc.nextInt();
			if (n == 0) break;

			int[] visited = new int[n*n];
			int[] weights = new int[n*n];
			int[] distances = new int[n*n];

			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					weights[x*n+y] = sc.nextInt();
					distances[x*n+y] = Integer.MAX_VALUE;
					visited[x*n+y] = 0;
				}
			}

			visited[0] = 1;
			distances[0] = weights[0];

			int coord = 0;
			while (coord != n*n-1){
				int new_coord;
				// up
				new_coord = coord - n;
				if (new_coord > 0 && visited[new_coord]!=1) {
					if (distances[new_coord] == Integer.MAX_VALUE) {
						distances[new_coord] = distances[coord]+weights[new_coord];
						if (new_coord == n*n-1) { System.out.println("Problem " + problem_num + ": " + distances[new_coord]); break; }
					}
					else {
						if (distances[new_coord] > distances[coord]+weights[new_coord]) {
							distances[new_coord] = distances[coord]+weights[new_coord];
							if (new_coord == n*n-1) { System.out.println("Problem " + problem_num + ": " + distances[new_coord]); break; }
						}
					}
				}
				// right
				new_coord = coord + 1;
				if (new_coord > 0 && visited[new_coord]==0) {
					if (distances[new_coord] == Integer.MAX_VALUE) {
						distances[new_coord] = distances[coord]+weights[new_coord];
						if (new_coord == n*n-1) { System.out.println("Problem " + problem_num + ": " + distances[new_coord]); break; }
					}
					else {
						if (distances[new_coord] > distances[coord]+weights[new_coord]) {
							distances[new_coord] = distances[coord]+weights[new_coord];
							if (new_coord == n*n-1) { System.out.println("Problem " + problem_num + ": " + distances[new_coord]); break; }
						}
					}
				}
				// down
				new_coord = coord + n;
				if (new_coord > 0 && visited[new_coord]==0) {
					if (distances[new_coord] == Integer.MAX_VALUE) 
						{
						distances[new_coord] = distances[coord]+weights[new_coord];
						if (new_coord == n*n-1) { System.out.println("Problem " + problem_num + ": " + distances[new_coord]); break; }
						}
					else {
						if (distances[new_coord] > distances[coord]+weights[new_coord]) {
							distances[new_coord] = distances[coord]+weights[new_coord];
							if (new_coord == n*n-1) { System.out.println("Problem " + problem_num + ": " + distances[new_coord]); break; }
						}
				}
				}
				// left
				new_coord = coord - 1;
				if (new_coord > 0 && visited[new_coord]==0) {
					if (distances[new_coord] == Integer.MAX_VALUE) {
						distances[new_coord] = distances[coord]+weights[new_coord];
						if (new_coord == n*n-1) { System.out.println("Problem " + problem_num + ": " + distances[new_coord]); break; }
					}
					else {
						if (distances[new_coord] > distances[coord]+weights[new_coord]) {
							distances[new_coord] = distances[coord]+weights[new_coord];
							if (new_coord == n*n-1) { System.out.println("Problem " + problem_num + ": " + distances[new_coord]); break; }
						}
					}
				}

				//update coord
				int min = Integer.MAX_VALUE;
				int min_coord = 0;
				for (int i = 1; i < n*n; i++) {
					if (visited[i]==0 && weights[i] < min){
						min = weights[i];
						min_coord = i;
					}
				}
				coord = min_coord;
				visited[min_coord] = 1;
			}
			problem_num += 1;
		}
	}
}