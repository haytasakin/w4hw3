
public class Discount {
	
	//discountu 0 a eþitleyip initial yap diðerleri deðiþtirsin. 
	int id;
	String discountName;
	double discount=0;
	
	
	

	public Discount(int id, String discountName, double discount) {
		super();
		this.id = id;
		this.discountName = discountName;
		this.discount = discount;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDiscountName() {
		return discountName;
	}



	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public void addDiscount() {
		
	}
	public void deleteDiscount() {
		
	}
	public void updateDiscount() {
		
	}
}
