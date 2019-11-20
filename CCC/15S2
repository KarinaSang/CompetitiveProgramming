import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		int j = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int counter = 0;
		char [] size = new char [j];
		for(int i = 0; i < j; i++) {
			size[i] = br.readLine().charAt(0);
		}
		for(int i = 0; i < a; i++) {
			String [] split = br.readLine().split(" ");
			char s = split[0].charAt(0);
			int index = Integer.parseInt(split[1]);
			if(size[index-1] <= s) {
				counter++;
				size[index-1] = 999;
			}
		}
		
		System.out.println(counter);
	}

}
