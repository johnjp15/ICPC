import java.util.Scanner;



public class ACloseEnough {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		double calories, fat, carbs, protein, top, bottom;
		
		do	{
			
		calories = s.nextInt();
		fat = s.nextInt();
		carbs = s.nextInt();
		protein = s.nextInt();
		
		if (calories + fat + carbs + protein == 0) break;
		if(fat==0) fat=-.5;
		if(carbs==0) carbs=-.5;
		if(protein==0) protein=-.5;
		top = (fat + .5) * 9 + (carbs + .5) * 4 + (protein + .5) * 4;
		if(fat==-.5) fat=.5;
		if(carbs==-.5) carbs=.5;
		if(protein==-.5) protein=.5;
		bottom = (fat - .5) * 9 + (carbs - .5) * 4 + (protein - .5) * 4;
		
		if (calories < top && calories >= bottom) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		}	while(calories + fat + carbs + protein != 0);
		
		s.close();
	}
}
