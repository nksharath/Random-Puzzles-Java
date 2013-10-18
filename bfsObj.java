import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class Vertex
{
	public int node;
	public String color;
	public int distance;
	public int parent;
	public int d;
	public int f;
	ArrayList<Integer> neighbours;
	
	public Vertex() {
		color="white";
		distance=-1;
		parent=-1;
		d=0;
		f=0;
		neighbours=new ArrayList<Integer>();
	}
	public Vertex(int node) {
		this.node=node;
		color="white";
		distance=-1;
		parent=-1;
		d=0;
		f=0;
		neighbours=new ArrayList<Integer>();
	}
}
public class bfsObj 
{
	Vertex[] bfs(Vertex[] graph,Vertex root)
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i].color="white";
			graph[i].distance=-1;
			graph[i].parent=-1;			
		}
		root.color="gray";
		root.distance=0;
		root.parent=-1;
		
		LinkedList<Vertex> queue=new LinkedList();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Vertex u=queue.remove();
			
			for(int v : graph[u.node].neighbours)
			{
				Vertex V=graph[v];
				
				if (V.color.equals("white"))
				{
					V.color="gray";
					V.distance=u.distance+1;
					V.parent=u.node;
					queue.add(V);
					graph[v]=V;
					//System.out.println("Visited "+V.node);
				}
			}
			u.color="black";
		}
		
		return graph;
		
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Enter the number of vertex");
		Scanner input=new Scanner(System.in);
		
		int nvertex=Integer.parseInt(input.nextLine());
		Vertex []adj=new Vertex[nvertex];
		for(int i=0;i<nvertex;i++)
		{
			String readLine=(input.nextLine());
			String []edges=readLine.split(" ");
			
			int index=Integer.parseInt(edges[0]);
			adj[index]=new Vertex();
			adj[index].node=index;
			
			for(int j=0;j<edges.length;j++)
			{
				adj[index].neighbours.add(Integer.parseInt(edges[j]));
			}
				
		}
		for(int i=0;i<adj.length;i++)
		System.out.println(adj[i].neighbours);
		
		Vertex []graph=new bfsObj().bfs(adj,adj[0]);
		

		System.out.println("Parent of 7 is "+graph[7].parent);
		
		
		LinkedList<Integer> path=new LinkedList<Integer>();
		
		int k=7;
		while(graph[k].parent!=-1)
		{
			
			path.add(graph[k].parent);
			k=graph[k].parent;
			
			
		}
		
		System.out.println("Path from 0 to 7"+path);
	}

}
