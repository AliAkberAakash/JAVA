package graph;

import java.util.*;

public class TopologicalSort {
	
	public static void main(String[] args) {
		
		int[] inDegree = new int[100];
		int nodes, edges,x,y;
		//int[] list =  new int[100];
		Queue <Integer> list= new LinkedList<>();
		int[][] adj = new int[100][100];
		Scanner scn = new Scanner(System.in);
		
		Queue <Integer> q= new LinkedList<>();
		
		nodes=scn.nextInt();
		edges=scn.nextInt();
		
		for(int i=0; i<edges; i++)
		{
			x=scn.nextInt();
			y=scn.nextInt();
			
			adj[x][y]=1;
			inDegree[y]++;
		}
		
		for(int i=0; i<nodes; i++)
			if(inDegree[i]==0)
				q.add(i);
		
		while(!q.isEmpty())
		{
			int z=q.remove();
			list.add(z);
			
			for(int i=0; i<nodes; i++)
			{
				if(adj[z][i]==1)
				{
					inDegree[i]--;
					if(inDegree[i]==0)
						q.add(i);
				}
			}
			
		}
		
		
		while(!list.isEmpty())
		{
			System.out.print(list.remove());
			if(list.size()!=0)
				System.out.print("->");
		}
		
		scn.close();
		
	}

}
