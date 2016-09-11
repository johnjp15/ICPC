import java.util.ArrayList;
import java.util.Scanner;

public class Mind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String header = sc.nextLine();
		
		ArrayList<P> plist = new ArrayList<P>();
		
		while(sc.hasNext())	{
			String mind = sc.next();
			if(mind.equals("END"))	{break;}
			String body = sc.next();
			if(!mind.equals("ALREADY"))	{
				plist.add(new P(mind, body));;
			}
		}
		
		System.out.println(plist);
	}
	
	public void swap(P one, P two)
	{
		String temp = one.body;
		one.body = two.body;
		two.body = temp;
	}

}

class P
{
	public String mind, body;
	public P(String mind, String body)
	{
		this.mind = mind;
		this.body = body;
	}
	public String toString()
	{
		return this.mind + " " + this.body;
	}
	
}
