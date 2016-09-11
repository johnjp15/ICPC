import java.math.BigInteger;
import java.util.Scanner;

public class ProblemH
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		for(int i = 1; i <= k; i++)	{
			int datasetnum = sc.nextInt();
			
			int p = sc.nextInt();
			
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			BigInteger result = comb(new BigInteger(Integer.toString(r)), new BigInteger(Integer.toString(c)));
			
//			result = Math.pow(result, p);
//			result.pow(p);
			long multiplier = (long)Math.pow(p, (r-c));
			
			
			
			System.out.println(i + " " + result.multiply(new BigInteger(multiplier + "")));
		}
		
//		System.out.println(factorial(5));
	}
	
	public static BigInteger factorial(BigInteger num)
	{
		if(num.equals(new BigInteger("1")))	{
			return num;
		}
		return num.multiply(factorial(num.add(new BigInteger("-1"))));
	}
	
	public static BigInteger factorial(BigInteger num, BigInteger limit)
	{
		if(num.equals(limit))	{
			return num;
		}
		return num.multiply(factorial(num.add(new BigInteger("-1")), limit));
	}
	
	public static BigInteger comb(BigInteger n, BigInteger r)
	{
//		BigInteger top = factorial(n);
//		BigInteger bottom = factorial(r).multiply(factorial(n.add(r.negate())));
		
		BigInteger part1 = factorial(n, r.add(new BigInteger("1")));
		
		BigInteger part2 = factorial(n.add(r.negate()));
		
		return part1.divide(part2);
//		return top.divide(bottom);
	}
}
