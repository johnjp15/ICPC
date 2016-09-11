import java.util.Scanner;

public class Matrix {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
//		String[] line1 = sc.nextLine().trim().split(" ");
		
		
		
//		while(sc.hasNext())	{
//			String curr = sc.next();
//			
//			
//			if(curr.equals("|"))	{
//				matrixNum = 1;
//			}
//		}
		
//		while(sc.hasNextLine())	{
			
//		}
		
		
		
	
		
		while(sc.hasNextLine())	{
			String[] input = sc.nextLine().split("|");
			
			boolean firstMatrix = false;
			
			ArrayList<>
			for(int i = 0; i < input.length; i++)	{
				String curr = input[i];
				if(!curr.equals(" "))	{
					if(curr.equals("|"))	{
						firstMatrix = !firstMatrix;
					}
					if()
				}
			}
		}
		
		System.out.println(input);
		
	}

}
