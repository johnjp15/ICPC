import java.util.Scanner;


public class ProblemB {
	
	public static String output = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = 1;
		while(sc.hasNext())
		{
			boolean nIsNegative = false;
//			boolean rootExists = false;
			Node root = null;
			String traversalToMatch = "";
			
			while(true)
			{
				int n = sc.nextInt();
				if(n < 0)	{
//					nIsNegative = true;
					break;
				}
				if(root == null)	{
					root = new Node(n);
				}	else	{
					insert(root, new Node(n));
				}
				
				traversalToMatch += (n + " ");
			}
//			System.out.println(traversalToMatch);
			preorder(root);
//			System.out.println(output);
			if(traversalToMatch.equals(output))	{
				System.out.println("Case " + caseNum + ": yes");
			}	else	{
				System.out.println("Case " + caseNum + ": no");
			}
			
			output = "";
			caseNum++;
		}
		
	}
	
	//inserts the Node ins into the tree with current as its root Node
	public static void insert(Node current, Node ins)
	{
		if(current == null)	{
			current = ins;
//			System.out.println("current is null");
		}
		if(ins.value < current.value)	{
			if(current.left == null)	{
				current.left = ins;
			}	else	{
				insert(current.left, ins);
			}
		}
		else if(ins.value > current.value)	{
			if(current.right == null)	{
				current.right = ins;
			}	else	{
				insert(current.right, ins);
			}
		}
	}
	
	
	public static void preorder(Node root)
	{
		if(root != null)	{
			output += (root.value + " ");
		}
		if(root.left != null)	{
			preorder(root.left);
		}
		if(root.right != null)	{
			preorder(root.right);
		}
	}
	
	

}

class Node
{
	public Node left, right;
	public int value;
	
	public Node()
	{
		
	}
	
	public Node(int value)
	{
		this.value = value;
	}
	
	public void setLeft(Node left)
	{
		this.left = left;
	}
	
	public void setRight(Node right)
	{
		this.right = right;
	}
}
