
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Adding game
		Game game1=new Game(1,"Football Manager",150);
		System.out.println(game1.getGameName()); 
		
		//Adding new Player
		Gamer gamer1= new Gamer(1,"Ali","Veli","12312221222","1993");
		Gamer gamer2= new Gamer(1,"Necip","Kaptan","12312221222","1993");

		Gamer gamer3= new Gamer(1,"Atiba","Ahtapot","12312221222","1993");

		GamerManager gamerManager=new GamerManager();
		
		
		
		//Adding-Updating-Deleting Player
		gamerManager.addGamer(gamer1);
		gamerManager.updateGamer(gamer1,"Delle", "Ali","1332", "1994");
		gamerManager.deleteGamer(gamer1);
		
		//Adding new discounts
		Discount blackFriday= new Discount(1,"Black Friday",10);
		Discount winterDiscount= new Discount(2,"Winter Discount",30);

		//Adding-Updating-Deleting Discounts
		DiscountManager discountManager=new DiscountManager();
		discountManager.addDiscount(blackFriday);
		discountManager.updateDiscount(blackFriday, "Summer", 20);
		discountManager.deleteDiscount(blackFriday);
		
		//Price without Discount
		System.out.println(game1.getGamePrice()); 
		//Price with Discount
		System.out.println(game1.getGamePrice(blackFriday));
		System.out.println(game1.getGamePrice(winterDiscount));

		//buy game without discount-with discount
		GameManager gameManager=new GameManager();
		gameManager.buyGame(game1, gamer3);
		gameManager.buyGame(game1, gamer2,winterDiscount);
		
		
		
	}

}
