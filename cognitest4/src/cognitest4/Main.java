package cognitest4;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of companies");
		int n=Integer.parseInt(br.readLine());
		String details[]=new String[n];
		for(int i=0;i<n;i++) {
			details[i]=br.readLine();
		}
		for(int i=0;i<n;i++) {
			String s[]=details[i].split(",");
			if(s[0].startsWith("M")) {
				Manufacturer fp=new Manufacturer(s[0],s[1],s[2],s[3],s[4],s[5]);
				System.out.print(i+1+". ");
				fp.display();
			}
			else if(s[0].startsWith("D")) {
				Distributor pfp=new Distributor(s[0],s[1],s[2],s[3],s[4],s[5],s[6]);
				System.out.print(i+1+". ");
				pfp.display();
			}
		}
	}

}
