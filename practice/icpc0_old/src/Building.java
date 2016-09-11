
public class Building {
	double start;
	double end;
	public Building(double a,double  b, double length) throws Exception {
		if(b<=a) throw new Exception(); 
		start=Math.max(a,  0);
		end=Math.min(b, length);
	}


	public boolean checkOverlap(Building b) {
		return ((start<=b.start||start<=b.end)&&(end>=b.start||end>=b.end));


	}


	@Override
	public String toString() {
		return "Building [start=" + start + ", end=" + end + "]";
	}
	
	public boolean equals(Building other)
	{
		return other.start == start && other.end == end;
		
	}
}
