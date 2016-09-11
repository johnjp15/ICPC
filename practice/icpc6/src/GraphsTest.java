import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphsTest {

	public static void main(String[] args) {
		
	}

}

class wVertex
{
//	private List<wVertex> edges = new ArrayList<wVertex>();
	private Map<wVertex, Integer> edges = new HashMap<wVertex, Integer>();
	
	private final String name;
	public wVertex previous;
	
	public int minDistance = Integer.MAX_VALUE;
	
	public wVertex(String city)
	{
		this.name = city;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String toString()
	{
		return this.name;
	}
	
	public void addEdge(wVertex city, Integer weight)
	{
		this.edges.put(city, weight);
	}
	
	public Map<wVertex, Integer> getEdges()
	{
		return this.edges;
	}
	
	public int getMinDistance()  { 
        return this.minDistance; }
     public void setMinDistance( int d)  { this.minDistance = d;}
     public int compareTo(wVertex other) { 
        return other.minDistance - this.minDistance; }

}
