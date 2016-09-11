import java.util.Scanner;


public class ProblemB1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		for(int i = 1; i <= p; i++)	{
			int datasetNo = sc.nextInt();
			int count = 0;
			int[] nums = new int[12];
			for (int j = 0; j < 12; j++) {
				nums[j] = sc.nextInt();
			}
			
			for (int x = 1; x < 11; x++) {
				for (int y=x; y<11; y++) {
					// find min
					int min = Integer.MAX_VALUE;
					for (int z = x; z <= y; z++) {
						if (nums[z] < min) {
							min = nums[z];
						}
					}
					if (min > nums[x-1] && min > nums[y+1]) count+=1;
				}
			}
			
//			int count = 0;
//			int prev = sc.nextInt();
//			for(int j = 2; j <= 12; j++)	{
//				int curr = sc.nextInt();
//				if(curr > prev)	{
//					count++;
//				}
//				prev = curr;
//			}
			
			System.out.println(i + " " + count);
		}

		
	}

}
