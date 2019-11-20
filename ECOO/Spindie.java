import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		for(int t=0; t<10; t++){
			HashMap <Integer, Integer> s=new HashMap <Integer, Integer>();
			int[]z=new int[5];
			int n=sc.nextInt();
			int total = 0;
			for(int i=0; i<n; i++){
				int temp=sc.nextInt();
				if(!s.containsValue(temp)){
					s.put(total, temp);
					total++;
				}
			}
			for(int i=0; i<5; i++){
				z[i]=sc.nextInt();
			}
			for(int a=0; a<total; a++){
				for(int b=0; b<total; b++){
					int temp1 = s.get(a)*s.get(b);
					int temp2 =s.get(a)+s.get(b);
					for(int i=0; i<5; i++){
						//26*(11+26)=962
						if(z[i]==-1)continue;
						if(s.containsValue(z[i]-temp1)||s.containsValue(z[i]-temp2)){
							z[i]=-1;
						}
						//if()
						if((temp1!=0&&z[i]%temp1==0&&s.containsValue(z[i]/temp1))||(temp2!=0&&z[i]%temp2==0&&s.containsValue(z[i]/temp2))){
							z[i]=-1;
						}
					}
					if(z[0]==-1&&z[1]==-1&&z[2]==-1&&z[3]==-1&&z[4]==-1)break;
				}
				if(z[0]==-1&&z[1]==-1&&z[2]==-1&&z[3]==-1&&z[4]==-1)break;
				
			}
			String out ="";
			for(int i=0; i<5; i++){
				if(z[i]==-1)out=out+"T";
				else out=out+"F";
			}
			System.out.println(out);
		}
		sc.close();
	}
}
