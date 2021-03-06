//Alan

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args)
	{
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int numsets = sc.nextInt();
		for (int i = 0; i<numsets; i++) {
			//System.out.println("In set " + i);
			arlist = new ArrayList<Integer>();
			sc.nextInt(); //Discard dataset number
			int numints = sc.nextInt();
			int max = 0;
			for (int j = 0; j<numints; j++) {
				int cur = sc.nextInt();
				arlist.add(cur);
				if (cur > max) max = cur;
				//System.out.println("Int number " + j);
			}
			//System.out.println("Input done");
			//Time for processing
			int bucket = max;
			int k = 0;
			for (k = bucket; ; k++) {
				//System.out.println("Trying bucket " + k);
				boolean solution = true;
				int tempbucket = k;
				int intpos = 0;
				while (intpos < numints) {
					tempbucket -= arlist.get(intpos);
					//System.out.println("Bucket now " + tempbucket);
					if (tempbucket < 0) {
						solution = false;
						break;
					}
					if (tempbucket == 0) tempbucket = k;
					intpos++;
				}
				//System.out.println("Final bucket is: " + tempbucket);
				if (tempbucket != k) solution = false;
				//System.out.println("Solution?" + solution);
				if (solution) break;
			}
			System.out.println(i+1 + " " + k);
		}
	}

}
