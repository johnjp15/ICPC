import java.util.ArrayList;
import java.util.Scanner;


public class Binterstate {
	public static void main(String [] args) {
		ArrayList<Building> a=new ArrayList<Building>();
		double length;
		Scanner s = new Scanner(System.in);
		while ((length = s.nextDouble())>0) {
			while (true)
				try {
					Building b=new Building(s.nextDouble(), s.nextDouble(), length);

					for (int i=0;i<a.size();i++) {
						Building b2 = a.get(i);
						if(b2.checkOverlap(b))	{
							b2.start = Math.min(b.start, b2.start);
							b2.end = Math.max(b.end, b2.end);
						}
						else if (!a.contains(b)){
							a.add(b);
						}}

					if (a.isEmpty() && !a.contains(b))
						a.add(b);
				} 
			catch (Exception e) {break;}
			double total=0;
			for (Building b:a) {
				total+=b.end-b.start;
			}

			a.clear();
			System.out.println("The total planting length is " + String.format("%.1f", (length-total)));
			
		
		}
		s.close();
	}

}
