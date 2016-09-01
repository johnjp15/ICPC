import java.util.Scanner;



public class FcomboLock {
	public static void main(String[] args)	{
		int n = 0, t1 = 0, t2 = 0, t3 = 0;
		Scanner s = new Scanner(System.in);
		
		do {
			
			
//			if (s.hasNextInt())
				n = s.nextInt();//ticks[0];
//			if (s.hasNextInt())
				t1 = s.nextInt();//ticks[1];
//			if (s.hasNextInt())
				t2 = s.nextInt();//ticks[2];
//			if (s.hasNextInt())
				t3 = s.nextInt();//ticks[3];
			
			int totalticks = 0;
			
			totalticks += n * 2 + (n - 1);
			totalticks += (t1 > t2) ? n + (n - t1) + t2 : n + (t2 - t1); //(n-t1) + t2
			totalticks += (t2 < t3) ? (t2 + (n - t3)) : (t2 - t3);
			if(totalticks >= 0)
				System.out.println(totalticks);
			
			
			
		} while (n + t1 + t2 + t2 != 0);
		s.close();
	}
}
