package cognitest3;
import java.util.*;
import java.text.*;
public class FoodProductCertificateBO {
	public FoodProductCertificate addFoodProductCertificate(String details) throws ParseException{
		String d[]=details.split(",");
		Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(d[2]);
		Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(d[3]);
		FoodProductCertificate fpc=new FoodProductCertificate(d[0],d[1],date1,date2);
		return fpc;
	}
	public void sortOrderByIssueDate(List<FoodProductCertificate> foodProductCertificateList) {
		Collections.sort(foodProductCertificateList);
		print(foodProductCertificateList);
	}
    public void sortOrderByExpiryDate(List<FoodProductCertificate> foodProductCertificateList) {
		Collections.sort(foodProductCertificateList, new FoodProductCertificateComparator());
		print(foodProductCertificateList);
	}
	public void deleteByCertificateCode(List<FoodProductCertificate> foodProductCertificateList,String certificateCode){
		for(int i=0;i<foodProductCertificateList.size();i++) {
			if(foodProductCertificateList.get(i).getCertificateCode().equals(certificateCode)) {
				foodProductCertificateList.remove(i);
			}
		}
		print(foodProductCertificateList);
	}
	public static void print(List<FoodProductCertificate> fpc) {
		if(fpc.size()==0) {
			System.out.println("FoodProductCertificate List is empty");
		}
		else {
			System.out.printf("%-15s%-15s%-15s%-10s\n","FoodProduct","CertificateCode","IssueDate","ExpiryDate");
		    for(FoodProductCertificate f:fpc) {
		    	System.out.printf("%-15s%-15s%-15s%-10s\n",f.getFoodProduct(),f.getCertificateCode(),new SimpleDateFormat("dd-MM-yyyy").format(f.getIssueDate()),new SimpleDateFormat("dd-MM-yyyy").format(f.getExpiryDate()));
		    }
		}
	}
}
