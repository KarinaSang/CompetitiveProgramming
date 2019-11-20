import java.io.*;
import java.util.*;
public class S407 {
	static Map <Integer, ArrayList <Integer>> graph;
	static int [] sumPath;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		sumPath = new int [n+1];
		Arrays.fill(sumPath, 0);
		graph = new HashMap <> ();
		
		for(int i = 0; i < n+1; i++) graph.put(i, new ArrayList<>());
		String[] x;
		while(true) {
			x = (br.readLine()).split(" ");
			
			int a = Integer.parseInt(x[0]);
			int b = Integer.parseInt(x[1]);
			if(a == 0 && b == 0) break;
			graph.get(a).add(b);
			
		}
		sumPath[1] = 1;
		for(int u = 1; u < n+1; u++)
			for(int i : graph.get(u)) sumPath[i] += sumPath[u];
		System.out.println(sumPath[n]);

	}

}
