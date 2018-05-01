package graph;

import java.util.*;

public class GraphRepresentation {

	public static void main(String[] args) {
		boolean[][] Adj = new boolean[100][100];
		int nodes, edges, node1,node2;
		Scanner scn = new Scanner(System.in);
		boolean[] visited = new boolean[100];
		
		Queue<Integer> q = new LinkedList<>();
		
		nodes = scn.nextInt();
		edges = scn.nextInt();
		
		for(int i=0; i<edges; i++)
		{
			node1 = scn.nextInt();
			node2 = scn.nextInt();
			
			Adj[node1][node2]=true;
			Adj[node2][node1]=true;
		}
		
		q.add(0);
		
		visited[0]=true;
		
		while(!q.isEmpty())
		{
			int z=q.remove();
			System.out.println(z);
			
			for(int i=0; i<nodes; i++)
			{
				if(Adj[z][i]==true && visited[i]==false)
				{
					q.add(i);
					visited[i]=true;
				}
			}
		}
		
		scn.close();
		

	}

}
