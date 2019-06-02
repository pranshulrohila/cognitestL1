package cognitest0;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class UserMainCode {
	public static TreeMap<Integer,Double> calculaterevisedsalary(Map<Integer,String> h1,Map<Integer,Integer> h2) {
		TreeMap<Integer,Double> tm=new TreeMap<>();
		Map<Integer,Integer> am=new HashMap<>();
        for(Map.Entry<Integer,String> e:h1.entrySet()) {
        	String d[]=e.getValue().split("-");
        	LocalDate l1=LocalDate.of(Integer.parseInt(d[2]),Integer.parseInt(d[1]),Integer.parseInt(d[0]));
        	LocalDate l2=LocalDate.of(2014,9,1);
        	Period diff = Period.between(l1,l2);
        	int age=diff.getYears();
        	am.put(e.getKey(),age);
		}
        for(Map.Entry<Integer,Integer> e:am.entrySet()) {
        	if(e.getValue()>=25 && e.getValue()<=30) {
        		int s=h2.get(e.getKey());
        		tm.put(e.getKey(),(s*1.2));
        	}
        	if(e.getValue()>=31 && e.getValue()<=60) {
        		int s=h2.get(e.getKey());
        		tm.put(e.getKey(),(s*1.3));
        	}
        	if(e.getValue()<25 || e.getValue()>60) {
        		tm.put(e.getKey(), -200.0);
        	}
        	if((e.getValue()<25 || e.getValue()>60) && (h2.get(e.getKey())<5000)) {
        		tm.put(e.getKey(), -100.0);
        	}
        	if(h2.get(e.getKey())<5000){
        		tm.put(e.getKey(),-100.0);
        	}
        }
		return tm;
	}
}
