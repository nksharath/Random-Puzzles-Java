import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class bfs {
	
	int n;
	ArrayList<Integer>[] adj;
	
	public bfs(int n) {
		this.n=n;
		adj=new ArrayList[n];
		for(int i=0;i<n;i++)
			adj[i]=new ArrayList<Integer>();
	}
	
	void addEdge(int i,int j)
	{
		adj[i].add(j);
	}
	
	void removeEdge(int i,int j)
	{
		Iterator<Integer> it=adj[i].iterator();
		while(it.hasNext())
		{
			if(it.next()==j)
			{
				it.remove();
				return;
			}
		}
	}
	
	boolean hasEdge(int i,int j)
	{
		return adj[i].contains(j);
	}
	
	ArrayList<Integer> outEdges(int i)
	{
		return adj[i];
	}
	
	ArrayList<Integer> inEdges(int i)
	{
		ArrayList<Integer> edges=new ArrayList<Integer>();
		for(int j=0;i<n;j++)
		{
			if(adj[j].contains(i))
				edges.add(j);
		}
		return edges;
	}
	
	ArrayList<Integer> dobfs(int root)
	{
		ArrayList<Integer> sequence=new ArrayList<Integer>();
		boolean seen[]=new boolean[n];
		for(int i=0;i<seen.length;i++)
			seen[i]=false;
		
		LinkedList<Integer> queue=new LinkedList();
		
		queue.add(root);
		seen[root]=true;
		sequence.add(root);
		
		while(!queue.isEmpty())
		{
			int i=queue.remove();
			for(Integer j : outEdges(i))
			{
				if(!seen[j])
				{
					queue.add(j);
					seen[j]=true;
					sequence.add(j);
				}
			}
		}
		
		
		return sequence;
	}
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of Vertex");
		int nvertex=Integer.parseInt(input.nextLine());
//		System.out.println("Enter the number of edges");
//		int nedges=Integer.parseInt(input.nextLine());
		bfs graph=new bfs(nvertex);
		for(int i=0;i<nvertex;i++)
		{
			String line=input.nextLine();
			String []edges= line.split(" ");
			int vertex=Integer.parseInt(edges[0]);
			for(int j=0;j<edges.length;j++)
				graph.addEdge(vertex, Integer.parseInt(edges[j]));				
			
		}
		
		for(int i=0;i<graph.adj.length;i++)
		System.out.println(graph.adj[i]);
		
		System.out.println(graph.dobfs(0));
		
		
		
	}

}
