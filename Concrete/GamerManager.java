
public class GamerManager  {
	
	
	
	
	public void addGamer(Gamer gamer) {
		if(EdevletAdapter.IfRealPerson(gamer)) {
		System.out.println(gamer.getFirstName()+" "+ 
				gamer.getLastName()+" Adl� oyuncu eklendi.");
		}
		else {
			System.out.println("Kullan�c� ge�erli de�il.");
		}
	}
	
	public void updateGamer(Gamer gamer,String firstName,String lastName,String nationalityId,String dateOfBirth) {

		gamer.setFirstName(firstName);
		gamer.setLastName(lastName);
		gamer.setDateOfBirth(dateOfBirth);
	    gamer.setnationalityId(nationalityId);
	    System.out.println("Kullanc� g�ncellendi."+ gamer.getFirstName()+" "+gamer.getLastName());
	}
	
	public void deleteGamer(Gamer gamer) {
		System.out.println("Kullanc� silindi.");
	}

}
