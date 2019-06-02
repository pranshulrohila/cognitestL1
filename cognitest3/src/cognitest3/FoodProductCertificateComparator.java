package cognitest3;

import java.util.*;

public class FoodProductCertificateComparator implements Comparator<FoodProductCertificate>{
	@Override
	public int compare(FoodProductCertificate p,FoodProductCertificate q) {
		if(p.getExpiryDate().before(q.getExpiryDate())) {
            return -1;
        } else if (p.getExpiryDate().after(q.getExpiryDate())) {
            return 1;
        } else {
            return 0;
        }      
	}
}
