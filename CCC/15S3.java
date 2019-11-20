import java.io.*;
import java.util.*;

public class Main {
   static int G, P;
	static TreeSet <Integer> tree = new TreeSet <> ();
	static PriorityQueue <Integer> in = new PriorityQueue <> ();
	
	//simplified reader
	static class FastReader{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	int nextInt() throws IOException{
		while(st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}
	}
	
	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		G = sc.nextInt();
		P = sc.nextInt();
		int [] planes = new int [P];
		for(int i = 0; i < P; i++) {
			planes[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= G; i++) {
			tree.add(i);
		}
		
		int counter = 0;
		for(int i = 0; i < P; i++) {
			if(tree.floor(planes[i])!=null) {
				counter++;
				tree.remove(tree.floor(planes[i]));
			}
			else {
				break;
			}
		}
		System.out.println(counter);
		
		
		

	


}

}
