package searchAndSorts.breadthFirst;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int queries = s.nextInt(); // no. of queries
		for(int q = 0; q<queries;q++){
		int n = s.nextInt();//nodes
		int m = s.nextInt();//edges
		
		int[][] arr = new int[n][n]; // 2D array representation of graph with edge weight 6, each 
		
		for (int i = 0; i < m; i++) { // Populating the array
			int u = s.nextInt()-1;
			int v = s.nextInt()-1;
			arr[u][v] = 6;
			arr[v][u] = 6;
		}
		
		int startNode = s.nextInt() -1; //Starting node
	
		/* If want to print 2D array i.e. graph uncomment it
		 * for(int[] a:arr)
			System.out.println(Arrays.toString(a));*/
		
		
		ArrayList<Integer> al = new ArrayList<>();// to store node traversed.
		
		//Add start node to list
		al.add(startNode);	
		
		int[] path = new int[n];//to store output
		
		// Method to find shortest path
		bfs(arr, al, path, startNode);
		
		// marking -1 for unconnected node 
		for(int i = 0;i<path.length;i++){ 
			if(path[i]==0)
				path[i] = -1;
		}
		
		// Output printing
		for (int i = 0; i < path.length; i++) { 
			if(i != startNode)
			System.out.print(path[i] +" ");
		}
		System.out.println();
		}
		s.close(); // Scanner Closed
	}

	private static void bfs(int[][] arr, ArrayList<Integer> al, int[] path, int startNode) {
		
		// iterate for node 
		for(int i = 0;i<arr.length;i++){
			// Add node to list and calculate its path is it is not visited earlier
			if(arr[startNode][i] !=0 && !al.contains(i)){
				al.add(i);
				path[i] = path[startNode]+ arr[startNode][i];
			}
		}
		
		//Calling back for the next entry in list 
		int index = al.indexOf(startNode);
		if(index< al.size()-1)
		bfs(arr, al, path, al.get(index+1));
		
	}

	
	

}
