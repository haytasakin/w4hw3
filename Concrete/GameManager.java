
public class GameManager {
	
	
	
	public void addDiscount(Game game) {
		System.out.println(game.getGameName());
	}
	
	public void buyGame(Game game,Gamer gamer) {
		System.out.println(game.getGameName()+" adlý oyun "+ gamer.getFirstName() +" tarafýndan"+game.getGamePrice()+" satýn alýndý.");
		
	}
	
	public void buyGame(Game game,Gamer gamer,Discount discount) {
		System.out.println(game.getGameName()+" adlý oyun "+ gamer.getFirstName() +" tarafýndan"+game.getGamePrice(discount)+" satýn alýndý.");
		
	}
	
	
	
	

}
