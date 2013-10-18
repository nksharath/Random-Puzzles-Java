import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

class primeLimits {
	public int x;
	public int y;
	public int leastcost;

	public primeLimits(int x, int y) {
		this.x = x;
		this.y = y;
		leastcost = 0;

	}
}

public class Problem2 {
	LinkedHashSet<Integer> primes = new LinkedHashSet();

	void generatePrimes(int x, int y) {
		for (int i = x; i <= y; i++) {
			boolean flag = false;
			for (int j = 2; j < i / 2; j++) {
				if ((i % j) == 0) {
					flag = true;
					break;
				}
			}
			if (!flag)
				primes.add(i);

		}
	}

	Vertex[] bfs(Vertex[] graph, Vertex root) {
		for (int i = 0; i < graph.length; i++) {
			graph[i].color = "white";
			graph[i].distance = -1;
			graph[i].parent = -1;
		}
		root.color = "gray";
		root.distance = 0;
		root.parent = -1;

		LinkedList<Vertex> queue = new LinkedList();
		queue.add(root);
		while (!queue.isEmpty()) {
			Vertex u = queue.remove();

			for (int v : graph[u.node].neighbours) {
				Vertex V = graph[v];

				if (V.color.equals("white")) {
					V.color = "gray";
					V.distance = u.distance + 1;
					V.parent = u.node;
					queue.add(V);
					graph[v] = V;
					// System.out.println("Visited "+V.node);
				}
			}
			u.color = "black";
		}

		return graph;

	}

	public static void main(String args[]) {

		Problem2 obj = new Problem2();

		Vertex[] graph = new Vertex[4];

		Scanner input = new Scanner(System.in);

		int n = Integer.parseInt(input.nextLine());
		primeLimits[] cases = new primeLimits[n];

		for (int i = 0; i < n; i++) {
			String in = input.nextLine();
			String[] arr = in.split(" ");
			cases[i] = new primeLimits(Integer.parseInt(arr[0]),
					Integer.parseInt(arr[1]));
		}

		int min = cases[0].x;
		int max = cases[0].y;

		for (int i = 0; i < cases.length; i++) {
			if (cases[i].x < min)
				min = cases[i].x;

			if (cases[i].y > max)
				max = cases[i].y;

		}

		obj.generatePrimes(min, max);
		int bucket = 1000;
		HashMap<Integer,ArrayList<Integer>> map=new HashMap();
		int key=cases[0].x;
		for (int i = 0; i < graph.length; i++) 
		{
			int count=0;	
			int digit=0;
			
			for (int j = cases[0].x; j < cases[0].y; j += bucket) 
			{		
				if(digit>9)
					break;
				
				if (obj.primes.contains(j)) 
				{
					if(count==0)
					{
						if(!map.containsKey(j))
						{
						key=j;
						count++;
						System.out.println("Key "+key);
						map.put(key,new ArrayList());
						}
						
					}
					else
					{
						map.get(key).add(j);
						
					}
					
						
				}
			}
			bucket = bucket / 10;
			
		}

		//for(int i=0;i<map.size();i++)
		{
			System.out.println(map.get(1039));
		}
		
		//Vertex []result=obj.bfs(graph,graph[0]);
		
//		for(int i=0;i<result.length;i++)
//		{
//			Vertex temp=result[i];
//			if(temp.node==cases[0].y)
//				System.out.println(temp.d);
//		}

		// System.out.println(graph[1].neighbours);

		// System.out.println("Min "+min+" Max "+max);

		// for(int i=0;i<cases.length;i++)
		// {
		// System.out.println(cases[i].x+" "+cases[i].y);
		// }

	}
}
