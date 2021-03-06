//John
//YES

import java.util.Scanner;

public class ProblemD	{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String alphabet = "PQWERTYUIOJ#SZK*?F@D!HNM&LXGABCV";
		
		int p = sc.nextInt();
		
		while(sc.hasNext())
		{
			int num = sc.nextInt();
			String c = sc.next();
			double d = sc.nextDouble();
			String s = sc.next();
			
			
			String result = "";
			//match C
			String retc = "";
			int index = alphabet.indexOf(c);
			for(int exp = 4; exp >= 0; exp--)	{
				double comp = Math.pow(2, exp);
				if(index >= comp)	{
					retc += "1";
					index -= comp;
				}	else	{
					retc += "0";
				}
			}
			
			//d
			String ret11 = "";
			for(int exp = 10; exp >= 0; exp--)	{
				double comp2 = Math.pow(2, exp);
				if(d >= comp2)	{
					ret11 += "1";
					d -= comp2;
				}	else	{
					ret11 += "0";
				}
			}
			
			result = retc + ret11;
			if(s.equals("F"))	{
				result += "0";
			}	else	{
				result += "1";
			}
			
//			System.out.println(result);
			
			//check sign bit
			double out = 0;
			if(Integer.parseInt(result.substring(0, 1)) == 1)	{	//positive
				out = -1.0;
			}
			
			for(int i = 1; i < result.length(); i++)	{
				if(Integer.parseInt(result.substring(i, i + 1)) == 1)	{
					out += Math.pow(0.5, i);
				}
			}
			
			String outS = String.format("%.16f", out);
			while (outS.charAt(outS.length()-1) == '0') {
				outS = outS.substring(0, outS.length()-1);
			}
			if(outS.charAt(outS.length() - 1) == '.')	{
				outS += "0";
			}
			
			System.out.printf("%d " + outS + "\n", num, out);
//			System.out.printf
		}
	}

}


/*post contest notes
 * 
 * BigDecimal
 */
//*/