
public class GameManager {
	
	
	
	public void addDiscount(Game game) {
		System.out.println(game.getGameName());
	}
	
	public void buyGame(Game game,Gamer gamer) {
		System.out.println(game.getGameName()+" adl� oyun "+ gamer.getFirstName() +" taraf�ndan"+game.getGamePrice()+" sat�n al�nd�.");
		
	}
	
	public void buyGame(Game game,Gamer gamer,Discount discount) {
		System.out.println(game.getGameName()+" adl� oyun "+ gamer.getFirstName() +" taraf�ndan"+game.getGamePrice(discount)+" sat�n al�nd�.");
		
	}
	
	
	
	

}
