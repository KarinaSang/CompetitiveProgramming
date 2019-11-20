import java.util.*;
import java.io.*;
public class MSTKruskal {
	static int V, E;
	static Edge edge[];
	static Subset subset[];
	//my edge class
	public static class Edge implements Comparable <Edge> {
		int src, dest, weight;
		boolean check;
		
		public int compareTo(Edge edge) {
			return this.weight-edge.weight;
		}
	}
	
	//my subset class
	public static class Subset{
		int parent, rank;
	}
	
	//initialize my graph
	MSTKruskal (int v, int e){
		V = v;
		E = e;
		edge = new Edge [E];
		for(int i = 0; i < E; i++) {
			edge[i] = new Edge ();
		}
	}
	
	//now i do my cycle detecting thing
	static int find (int x) { //this is the find part
		if(subset[x].parent != x) { //if the child is not a parent of itself 
			return find(subset[x].parent); //then we are not at the top yet
		}
		return subset[x].parent;
	}
	
	//yea let's do the union by rank part
	static void union (int x, int y) {
		int xSet = find(x);
		int ySet = find(y);
		
		if(subset[xSet].rank > subset[ySet].rank) { //if x ranks higher
			subset[ySet].parent = xSet; //then x becomes the parent
		}
		else if (subset[ySet].rank > subset[xSet].rank) {
			subset[xSet].parent = ySet;
		}
		else {
			subset[ySet].parent = xSet;
			subset[xSet].rank++; //increase the importance of xSet
		}
	}
	
	//now we finally do Kruskal
	static void Kruskal () {
		//need a bunch of edge to store result
		Edge result [] = new Edge [E];
		//creat our subset
		subset = new Subset [V];
		
		//now initialize them
		for(int i = 0; i < E; i++) {
			result[i] = new Edge ();
		}
		
		for (int i = 0; i < V; i++) {
			subset[i] = new Subset();
			subset[i].parent = i;
			subset[i].rank = 0;
		}
		
		//sort my edges
		Arrays.sort(edge);
		
		int i = 0; //this is acting like an index
		int e = 0; //this too
		while(e < V-1) { //while less than total edge
			Edge newEdge = new Edge ();
			newEdge = edge[i]; //smallest edge for now
			i++;
			
			int x = find(newEdge.src);
			int y = find(newEdge.dest);
			
			if(x!=y) { //then doesn't form a cycle
				result[e] = newEdge;
				union(x, y);
				e++;
			}
			
			//if does form a cycle just discard it
		}
		
	//here we present the solution
		int counter = 0;
		for(i = 0; i< V-1; i++) {
			if(result[i].check == false) {
				counter++;
			}
		}
		
		System.out.println(counter);
		
	}
	
	//this is my main function
	public static void main (String[]args) {
		FastReader sc = new FastReader ();
		V = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();
		//construct the graph now
		MSTKruskal graph = new MSTKruskal (V, M);
		
		//this is input
		for(int i = 0; i < V-1; i++) {
			graph.edge[i].src = sc.nextInt()-1;
			graph.edge[i].dest = sc.nextInt()-1;
			graph.edge[i].weight = sc.nextInt();
			graph.edge[i].check = true;
		}
		
		for(int i = V-1; i < M; i++) {
			graph.edge[i].src = sc.nextInt()-1;
			graph.edge[i].dest = sc.nextInt()-1;
			graph.edge[i].weight = sc.nextInt();
		}
		
		Kruskal();
		
		
	}
	
	static class FastReader
    {
        BufferedReader br;
       StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

}
