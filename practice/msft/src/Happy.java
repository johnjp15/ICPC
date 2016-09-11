import java.util.ArrayList;
import java.util.Scanner;

public class Happy {

	public static ArrayList<Integer> checked = new ArrayList<Integer>(); // used to tell if a number has already been checked
	public static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext())	{
			count = 0;
			checked = new ArrayList<Integer>();
			int curr = sc.nextInt();
			
			boolean happy = isHappy(curr);
			
			System.out.println((happy ? "happy " : "unhappy ") + count);
			
//			count = 0;
//			checked = new ArrayList<Integer>();
		}
	}
	
	
	public static boolean isHappy(int i) {
	    if(i == 1)	{
	        return true;
	    }
	    for(int j : checked)	{
	        if(i == j)	{
	            return false;
	        }
	    }
	    String[] num = Integer.toString(i).split("");
	    
	    int nextNum = 0;
	    for(int k = 0; k < num.length; k++)	{
	    	nextNum += Integer.parseInt(num[k]) * Integer.parseInt(num[k]);
	    }
	    checked.add(i);
	    count++;
	    return isHappy(nextNum);
	}
}
