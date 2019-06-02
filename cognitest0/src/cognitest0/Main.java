package cognitest0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		User u[]=new User[n];
		for(int i=0;i<n;i++) {
			u[i]=new User();
			u[i].setId(Integer.parseInt(br.readLine()));
			u[i].setDob(br.readLine());
			u[i].setSalary(Integer.parseInt(br.readLine()));
		}
		Map<Integer,String> h1=new HashMap<>();
		Map<Integer,Integer> h2=new HashMap<>();
		for(int i=0;i<n;i++) {
			h1.put(u[i].getId(),u[i].getDob());
		}
		for(int i=0;i<n;i++) {
			h2.put(u[i].getId(),u[i].getSalary());
		}
		TreeMap<Integer,Double> res=new TreeMap<>();
		res=UserMainCode.calculaterevisedsalary(h1, h2);
		for(Map.Entry<Integer,Double> e:res.entrySet()) {
			System.out.println(e.getKey());
			System.out.printf("%.0f\n",e.getValue());
		}
	}

}
