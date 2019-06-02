package cognitest3;
import java.util.*;
public class FoodProductCertificate implements Comparable<FoodProductCertificate>{
	private String foodProduct;
	private String certificateCode;
	private Date issueDate;
	private Date expiryDate;
	public String getFoodProduct() {
		return foodProduct;
	}
	public void setFoodProduct(String foodProduct) {
		this.foodProduct = foodProduct;
	}
	public String getCertificateCode() {
		return certificateCode;
	}
	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public FoodProductCertificate(String foodProduct, String certificateCode, Date issueDate, Date expiryDate) {
		super();
		this.foodProduct = foodProduct;
		this.certificateCode = certificateCode;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}
	public FoodProductCertificate() {}
	@Override
	public int compareTo(FoodProductCertificate obj) {
		if (this.getIssueDate().compareTo(obj.getIssueDate())==0) return 0;
	     else if (this.getIssueDate().compareTo(obj.getIssueDate())<0) return -1;
	     else return 1;
	}
}
