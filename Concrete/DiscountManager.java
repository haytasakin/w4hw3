
public class DiscountManager {
	
	public void addDiscount(Discount discount) {
		System.out.println(discount.getDiscountName()+" kampyanyas� eklendi.");
		
	}
	
	public void updateDiscount(Discount discount,String discountName, int discount1) {
		
		discount.setDiscountName(discountName);
		discount.setDiscount(discount1);
		System.out.println(discount.getDiscountName()+"  kampanyas� olarak g�ncellendi.");
		
	}
	
	public void deleteDiscount(Discount discount) {
		System.out.println("Kampanya silindi.");
	}

}
