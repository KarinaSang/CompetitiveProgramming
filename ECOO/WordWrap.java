import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int t=0; t<10; t++){
			int len=Integer.parseInt(br.readLine());
			//Queue<String> w = new ArrayDeque<String>();
			String[]w=(br.readLine()).split(" ");
			//String w=br.readLine();
			int n=0;
			
			for(int i=0;i<w.length; i++){
				if(w[i].length()>len){
					if(n!=0)System.out.println();
					System.out.println(w[i].substring(0, len));
					w[i]=w[i].substring(len);
					n=0;
					i--;
				}
				else if(w[i].length()<=len&&n==0){
					System.out.print(w[i]);
					n+=w[i].length();
				}
				else if(w[i].length()<=len-n-1){
					System.out.print(" "+w[i]);
					n+=w[i].length()+1;
				}
				else{
					System.out.println();
					n=0;
					i--;
				}
				
			}
				System.out.println("\n=====");

			
		}
		br.close();
	}
}
