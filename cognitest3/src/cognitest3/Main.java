package cognitest3;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int checker;
		FoodProductCertificateBO fpcbo=new FoodProductCertificateBO();
	    List<FoodProductCertificate> foodProductCertificateList=new ArrayList<FoodProductCertificate>();
		do {
			System.out.println("1)Add FoodProductCertificate\n2)Sort by issue date\n3)Sort by expiry date\n4)Delete by certificate code\n5)Exit\nEnter your choice");
		    checker=Integer.parseInt(br.readLine());
		    if(checker==1) {
		    	System.out.println("Enter the number of FoodProductCertificate to be added");	
		    	int n=Integer.parseInt(br.readLine());
		    	for(int i=0;i<n;i++) {
		    		System.out.println("Enter the FoodProductCertificate details('Food Product,certificate code,issue date,expiry date')");
		    		String s=br.readLine();
		    		foodProductCertificateList.add(fpcbo.addFoodProductCertificate(s));
		    		}
		    	}
		    if(checker==2) {
		    	fpcbo.sortOrderByIssueDate(foodProductCertificateList);
		    } if(checker==3) {
		    	fpcbo.sortOrderByExpiryDate(foodProductCertificateList);
		    } if(checker==4) {
		    	System.out.println("Enter the FoodProductCertificate to be deleted");
		    	String certificateCode=br.readLine();
		    	fpcbo.deleteByCertificateCode(foodProductCertificateList, certificateCode);
		    }
		}while(checker!=5);
	}
}