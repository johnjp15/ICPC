import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "";
		while(true) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if (n1==0 && n2==0) {
				break;
			}

			int width = (n1+"").length();
			int height = (n2+"").length();
			ans = "+-";
			for (int i = 0; i < width; i++) {
				ans+="----";
			}
			ans += "--+\n";
			
			ans += "| ";
			for (int i = 0; i < width+1; i++) {
				ans+="   " + (int)(n1/(Math.pow(10, width)));
			}
			ans += "|\n";
			
			for (int i = 0; i < height; i++) {
				ans += "| ";
				for (int j = 0; j < width; j++){
					ans += "+---";
				}
				ans += "+ |\n";
				
				
				ans += "| |";
				for (int j = 0; j < width; j++){
					int m1 = (int)(n1 / Math.pow(10, j));
					int m2 = (int)(n2 / Math.pow(10, i));
					ans += (m1*m2)/10;
					ans += " /|";
				}
				ans+=" |\n";

				ans += "| |";
				for (int j = 0; j < width; j++){
					ans += " / |";
				}
				ans += (int)(n2 / Math.pow(10, i));
				ans+=" |\n";
				
				int finallen = (""+(n1*n2)).length();
				ans += "|";
				if ((""+(n1*n2)).length() == width+height-i) ans+= (""+(n1*n2)).substring(i,i+1);
				else ans += " ";
				ans += "|";
				for (int j = 0; j < width; j++){
					int m1 = (int)(n1 / Math.pow(10, j));
					int m2 = (int)(n2 / Math.pow(10, i));
					ans += "/ ";
					ans += (m1*m2)%10;
					ans += "|";
				}
				ans+=" |\n";
			}

			ans += "| ";
			for (int j = 0; j < width; j++){
				ans += "+---";
			}
			ans += "+ |\n";
			
			ans += "|/";
		}
		System.out.println(ans);
	}

}
