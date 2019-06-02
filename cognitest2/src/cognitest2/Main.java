package cognitest2;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of details to be entered");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the detail in csv format");
		String details[]=new String[n];
		for(int i=0;i<n;i++) {
			details[i]=br.readLine();
		}
		FitnessProgramBO fpbo=new FitnessProgramBO();
		ArrayList<FitnessProgram> fpl=new ArrayList<FitnessProgram>(); 
		for(int i=0;i<n;i++) {
			fpl.add(fpbo.createFitnessProgram(details[i]));
		}
		fpbo.sortByDuration(fpl);
		System.out.printf("\n%-20s %-15s %-20s %-20s %s\n","Name","Duration","Description","FitnessCenter","Cost");
		fpbo.displayList(fpl);
	}

}
