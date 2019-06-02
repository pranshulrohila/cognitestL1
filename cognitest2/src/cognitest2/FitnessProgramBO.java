package cognitest2;

import java.util.Collections;
import java.util.List;

public class FitnessProgramBO {
	public FitnessProgram createFitnessProgram(String details) {
		String d[]=details.split(",");
		FitnessProgram fp=new FitnessProgram(Integer.parseInt(d[0]),d[1],Long.parseLong(d[5]),d[3],d[2],d[4]);
		fp.setDays(d[3]);
		return fp;
	}
	public List<FitnessProgram> sortByDuration(List<FitnessProgram> programList){
		Collections.sort(programList);
		return programList;
	}
	public void displayList(List<FitnessProgram> programList) {
		for(int i=0;i<programList.size();i++) {
			System.out.printf("%-20s %-15s %-20s %-20s %s\n",programList.get(i).getName(),programList.get(i).getDuration(),programList.get(i).getDescription(),programList.get(i).getFitnessCenter(),programList.get(i).getCost());
		}
	}
}
