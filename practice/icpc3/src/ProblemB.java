import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		int house_no = 0;
		while (true) {
			house_no++;
			int w = sc.nextInt();
			int l = sc.nextInt();
			sc.nextLine();

			if (w==0 && l==0) break;

			char[][] house = new char[l][w];
			for (int i = 0; i < l; i++)
				house[i] = sc.nextLine().replace("\n","").toCharArray();

			int traj = 0;
			int x_coord = -1;
			int y_coord = -1;
			for (int i = 0; i < w; i++) {
				if ( house[0][i] == '*') { //start top side
					x_coord = i;
					y_coord = 0;
					traj = 3;
					break;
				}
				if (house[l-1][i] == '*') { //start bottom side
					x_coord = i;
					y_coord = l-1;
					traj = 1;
					break;
				}
			}
			if (x_coord == -1 && y_coord == -1) {
				for (int j = 0; j < l; j++) {
					if ( house[j][0] == '*') { //start left side
						x_coord = 0;
						y_coord = j;
						traj = 0;
						break;
					}
					if (house[j][w-1] == '*') { //start right side
						x_coord = w-1;
						y_coord = j;
						traj = 2;
						break;
					}
				}
			}

			boolean hitwall = false;
			while (!hitwall) {
				switch(traj)	{
					case 0://going east
						x_coord++;
						if(house[y_coord][x_coord] == '/')	{
							traj = 1;
						}	else if(house[y_coord][x_coord] == '\\') {
							traj = 3;
						}	else if(house[y_coord][x_coord] == 'x')	{
							house[y_coord][x_coord] = '&';
							hitwall = true;
						}
						break;
					case 1://going north
						y_coord--;
						if(house[y_coord][x_coord] == '/')	{
							traj = 0;
						}	else if(house[y_coord][x_coord] == '\\') {
							traj = 2;
						}	else if(house[y_coord][x_coord] == 'x')	{
							house[y_coord][x_coord] = '&';
							hitwall = true;
						}
						break;
					case 2://going west
						x_coord--;
						if(house[y_coord][x_coord] == '/')	{
							traj = 3;
						}	else if(house[y_coord][x_coord] == '\\') {
							traj = 1;
						}	else if(house[y_coord][x_coord] == 'x')	{
							house[y_coord][x_coord] = '&';
							hitwall = true;
						}
						break;
					case 3://going south
						y_coord++;
						if(house[y_coord][x_coord] == '/')	{
							traj = 2;
						}	else if(house[y_coord][x_coord] == '\\') {
							traj = 0;
						}	else if(house[y_coord][x_coord] == 'x')	{
							house[y_coord][x_coord] = '&';
							hitwall = true;
						}
						break;
				}
				
			}
			System.out.println("HOUSE " + house_no);
			for (int x = 0; x < l; x++) {
				for (int y =0 ; y< w; y++) {
					System.out.print(house[x][y]);
				}
				System.out.println();
			}
		}
	}

}
