import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProblemI
{
	private static int maxX, maxY, count;
	private static int[][] tiles;
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("wet_judge.in"));
		
		while(sc.hasNext())
		{
			int x = sc.nextInt();
			if(x == -1)	{
				break;
			}
			int y = sc.nextInt();
			int t = sc.nextInt();
			int l = sc.nextInt();
			int w = sc.nextInt();
			
			tiles = new int[y + 2][x + 2];	//x and y on regular xy plane
			
			maxX = x;
			maxY = y;
//			value 1 means wet tile
//			value 0 means empty space
//			value -1 means leak
//			value -2 means wall
			
			ArrayList<String> leaks = new ArrayList<String>();
			
			
			for(int i = 0; i < l; i++)	{
				int x0 = sc.nextInt();
				int y0 = sc.nextInt();
				tiles[y0][x0] = -1;
				leaks.add(x0 + " " + y0);
			}
			
			//create walls
			for(int i = 0; i < w; i++)	{
				int x1 = sc.nextInt();
				int y1 = sc.nextInt();
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				
				if(x1 == x2)	{
					int starty = Math.min(y1, y2);
					int endy = Math.max(y1, y2);
					for(int y_coord = starty; y_coord <= endy; y_coord++)	{
						tiles[y_coord][x1] = -2;
//						System.out.println((x1) + ", " + (y_coord));
//						debugView();
					}
//					if(y1 < y2)	{
//						for(int y_coord = y1; y_coord <= y2; y_coord++)	{
//							tiles[y_coord][x1] = -2;
//						}
//					}	else if(y1 > y2)	{
//						for(int y_coord = y2; y_coord <= y1; y_coord++)	{
//							tiles[y_coord][x1] = -2;
//						}
//					}	else	{	//if x2 == x1
//					tiles[y1][x1] = -2;
//					}
				}
				else if(y1 == y2)	{
					int startx = Math.min(x1, x2);
					int endx = Math.max(x1, x2);
					for(int x_coord = startx; x_coord <= endx; x_coord++)	{
						 tiles[y1][x_coord] = -2;
//						 System.out.println((x_coord) + ", " + (y1));
//						debugView();
					}
//					if(x1 < x2)	{
//						for(int x_coord = x1; x_coord <= x2; x_coord++)	{
//							tiles[y1][x_coord] = -2;
//						}
//					}	else if(x1 > x2)	{
//						for(int x_coord = x2; x_coord <= x1; x_coord++)	{
//							tiles[y1][x_coord] = -2;
//						}
//					}	else	{	//if x2 == x1
//						tiles[y1][x1] = -2;
//					}
				}
				else	{	//if they are diagonal coordinates
					if(x1 < x2)	{		//point1 is to the left of point2
						if((y2 - y1) < 0)	{		//slope is negative
//							for(int i = y1; i >= y2; i--)	{
							for(int j = 0; j <= (x2 - x1); j++)	{
								tiles[y1 - j][x1 + j] = -2;
//								System.out.println((x1 + j) + ", " + (y1 - j));
//								debugView();
							}
						}	else	{				//slope is positive
//							for(int i = y1; i <= y2; i++)	{
							for(int j = 0; j <= (x2 - x1); j++)	{
								tiles[y1 + j][x1 + j] = -2;
//								System.out.println((x1 + j) + ", " + (y1 + j));
//								debugView();
							}
						}
					}	else	{		//point2 is to the left of point1
						if((y1 - y2) < 0)	{		//slope is negative
//							for(int i = y2; i >= y1; i--)	{
							for(int j = 0; j <= (x1 - x2); j++)	{
								tiles[y2 - j][x2 + j] = -2;
//								System.out.println((x2 + j) + ", " + (y2 - j));
//								debugView();
							}
						}	else	{				//slope is positive
//							for(int i = y2; i <= y1; i++)	{
							for(int j = 0; j <= (x1 - x2); j++)	{
								tiles[y2 + j][x2 + j] = -2;
//								System.out.println((x2 + j) + ", " + (y2 + j));
//								debugView();
							}
						}
					}
				}
			}
			
			int total_num_of_wet_tiles = 0;
			for(String coords : leaks)	{
				String[] leakCoords = coords.split(" ");
				int xLeak = Integer.parseInt(leakCoords[0]);
				int yLeak = Integer.parseInt(leakCoords[1]);
//				debugView();
				total_num_of_wet_tiles += recurse(xLeak, yLeak, t, 0);
//				recurse(xLeak, yLeak, t, 0);
			}
			
//			System.out.println(total_num_of_wet_tiles);
				/*
			for(int q = tiles.length - 1; q > 0; q--)	{
				for(int r = 0; r < tiles[0].length; r++)	{
					switch(tiles[q][r])	{
					case -2: System.out.print("W");	break;
					case -1: System.out.print("L"); count++;	break;
					case 3: System.out.print("L");	count++;	break;
					case 0: System.out.print("." );	break;
					case 1: System.out.print("x");	count++;	break;
					default:	System.out.print(".");	break;
					}
				}
				
				System.out.println();
			}//*/
			System.out.println(total_num_of_wet_tiles);
//			System.out.println(count);
			
//			for(0 to 2l)
//			for(0 to 4w)
		}
		sc.close();
	}
	
	public static int recurse(int x, int y, int timelimit, int minute)
	{
		if(minute == timelimit)	{
			return 0;
		}
		else if(x > 0 && y > 0 && x <= maxX && y <= maxY)	{
			if(tiles[y][x] == 0 || tiles[y][x] == -1 || tiles[y][x] == 1)	{
				if(tiles[y][x] == 0)	{
					tiles[y][x] = 1;
//					count++;
					return 1 +
							recurse(x, y + 1, timelimit, minute + 1) +
							recurse(x, y - 1, timelimit, minute + 1) +
							recurse(x + 1, y, timelimit, minute + 1) +
							recurse(x - 1, y, timelimit, minute + 1);
				}	else if(tiles[y][x] == -1)	{
					tiles[y][x] = 3;
					return 	1 + recurse(x, y + 1, timelimit, minute + 1) +
							recurse(x, y - 1, timelimit, minute + 1) +
							recurse(x + 1, y, timelimit, minute + 1) +
							recurse(x - 1, y, timelimit, minute + 1);
				}	else if(tiles[y][x] == 1)	{
//					tiles[y][x] = 2;
					return 	recurse(x, y + 1, timelimit, minute + 1) +
							recurse(x, y - 1, timelimit, minute + 1) +
							recurse(x + 1, y, timelimit, minute + 1) +
							recurse(x - 1, y, timelimit, minute + 1);
				}
//				recurse(x, y + 1, timelimit, minute + 1);
//				recurse(x, y - 1, timelimit, minute + 1);
//				recurse(x + 1, y, timelimit, minute + 1);
//				recurse(x - 1, y, timelimit, minute + 1);
			}
		}
		return 0;
	}
	
	public static void debugView()
	{
		System.out.println("DEBUG VIEW: ");
		for(int q = tiles.length - 1; q > 0; q--)	{
			for(int r = 0; r < tiles[0].length; r++)	{
				switch(tiles[q][r])	{
				case -2: System.out.print("W");	break;
				case -1: System.out.print("L"); count++;	break;
				case 3: System.out.print("L");	count++;	break;
				case 0: System.out.print("." );	break;
				case 1: System.out.print("x");	count++;	break;
				default:	System.out.print(tiles[q][r]);	break;
				}
			}
			
			System.out.println();
		}
		System.out.println("END DEBUG\n");
	}
}
