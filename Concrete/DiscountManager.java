
public class DiscountManager {
	
	public void addDiscount(Discount discount) {
		System.out.println(discount.getDiscountName()+" kampyanyasý eklendi.");
		
	}
	
	public void updateDiscount(Discount discount,String discountName, int discount1) {
		
		discount.setDiscountName(discountName);
		discount.setDiscount(discount1);
		System.out.println(discount.getDiscountName()+"  kampanyasý olarak güncellendi.");
		
	}
	
	public void deleteDiscount(Discount discount) {
		System.out.println("Kampanya silindi.");
	}

}
