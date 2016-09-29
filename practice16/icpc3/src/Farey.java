//Alan
//No -- Time Limit Exceeded
//No -- Time Limit Exceeded
//program works and returns correct answers, but too slow for ICPC

import java.util.Scanner;

public class Farey {
	public static int gcd (int num, int denom) {
		int curgcd=1;
		int i = num;
		while (i>1) {
			if ((num % i == 0) && (denom % i == 0)) return num;
			i--;
		}
		return curgcd;
	}
	public static int fastgcd (int num, int denom) {
		int g;
		if (denom > num) return fastgcd(denom, num);
		if (denom==0) return num;
		g = fastgcd(denom, num%denom);
		return g;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numsets = sc.nextInt();
		for (int z = 1; z<=numsets; z++) {
			int numelements = 2; //Account for 0, 1
			sc.nextInt();
			int fareynum = sc.nextInt();
			for (int denom = 1; denom <= fareynum; denom++) {
				for (int numer = 1; numer < denom; numer++) {
					if ((numer % 2 == 0) && (denom%2==0)) continue;
					if (fastgcd(numer, denom)>1) continue;
					else {
						//System.out.println(numer + "/" + denom);
						numelements++;
					}
				}
			}
			System.out.println(z + " " + numelements);
		}
	}
}
