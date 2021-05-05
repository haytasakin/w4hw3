
public class Game {
	
	//discount eklenecek.
	
	int id;
	String gameName;
	double gamePrice;
	double discount;
	
	public Game() {}

	public Game(int id, String gameName, double gamePrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		System.out.println("�r�n fiyat� :");
		return gamePrice;
	}
	public double getGamePrice(Discount discount) {
		
		System.out.println(discount.getDiscountName()+" kampanyas�ndan sonraki fiyat� :");
		return gamePrice-(gamePrice*discount.discount/100);
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	

}
