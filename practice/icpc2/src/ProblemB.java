import java.util.ArrayList;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();


		for(int i=0; i < t; i++)	{
			int n = sc.nextInt();

			String[] names = new String[n];
			for (int i2 = 0; i2 < n; i2++) names[i2] = sc.next();

			int d = sc.nextInt();
			sc.nextLine();

			ArrayList<String> data = new ArrayList<String>();
			for (int i3 = 0; i3 < d; i3++) {
				String[] tmp_data = sc.nextLine().replace("\t"," ").split(" ");
				for (String token : tmp_data) data.add(token);
			}
			
			System.out.println("Test set " + (i+1) + ":");
			for (String name : names) {
				System.out.print(name + " is ");
				if (data.contains(name)) {
					System.out.println("present");
				}
				else 
					System.out.println("absent");
			}
			System.out.println();
			
		}
		sc.close();
	}

}
