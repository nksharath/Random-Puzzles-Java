import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class dfsObj {

	int time;
	static LinkedHashSet<Integer> sequence=new LinkedHashSet();

	Vertex[] dfs(Vertex[] graph) {
		for (Vertex u : graph) {
			u.color = "white";
			u.parent = -1;

		}
		time = 0;
		for (Vertex u : graph) {
			if (u.color.equals("white"))				
			dfsvisit(graph, u);
		}
		return graph;
	}

	void dfsvisit(Vertex[] graph, Vertex u) {
		time = time + 1;
		u.d = time;
		u.color = "grey";
		for (int v : graph[u.node].neighbours) {
			Vertex V = graph[v];
			if (V.color.equals("white")) {
				V.parent = u.node;
				dfsvisit(graph, V);
			}
			u.color = "black";
			time = time + 1;
			u.f = time;
			sequence.add(u.node);

		}
	}

	public static void main(String args[]) {
		System.out.println("Enter the number of vertex");
		Scanner input = new Scanner(System.in);

		int nvertex = Integer.parseInt(input.nextLine());
		Vertex[] adj = new Vertex[nvertex];
		for (int i = 0; i < nvertex; i++) {
			String readLine = (input.nextLine());
			String[] edges = readLine.split(" ");

			int index = Integer.parseInt(edges[0]);
			adj[index] = new Vertex();
			adj[index].node = index;

			for (int j = 0; j < edges.length; j++) {
				adj[index].neighbours.add(Integer.parseInt(edges[j]));
			}

		}
		for (int i = 0; i < adj.length; i++)
			System.out.println(adj[i].neighbours);

		Vertex[] graph = new dfsObj().dfs(adj);

		System.out.println("Parent of 7 is " + graph[7].parent);

		LinkedList<Integer> path = new LinkedList<Integer>();

		int k = 7;
		while (graph[k].parent != -1) {

			path.add(graph[k].parent);
			k = graph[k].parent;

		}

		System.out.println("Path from 0 to 7" + path);
		System.out.println(sequence);
	}

}
