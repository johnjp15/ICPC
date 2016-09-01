import java.util.*;

public class ProblemE
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int numsets = sc.nextInt();
		ArrayList<Integer> number;
		ArrayList<Integer> subnumber = new ArrayList<Integer>();
		for (int set = 1; set <= numsets; set++) {
			number = new ArrayList<Integer>();
			sc.next(); //discard set number
			//Put "number" into this arraylist
			String s = sc.next();
			for (int i = 0; i<s.length(); i++) {
				number.add(Character.getNumericValue(s.charAt(i)));
				//System.out.println(number);
			}
			int swappos = number.size()-1;
			boolean solution = false;
			while (swappos >= 0) {
				for (int swap2pos = number.size()-1; swap2pos>swappos; swap2pos--) {
					//System.out.println("At " + number.get(swappos) + " and " + number.get(swap2pos));
					if (number.get(swap2pos) > number.get(swappos)) {
						//System.out.println("Found valid swap");
						int temp = number.get(swappos);
						number.set(swappos, number.get(swap2pos));
						number.set(swap2pos, temp);
						subnumber = new ArrayList<Integer>();
						for (int j = swappos+1; j<number.size(); j++) {
							subnumber.add(number.get(j));
						}
						subnumber.sort(null);
						solution = true;
						break;
					}
					if (solution) break;
				}
				if (solution) break;
				swappos--;
			}
			if (solution) {
				System.out.print(set + " ");
				for (int j = 0; j<=swappos; j++) {
					System.out.print(number.get(j));
				}
				//System.out.println("Done printing first part");
				for (int k = 0; k<subnumber.size(); k++) {
					System.out.print(subnumber.get(k));
				}
				System.out.print("\n");
			}
			else System.out.println(set + " BIGGEST");
		}
	}
}