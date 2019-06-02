package cognitest6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of words");
		String s=br.readLine();
		ArrayList<String> ar=new ArrayList<>();
		int n=Integer.parseInt(s);
		String str[]=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=br.readLine();
		}
		for(int i=0;i<n;i++) {
			String ss=str[i];
			int count=0;
			for(int j=0;j<ar.size();j++) {
				if(ar.get(j).equals(ss)) {
					count++;
					break;
				}
			}
			if(count==0) {
				ar.add(ss);
			}
		}
		Map<String,Integer> map =new HashMap<String,Integer>();
		for(String w:str) {
			Integer x=map.get(w);
			x=(x==null)?1:++x;
			map.put(w,x);
		}
		for(String sss:ar) {
			System.out.println(sss+"-"+map.get(sss));
		}
		
}
}
