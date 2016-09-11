import java.util.Scanner;
import java.lang.Math;

public class ProblemA {

	public static void main(String[] args) {
		
		Scanner infile = new Scanner(System.in);
      
      while(true) {
         int n = infile.nextInt();
         int w = infile.nextInt();
         int l = infile.nextInt();
         int h = infile.nextInt();
         int area = infile.nextInt();
         int m = infile.nextInt();
            
         if (n == 0 && w == 0 && l == 0 && h == 0 && area == 0 && m == 0)
            break;
            
         int[] subData = new int[m*2];
         for(int i = 0; i < subData.length; i++) {
            subData[i] = infile.nextInt();
         }
         
         int windowSum = 0;
         
         for(int i = 0; i < subData.length; i+=2) {
            windowSum+=subData[i]*subData[i+1];
         }
         
         System.out.println((int)Math.ceil((w*l + 2*h*(w+l) - windowSum) * n / (area+0.0)));
      }
		infile.close();
	}
}
