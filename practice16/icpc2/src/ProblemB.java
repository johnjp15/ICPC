//John
//YES

import java.util.*;

public class ProblemB {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int testcases = sc.nextInt();
		
		for(int t = 0; t < testcases; t++)
		{
			int cases = sc.nextInt();
			for(int c = 0; c < cases; c++)	{
				String name = sc.next();
				String first = sc.next();
				String second = sc.next();
				int classes = sc.nextInt();
				
				Date s = new Date(first);
				Date b = new Date(second);
				
				int eligible = 2;
				boolean petition = false;
//				boolean e = false;
				Student stud = new Student(name, s, b, classes);
				if(stud.study.after(new Date("2009/12/31")))	{
					eligible = 1;
				}	else if(stud.birth.after(new Date("1990/12/31")))	{
					eligible = 1;
				}	else if(stud.courses >= 41)	{
					eligible = 0;
				}	else if(eligible == 2)	{
					petition = true;
				}	else	{
					eligible = 0;
				}
				
				String result;
				switch(eligible)	{
				case 0:	result = "ineligible";
					break;
				case 1: result = "eligible";
					break;
				case 2:	result = "coach petitions";
					break;
				default: result = "ineligible";
					break;
				}
				System.out.println(stud.name + " " + result);
			}
		}
	}

}

class Student
{
	public String name;
	public Date study, birth;
	public int courses;
	public Student(String name, Date study, Date birth, int courses)
	{
		this.name = name;
		this.study = study;
		this.birth = birth;
		this.courses = courses;
	}
	
}