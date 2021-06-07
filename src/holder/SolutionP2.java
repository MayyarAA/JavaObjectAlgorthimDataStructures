package holder;

import java.util.Scanner;
import java.util.*;

public class SolutionP2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int queries = scanner.nextInt();
	        
	        for(int t = 0; t < queries; t++) {
	            
	            // Create a graph of size n where each edge weight is 6:
	            Graph bfs = new Graph(scanner.nextInt(), 6);
	            int m = scanner.nextInt();
	            
	            // read and set edges
	            for(int i = 0; i < m; i++) {
	                int u = scanner.nextInt() - 1;
	                int v = scanner.nextInt() - 1;
	                
	                // add each edge to the graph
	                bfs.graph.get(u).add(v);
	                bfs.graph.get(v).add(u);
	            }
	            
	            // Find shortest reach from node s
	            bfs.shortestReach(scanner.nextInt() - 1);
	        }
	        
	        scanner.close();
	    }
}
